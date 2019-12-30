public class Base {
  private String name = "Base class";
  private int age = 18;

  // default constructor
  Base(){}

  // constructor with 1 String argument
  Base(String n){ 
    this.name = n; 
  }

  // constructor with 2 args.
  Base(String n, int a){
    this.name = n;
    this.age = a;
  }

  // public method that returns a string
  public String getName() {
    return this.name;
  }

  // public method that returns an integer
  public int getAge(){
    return this.age;
  }
}