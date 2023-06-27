package ex01;

public class Var04 {
    public static void main(String[] args) {
        // String(문자열) "" 사용
        String s1 = "가나다";       // String은 클래스 개념(레퍼런스 타입)
        System.out.println(s1);

        // 연결 연산자 +
        String name = "홍길동";
        int age = 25;
        System.out.println(name + age);          // 홍길동25
        System.out.println(name + " " + age);    // 홍길동 25
        System.out.println(name + "의 나이는 " + age); // 홍길동의 나이는 25
    }
}
