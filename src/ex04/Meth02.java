package ex04;

class Cal02 {
    void add(int n1, int n2) {     // void형은 리턴값이 없음.
        System.out.println("더하기 x+y:" + (n1 + n2));
    } // 스택을 종료하고, 복귀주소를 확인하고 복귀한다.

    void minus(int n1, int n2) {
        System.out.println("빼기 x-y:" + (n1 - n2));
    }

    void multi(int n1, int n2) {
        System.out.println("곱하기 x*y:" + (n1 * n2));
    }

    void divide(int n1, int n2) {
        System.out.println("나누기 x/y:" + (n1 / n2));
    }
}

public class Meth02 {
    public static void main(String[] args) {
        Cal02 c1 = new Cal02();
        c1.add(10, 5);
        c1.minus(5, 3);
        c1.multi(2, 5);
        c1.divide(4, 2);

        // Cal02 c2 = new Cal02();
        // c2.add(20,30);
        // c2.minus(7,2);
        // c2.multi(5,5);
        // c2.divide(6,3);

    }
}
