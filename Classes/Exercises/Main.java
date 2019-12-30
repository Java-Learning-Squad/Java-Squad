
public class Main {
  public static void main(String [] args){
    // Example: Base instance without parameters.
    Base base = new Base();
    
    // Example: Base instance with 1 parameter.
    Base baxa = new Base("Baxa");    
    
    // Example: Base instance with parameters.
    Base tim = new Base("Tim", 32);

    System.out.printf("I am %s, and %d years old \n", base.getName(), base.getAge());
    System.out.printf("I am %s, and %d years old \n", baxa.getName(), baxa.getAge());
    System.out.printf("I am %s, and %d years old \n", tim.getName(), tim.getAge());
  }
}