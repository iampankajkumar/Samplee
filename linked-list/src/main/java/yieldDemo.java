class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println(add(10, 12));
		
	}

	public synchronized int add(int x, int y) {
		return x + y;
	}
}

public class yieldDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread t1 = new MyThread();
		t1.start();

		MyThread t2 = new MyThread();
		t2.start();

	}
}
