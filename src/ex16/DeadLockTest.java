package ex16;

public class DeadLockTest {
    public static void main(String[] args) {
        final String res1 = "Gold";
        final String res2 = "Silver";

        Thread t1 = new Thread(() -> {
            synchronized (res1) {
                System.out.println("Thread_1: 자원 1획득");
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            synchronized (res2) {
                System.out.println("Thread_2: 자원 2획득");
            }
        });

        Thread t2 = new Thread(() -> {
            // 순서를 res1, res2로 바꾸면 교착상태 방지!
            synchronized (res1) {
                System.out.println("Thread_2: 자원 2획득");
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            synchronized (res2) {
                System.out.println("Thread_1: 자원 1획득");
            }
        });

        t1.start();
        t2.start();
    }
}
