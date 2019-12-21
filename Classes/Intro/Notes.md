# Intro to Java Classes Notes

### New terms:
  - **attributes** - any variables that are inside the class and no other method.
  ```java
  public class Example {
    int number;        <===== Attribute
    String someString; <===== Attribute

    public static void main(String[] args) {...}
  }

  ``` 
  </br>  

  - **methods** - any contained function within a `class`.
  ```java
  public class Example {

    public static void main(String[] args) {...}      <===== Method

    public void printString(String str) {...}         <===== Method

    private double calcRoot(int num1, int root) {...} <===== Method

    public ArrayList<Integer> myNumbers() {...}       <===== Method
  }
  ```
  ---
  </br>  

  - **object** - objects are created from `class`es.  

  </br>  

---
  
  </br>  
  
  - **instance** - representation of an objec is called instance. It is created with `new` keyword. (`e.g new Scanner(System.in)`)

  ```java
  public class BaseClass {
    int number;        
    String someString; 

    public String whatAreYou() {
      return "I am Base Class";
    }

    public int howOldAreYou() {
      return 22;
    }
  }

  public class Main {
    public static void main(String[] args) {
    // Type     variableName   Object instance //
      BaseClass baseVariable = new BaseClass();
      BaseClass base2Variable = new BaseClass();
      BaseClass anyName = new BaseClass();
    }
  }

  ```