package ex02;

class Coffee {
    static int price = 1000;                // static
    String name = "커피";

    void run() {                            // 메서드(행위)는 실행시에 잠깐 Stack 메모리에 로드 됨.
        //int n = 100;                      // 행위가 끝나면 사라지기 때문에 찾을 수 없다.
        System.out.println("안녕하세요."); // 즉, 외부에서 int n에 대한 접근이 불가능.
    }
}

public class Mem01 {
    static int price = 10000;

    public static void main(String[] args) {
        // int num = 10;
        // System.out.println(num);

        Coffee c = new Coffee();            // 클래스 변수의 선언
        System.out.println(c.name);         // 클래스 멤버 name 호출

        System.out.println(price);          // static price 호출
        // System.out.println(c.price);     // Coffee 클래스의 static price 호출이 되긴 하나
        System.out.println(Coffee.price);   // static 변수이므로 이렇게 호출해야 함.

        c.run();
    }
}
