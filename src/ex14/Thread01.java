package ex14;

public class Thread01 {
    
    // CPU가 하나의 쓰레드를 생성하여 실행된다.
    // 실 : main 메소드
    public static void main(String[] args) {

        new Thread(() -> {
            /* Target 부분 */   
            for (int i = 0; i < 5; i++) {
            System.out.println("서브쓰레드 : "+i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }).start();       // 쓰레드를 시작하는 지점
        

        for (int i = 0; i < 5; i++) {
            System.out.println("메인쓰레드 : "+i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
