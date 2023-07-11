package Practice;

public class Diet {
	
	public static void main(String[] args) {
		double w = 81.6;
		double t = 1.76;
		// BMI 계산
		double bmi = calculate(w, t);
		
		System.out.printf("BMI: %.2f(%.1fkg, %.2fm)\n", bmi, w, t);
		System.out.printf("결과: %s입니다.\n", result(bmi));
	}
	
	// 몸무게와 키를 입력받아. BMI 지수 반환
	public static double calculate(double weight, double tall) {
		// bmi = weight / (tall * tall)
		return weight / (tall * tall);
	}
	
	public static String result(double bmi) {
		String result = "";
		if (bmi >= 30) {
			result = "비만";
		} else if (bmi >= 25 && bmi < 30) {
			result = "과체중";
		} else if (bmi >= 18.5 && bmi < 25) {
			result = "정상";
		} else {
			result = "저체중";
		}
		return result;
	}
}
