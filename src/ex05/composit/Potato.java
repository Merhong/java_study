package ex05.composit;

public class Potato {

  private final int price;
  private final String desc;

  public Potato() {
    this(800, "감자");
  }

  public Potato(int price) {
    this(price, "감자");
  }

  public Potato(int price, String desc) {
    this.price = price;
    this.desc = desc;
  }

  public int getPrice() {
    return price;
  }

  public String getDesc() {
    return desc;
  }

}
