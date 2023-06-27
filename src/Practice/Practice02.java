package Practice;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("물체의 무게(kg)를 입력하시오 :");
        int m = sc.nextInt();   // 정수형 변수 무게 m
        System.out.println("물체의 속도(m/s)를 입력하시오 :");
        int v = sc.nextInt();   // 정수형 변수 속도 v

        double e = m * v * v * 0.5;   // 실수형 변수 에너지 = 0.5*무게*속도^2

        System.out.println("물체는 " + e + "(줄)의 에너지를 가지고 있다.");
        sc.close();
    }
}
