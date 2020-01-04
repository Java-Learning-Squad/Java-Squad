public class Fruit{
  public int price = 0;
  public String color = "";
  public String origin = "";

  Fruit(int price, String color, String origin) {
    this.price = price;
    this.color = color;
    this.origin = origin;
  }

  @Override
  public String toString() {
    String stringifiedValues =  "{ price: " + this.price + ", color: " + this.color + ", origin: "+ this.origin + "}";
    return stringifiedValues;
  }
}