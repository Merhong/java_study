package ex01;

public class Var03 {
    public static void main(String[] args) {
        // 업 캐스팅(작은것을 큰것에 넣음) = 묵시적 형변환
        int n1 = 10;            // n1 10으로 초기화
        double d1 = n1;         // d1 선언, "묵시적 형변환"
        System.out.println(d1); // d1 출력 >> 10.0 출력

        // 다운 캐스팅(큰것을 작은것에 넣음) = 명시적 형변환
        double d2 = 10.5;
        int n2 = (int) d2;      // 명시적 형변환 = 강제 형변환
        System.out.println(n2); // data가 소실된다. >> 10 출력

        // 문자 형변환(아스키코드)
        int ch = 65;                // byte(1바이트), int(4), char(2)
        byte ch2 = 65;
        char data = (char)ch;       // 형변환
        char data2 = (char) ch2;    // 형변환

        System.out.println(data);   // A 출력
        System.out.println(data2);  // A 출력
    }
}
