package Practice;

import java.util.Scanner;                                   // 스캐너 클래스

// 파워자바 p.77 Mini Project
public class FtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                // 키보드 입력받기 위한 스캐너 변수 sc

        System.out.println("=====================");
        System.out.println("1. ℉ -> ℃");
        System.out.println("2. ℃ -> ℉");
        System.out.println("=====================");

        System.out.println("번호를 입력하시오 : ");
        int i = sc.nextInt();                               // 메뉴 번호를 입력받는 정수 i
        if (i > 2 || i < 1) {                               // 메뉴 번호 1,2 이외엔 오류처리 > 프로그램 종료
            System.out.println("잘못된 번호를 입력하였습니다.");

        } else if (i == 1) {                                // 화씨 -> 섭씨
            System.out.println("℉ 온도를 입력하시오: ");
            double f_temp = sc.nextDouble();                // 화씨, 키보드로 부터 실수를 입력받는다.
            double c_temp = (f_temp - 32) * 5/9;            // 섭씨
            System.out.println("섭씨온도는 :" + c_temp + "도 입니다.");

        } else if (i == 2) {                                // 섭씨 -> 화씨
            System.out.println("℃ 온도를 입력하시오: ");
            double c_temp = sc.nextDouble();                // 섭씨, 키보드로 부터 실수를 입력받는다.
            double f_temp = (c_temp * 9/5) + 32;            // 화씨
            System.out.println("화씨온도는 :" + f_temp + "도 입니다.");
        }
        sc.close();                                         // 스캐너 닫기
    }
}
