package ex04;

public class Circle {
	
	public int radius;      // 반지름
	public String color;    // 색깔
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public Circle() {
		this(0);
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
}