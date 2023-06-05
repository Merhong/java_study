package ex03;

public class Coin {

    // 메소드(행위)
    void printRestMoney() {
        // 메소드의 내부 = stack 메모리
        
    }
    public static void main(String[] args) {
        // 500, 100, 50, 10원짜리 동전 (개수를 최소로 해서 주세요.)
        // 최대한 500원을 많이줘야함.
        final int money = 1790; // Scanner로 수정하기, final 상수 -> 변경불가
        int restMoney = money; // 남은 금액 변수 만들기
        int count; // 동전 개수를 담을 변수

        //int tempMoney;                                // 500, 100, 50, 10

        // 1번 리팩토링 : 배열 + for문
        int[] coin_arr = {500, 100, 50, 10};                 // 동전 종류
        

/*         for(int i=0; i<coin_arr.length; i++) {               
            count = restMoney / coin_arr[i];                 // 동전개수 = 돈 / 동전크기
            restMoney = restMoney % coin_arr[i];             // 하위 동전을 위한 나머지
            System.out.println(coin_arr[i]+"원 :"+ count);   // 출력
        } */
        
        // for-each 문
        for(int j : coin_arr) {
            count = restMoney / coin_arr[j];                 // 동전개수 = 돈 / 동전크기
            restMoney = restMoney % coin_arr[j];             // 하위 동전을 위한 나머지
            System.out.println(coin_arr[j] + "원 :" + count);   // 출력
        }
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