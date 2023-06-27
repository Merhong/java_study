package ex16;

class Buffer {
    private int data;
    private boolean empty = true;

    public synchronized int get() {
        while (empty) {

//케익이 생산될 때까지 기다린다.
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

//상태를 토글한다.
        empty = true;

//생산자를 깨운다.
        notifyAll();
        return data;
    }

    public synchronized void put(int data) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        empty = false;
        this.data = data;
        notifyAll();
    }
}
class Producer implements Runnable {
    private final Buffer buffer;
    public Producer(Buffer buffer) {

//버퍼 참조 변수를 저장한다.
        this.buffer= buffer;
    }


    //버퍼에 케익을 가져다 놓는다.
    public void run() {
        for (int i = 0; i < 10; i++) {
            buffer.put(i);
            System.out.println("생산자: " + i + "번 케익을 생산하였습니다.");
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
            }
        }
    }
}
class Consumer implements Runnable {
    private final Buffer buffer;

//버퍼 참조 변수를 저장한다.

    public Consumer(Buffer drop) {

//버퍼에서 케익을 가져온다.
        this.buffer= drop;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            int data = buffer.get();
            System.out.println("소비자: " + data + "번 케익을 소비하였습니다.");
            try {
                Thread.sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
            }
        }
    }
}
public class ProducerConsumerTest {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        (new Thread(new Producer(buffer))).start();
        (new Thread(new Consumer(buffer))).start();
    }
}
