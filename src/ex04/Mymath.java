package ex04;

public class Mymath {
	
	public static void main(String[] args) {
		Mymath obj = new Mymath();
		
		System.out.println(obj.add(10, 20));
		System.out.println(obj.add(10, 20, 30));
		System.out.println(obj.add(10, 20, 30, 40));
	}
	
	// 메소드 오버로딩(Method Overloading), 타입과 이름은 같으나 매개변수 개수가 다름.
	int add(int x, int y) {
		return x + y;
	}
	
	int add(int x, int y, int z) {
		return x + y + z;
	}
	
	int add(int x, int y, int z, int w) {
		return x + y + z + w;
	}
}