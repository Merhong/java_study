package ex13;

class Box<T> {
	T num;
}

/* 제네릭 */
public class Generic01 {
	public static void main(String[] args) {
		// Box t1 = new Box();         // 이땐 object 타입
		Box<Integer> b1 = new Box<>(); // 이땐 Integer 타입
		b1.num = 10;
		System.out.println(b1.num);

		Box<Double> b2 = new Box<>(); // 이땐 Double 타입
		b2.num = 1.2345;
		System.out.println(b2.num);
	}
}
