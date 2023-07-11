package ex05.composit;

public class Burger {
	
	private final int price;
	private final String desc;
	
	// Default Constructor
	public Burger() {
		this(1000, "버거");
	}
	
	public Burger(int price) {
		this(price, "버거");
	}
	
	// Constructor
	public Burger(int price, String desc) {
		this.price = price;
		this.desc = desc;
		System.out.println("버거가 만들어졌습니다.");
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getDesc() {
		return desc;
	}
	
	
}
