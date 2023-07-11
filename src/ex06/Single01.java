package ex06;

class 미니언 {
	
	public 미니언() {
		System.out.println("미니언이 생성되었습니다.");
	}
}

// 싱글톤 패턴
class 바론 {
	
	private static final 바론 instance = new 바론();
	
	private 바론() {
	}
	
	public static 바론 getInstance() {
		return instance;
	}
}

public class Single01 {
	
	public static void main(String[] args) {
		미니언 m1 = new 미니언();
		미니언 m2 = new 미니언();
		미니언 m3 = new 미니언();
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
		
		바론 b1 = 바론.getInstance(); // 싱글톤 호출
		바론 b2 = 바론.getInstance(); // 싱글톤 호출
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		
		if (b1 instanceof 바론) { // instanceof : 같은 타입인지 확인
			System.out.println("같은 타입 입니다.");
		}
		
		if (b1 instanceof Object) { // 모든 클래스의 최상위 부모, Object
			System.out.println("바론과 오브젝트는 같은 타입 입니다.");
		}
	}
}
