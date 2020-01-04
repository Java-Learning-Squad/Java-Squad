import java.util.HashMap;

public class Example {
    public static void main(String[] args){
 
      String[] fruitNames = {"Apple", "Banana", "Grapes", "Watermelon", "Peach"};
      String[] colors = {"orange", "green", "red", "purple", "yellow", "black", "white"};
      String[] coutries = {"Italy", "Greece", "Germany", "Canada", "Mexico", "UK", "DR"};
      
      HashMap<String, Fruit> fruits = new HashMap<String, Fruit>();
    
      for(String fruitName : fruitNames){
        int randomInt = (int)(Math.random() * 100);
        int colorIndex = (int)(Math.random() * colors.length);
        int countryIndex = (int)(Math.random() * coutries.length);

        Fruit fr = new Fruit(randomInt, colors[colorIndex], coutries[countryIndex]);
        fruits.put(fruitName, fr);
      }

      for(String fruitName : fruitNames){
        Fruit fruitInstance = fruits.get(fruitName);
        System.out.printf("fruitName: %s -> %s\n", fruitName, fruitInstance.origin);
      }      
    }
}