package Practice;
// import java.util.*;             // util 클래스의 모든것을 받아옴
// import java.util.Scanner;       // 키보드 입력을 받기위한 스캐너 클래스
// /* */ 주석처리는 Ctrl + Shift + /        // 주석처리는 Ctrl + /

/* // p.65
public class Practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // 스캐너 변수 sc 선언 키보드 입력 받기위한 변수.
        int x, y, sum;                          // int형 변수 선언
        
        System.out.println("첫번째 숫자를 입력하시오 : ");  // 줄을 바꾸지 않는다.
        x = sc.nextInt();                       // 키보드 입력에서 정수를 읽는다.

        System.out.println("두번째 숫자를 입력하시오 : ");
        y = sc.nextInt();

        sum = x + y;        // x와 y를 합쳐서 sum에 할당한다.
        System.out.println(sum);
        sc.close();
    }
} */

// p.67
/* public class Practice01 {
    public static void main(String[] args) {
        String name;    // 문자열 변수 name
        int age;        // 정수형 변수 age

        Scanner sc = new Scanner(System.in);    // 키보드로 입력 받기위한 스캐너 클래스 변수 sc

        System.out.println("이름을 입력하시오 :");
        name = sc.nextLine();
        System.out.println("나이를 입력하시오 :");
        age = sc.nextInt();

        System.out.println(name + "님 안녕하세요! "+ age + "살 이시네요.");
        sc.close();
    }
} */

// p.70
/* public class Practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("초를 입력하시오 :");
        int time = sc.nextInt();        // 정수형 time을 선언하면서 키보드로 입력을 받는다.
        int sec = (time%60);            // 초를 계산
        int min = (time/60);            // 분을 계산

        System.out.println(time + "초는" + min + "분" + sec + "초 입니다.");
        sc.close();
    }
} */

// p.71
/* public class Practice01 {
    public static void main(String[] args) {
        int x=1, y=1;       // int x,y 선언 및 초기화
        int a = x++;        // 실행한 뒤에 증가 
        int b = ++y;        // 실행하기 전에 증가
        System.out.println("a :"+a+" b :"+b);
        
        int c = 100, d = 200;
        c +=10;
        d /= 10;
        System.out.println("c :" + c +" d :"+d);
    }
} */

/* public class Practice01 {
    public static void main(String[] args) {
        System.out.println("100"+"200");
        System.out.println(100+200);
        System.out.println("100"+200);
    }
} */