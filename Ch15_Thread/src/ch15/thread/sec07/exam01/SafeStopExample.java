package ch15.thread.sec07.exam01;

public class SafeStopExample {
	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
	}

		printThread.setstop(true);
}
}