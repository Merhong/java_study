package ex00;

class 엘리스 {
	static String name = "엘리스";
	int height = 160;

	public 엘리스() {
	}

	int eatInt(int qty) {
		this.height = this.height + (10 * qty);
		System.out.println(this.height);
		return this.height;
	}

	void eatVoid(int qty) {
		this.height = this.height + (10 * qty);
		System.out.println(this.height);

	}
}

public class MemApp {
	public static void main(String[] args) {
		엘리스 e = new 엘리스();

		e.eatInt(5);       // 210
		e.eatVoid(5);      // 260이 됐다가 return이 없으니 다시 210?

		// e.eatVoid(5);      // 210
		// e.eatInt(5);       // 210
	}
}