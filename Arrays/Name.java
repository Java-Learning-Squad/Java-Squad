public class Name {
  private String name = "No name";
  
  public Name(){
    name = "No name";
  }

  public Name(String n){
    name = n;
  }

  public String getName() {
    return name;
  }

  public void printName(){
    System.out.println(name);
  }
}