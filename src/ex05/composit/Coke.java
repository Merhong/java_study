package ex05.composit;

/* Composition 예제 */
public class Coke {
    private final int price;
    private final String desc;

    public Coke() {
        this(500, "콜라");
    }

    public Coke(int price) {
        this(price, "콜라");
    }

    public Coke(int price, String desc) {
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
