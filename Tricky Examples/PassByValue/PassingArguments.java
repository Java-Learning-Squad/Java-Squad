public class PassingArguments {
  public static void main (String[] args){
    int numberInt = 100;
    double numberDouble = 111.99;
    String mainString = "I am a hero";

    acceptInt(numberInt);
    System.out.println(numberInt);
    
    acceptDouble(numberDouble);
    System.out.println(numberDouble);
    
    acceptString(mainString);
    System.out.println(mainString);
  }


  public static void acceptInt(int number) {
    number++;
  }

  public static void acceptDouble(double number) {
    number = number + 200;
  }

  public static void acceptString(String str) {
    str = "Something else";
  }
}