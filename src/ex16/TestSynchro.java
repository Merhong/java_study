package ex16;

class Printer {
	
	// synchronized 키워드를 사용하면 쓰레드 순서대로 잘 나옴 but 안쓰면 결과가 뒤죽박죽이 된다.
	synchronized void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThread1 extends Thread {
	
	Printer prn;
	int[] myarr = {10, 20, 30, 40, 50};
	
	MyThread1(Printer prn) {
		this.prn = prn;
	}
	
	public void run() {
		prn.print(myarr);
	}
}

class MyThread2 extends Thread {
	
	Printer prn;
	int[] myarr = {1, 2, 3, 4, 5};
	
	MyThread2(Printer prn) {
		this.prn = prn;
	}
	
	public void run() {
		prn.print(myarr);
	}
}

public class TestSynchro {
	
	public static void main(String[] args) {
		Printer obj = new Printer();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		
		t1.start();
		t2.start();
	}
}
