public class Basics {
  public static void main(String [] args) {
    Name person1 = new Name();
    Name person2 = new Name("Najib");
    Name[] people = { person1, person2 };

    System.out.println(people[0].getName());
    System.out.println(people[1].getName());
  }
}