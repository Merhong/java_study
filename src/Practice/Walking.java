package Practice;

public class Walking {
	
	public static void main(String[] args) {
		/* 메소드 호출 */
		// Walking w1 = new Walking();
		// 아래와 같이 하는게 정석이나 static 메모리에 이미 로딩되어 있어서 인스턴스를 만들 필요없다.
		// double result = w1.calculateCalory(walk);
		int walk = 5000;
		double result = calculateCalory(walk);
		
		System.out.println(result);
	}
	
	private static double calculateCalory(int walk) {
		return 0.02 * walk;
	}
}