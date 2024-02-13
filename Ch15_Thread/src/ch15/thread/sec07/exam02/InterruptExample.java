package ch15.thread.sec07.exam02;

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
	}

		// threa의 run()에 InterruptedException를 throw 한다.
		thread.interrupt();
	}
}