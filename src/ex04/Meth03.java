package ex04;


class Account {
    /* 입금(입금할 금액, 계좌잔액) */
    int deposit(int amount, int money) {
        int restMoney = money + amount;
        return restMoney; // 메서드를 호출한 라인으로 값을 반환 (stack로딩되므로 사라짐.)
    }

    /* 출금(입금할 금액, 계좌잔액) */
    int withdraw(int amount, int money) {
        int restMoney = money - amount;
        return restMoney; // 메서드를 호출한 라인으로 값을 반환
    }

    /* 이체(보낼 금액(amount), 받는사람 잔액(reciverMoney) 보내는사람 잔액(senderMoney) */
    // 리턴 필요없음, 출력만
    void transfer(int amount, int receiverMoney, int senderMoney) {
        if (senderMoney < amount) {
            System.out.println("잔액이 부족합니다.");
        } else {
            System.out.println(amount + "원을 이체합니다.");
            System.out.println("받기 전 잔액 :" + receiverMoney);
            receiverMoney = receiverMoney + amount;
            System.out.println("보내기 전 잔액:" + senderMoney);
            senderMoney = senderMoney - amount;
            System.out.println("================");

            System.out.println("받는 사람 잔액:" + receiverMoney);
            System.out.println("보낸 사람 잔액:" + senderMoney);
        }
    }
}

public class Meth03 {
    public static void main(String[] args) {
        // 홍길동의 잔액
        int hMoney = 1000;

        // 임꺽정의 잔액
        int iMoney = 1000;

        // 홍길동이 입금 2번, 출금 1번
        Account hAccount = new Account();
        hMoney = hAccount.deposit(100, hMoney);        // 끝나면 5번라인으로 점프해서 연산
        System.out.println("입금했습니다. 홍길동 남은 금액:" + hMoney); // stack 메모리에 사라지기전에 money에 값 할당
        hMoney = hAccount.deposit(500, hMoney);
        System.out.println("입금했습니다. 홍길동 남은 금액:" + hMoney);
        hMoney = hAccount.withdraw(300, hMoney);
        System.out.println("출금했습니다. 홍길동 남은 금액:" + hMoney);

        System.out.println("=============================");
        // 임꺽정이 입금 1번(100원), 출금 2번(300원, 500원)
        Account iAccount = new Account();
        iMoney = iAccount.deposit(100, iMoney);
        System.out.println("입금했습니다. 임꺽정 남은 금액:" + iMoney);
        iMoney = iAccount.withdraw(300, iMoney);
        System.out.println("출금했습니다. 임꺽정 남은 금액:" + iMoney);
        iMoney = iAccount.withdraw(500, iMoney);
        System.out.println("출금했습니다. 임꺽정 남은 금액:" + iMoney);

        // 이체
        iAccount.transfer(1000, iMoney, hMoney);

    }
}
