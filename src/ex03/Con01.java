package ex03;

public class Con01 {
	
	public static void main(String[] args) {
		int point = 91;
		
		// 학점 계산기
		if (point >= 90) {                    // 90점 이상 : A
			System.out.println("A학점");
		} else if (point < 90 && point >= 80) { // 80점이상 90점 미만 : B
			System.out.println("B학점");
		} else if (point < 80 && point >= 70) { // 70점이상 80점 미만 : C
			System.out.println("C학점");
		} else if (point < 70 && point >= 60) { // 70점이상 80점 미만 : D
			System.out.println("D학점");
		} else {                                // 나머지 F
			System.out.println("F학점");
		}
		
	}
}
