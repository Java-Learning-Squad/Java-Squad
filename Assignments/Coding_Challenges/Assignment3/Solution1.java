import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "";
        int correctAnswerCount = 0;
        int incorrectAnswerCount = 0;
        int correctConsecAnswers = 0;

        ArrayList<String> animals = askInitialUserInput(input);

        do {
            ArrayList<String> pickedAnimals = pickOneToThreeNames(animals);
            String shuffledString = shuffleString(pickedAnimals);
            String animalsWithUnderscores = handleUnderscores(shuffledString, correctConsecAnswers);
            
            System.out.printf("What are %d animals in \"%s\" ?\n", pickedAnimals.size(), animalsWithUnderscores);
            answer = input.nextLine();

            if(answer.equals("?")){
                for(int i = 0; i < animals.size(); i++){
                    System.out.printf("%d: %s\n", i+1, animals.get(i));
                }
            }

            if(isCorrect(pickedAnimals, answer)){
                System.out.println("Yes!");
                correctAnswerCount++;
                if(correctAnswerCount >= 2){
                    correctConsecAnswers++;
                    correctAnswerCount = 0;
                }

            }else {
                System.out.println("Nope!");
                incorrectAnswerCount++;
                if(incorrectAnswerCount >= 2 && correctConsecAnswers > 0){
                    correctConsecAnswers--;
                    incorrectAnswerCount = 0;
                }
            }
        } while(!answer.equals("quit"));

        System.out.println("Bye...");

        input.close();
    }

    public static boolean isCorrect(ArrayList<String> original, String answer){
        boolean result = true;
        String[] answerArr = answer.trim().split(" ");
        if(original.size() != answerArr.length) return false;
        
        for(String animal : answerArr){
            String trimedAnimal = animal.trim();
            if(original.contains(trimedAnimal)){
                original.remove(trimedAnimal);
            } else {
                return false;
            }
        }
        
        return result;
    }

    public static String shuffleString(ArrayList<String> animalNames){
        String animalNamesInString = "";
        StringBuilder shuffledChar = new StringBuilder();
        List<Character> animalNamesInChar = new ArrayList<Character>();

        for(String animalName : animalNames){
            animalNamesInString += animalName;
        }

        for(char letter : animalNamesInString.toCharArray()){
            animalNamesInChar.add(letter);
        }        
        
        while(animalNamesInChar.size() != 0){
            int randomIndexGen = (int)(Math.random() * animalNamesInChar.size());
            shuffledChar.append(animalNamesInChar.remove(randomIndexGen));
        }

        return new String(shuffledChar);
    }    

    public static ArrayList<String> askInitialUserInput(Scanner input){
        ArrayList<String> names = new ArrayList<String>();
        String[] splitNames;
        String userInput;
        
        while (true){
            System.out.println("Type in at least 5 animal names such as dog, cat etc...");
            userInput = input.nextLine();
            splitNames = userInput.trim().split(" ");
            
            for (int i = 0; i < splitNames.length; i++){
                String element = splitNames[i].trim();
                if(!element.equals("") && !names.contains(element)){
                    names.add(element);
                }
            }
              
            if (names.size() >= 5 && userInput.equals("")){
                break;
            }
        }
        return names;
    }

    public static ArrayList<String> pickOneToThreeNames (ArrayList<String> randomNames){
        int randomIndex = (int)(Math.random() * 3 + 1);
        ArrayList<String> newArray = new ArrayList<String>();
        
        for (int i = 0; i < randomIndex; i++){
            int newRandomIndex = (int)(Math.random() * randomNames.size());
            String animal = randomNames.get(newRandomIndex);
            
            while (!newArray.contains(animal)){
               newArray.add(animal);  
            }
        }
        
        return newArray;
    }

    public static String handleUnderscores(String word, int number){
        char [] chars = word.toCharArray();
        int i = 0;
        while(i < number){
            int randomIndex = (int)Math.floor(Math.random() * chars.length);
            if(chars[randomIndex] != '_'){
                chars[randomIndex] = '_';
                i++;
            }
        }
        return new String(chars);
    }
}