package ex06;

/**
 * 1. 인터페이스는 new 할 수 없다.
 * 2. 인터페이스는 (static)변수를 만들 수 있다.
 * 3. 인터페이스는 (추상)메소드"만" 가진다.
 */
interface Remote {
	int NUM = 10; // public static final 생략 되어 있음.

	void num(); // public abstract 생략
}

public class Inter01 {
	public static void main(String[] args) {
		System.out.println(Remote.NUM);
	}
}
