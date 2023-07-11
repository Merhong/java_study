package ex999;

class Rectangle implements Comparable<Rectangle> {
	
	public int width = 0;
	public int height = 0;
	
	public Rectangle(int w, int h) {
		width = w;
		height = h;
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
	public int getArea() {
		return width * height;
	}
	
	@Override
	public int compareTo(Rectangle other) {
		Rectangle otherRect = other;
		if (this.getArea() < otherRect.getArea()) {
			return -1;
		} else if (this.getArea() < otherRect.getArea()) {
			return 1;
		} else {
			return 0;
		}
	}
}

public class RectangleTest {
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(100, 30);
		Rectangle r2 = new Rectangle(500, 10);
		int result = r1.compareTo(r2);
		
		if (result == 1) {
			System.out.println(r1 + "가 더 큽니다.");
		} else if (result == 0) {
			System.out.println("같습니다.");
		} else {
			System.out.println(r2 + "가 더 큽니다.");
		}
	}
}
