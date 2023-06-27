package ex03;

public class Coin02 {
    // 500, 100, 50, 10원짜리 동전 (개수를 최소로 해서 주세요.)
    // 최대한 500원을 많이줘야함.
    final int money = 1790; // Scanner로 수정하기, final 상수 -> 변경불가
    int restMoney = money; // 남은 금액 변수 만들기
    int count; // 동전 개수를 담을 변수

    public static void main(String[] args) {
        Coin02 c2 = new Coin02();              // Heap 메모리에 로딩
        c2.printRestMoney(500);              // c2의 메소드를 불러온다.
        c2.printRestMoney(100);              // c2의 메소드를 불러온다.
        c2.printRestMoney(50);               // c2의 메소드를 불러온다.
        c2.printRestMoney(10);               // c2의 메소드를 불러온다.

    }

    // 메소드(행위)
    void printRestMoney(int m) {
        // 메소드의 내부 = stack 메모리
        count = restMoney / m;                 // 동전개수 = 돈 / 동전크기
        restMoney = restMoney % m;             // 하위 동전을 위한 나머지
        System.out.println(m + "원:" + count);  // 출력

    }
}

/*      
        tempMoney = 500;
        count = restMoney / tempMoney; // 5
        System.out.println(tempMoney+"원 : "+count);
        restMoney = restMoney % tempMoney;

        tempMoney = 100;
        count = restMoney / tempMoney; // 1
        System.out.println(tempMoney+"원 : "+count);
        restMoney = restMoney % tempMoney;

        tempMoney = 50;
        count = restMoney / tempMoney; // 1
        System.out.println(tempMoney+"원 : "+count);
        restMoney = restMoney % tempMoney;

        tempMoney = 10;
        count = restMoney / tempMoney; // 3
        System.out.println(tempMoney+"원 : "+count);
        restMoney = restMoney % tempMoney;
*/