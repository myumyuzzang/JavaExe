package ch15.thread.sec06.exam02;

public class ThreadA extends Thread {
	private WorkObject workObject;
	
	public ThreadA(WorkObject workObject) {
		setName("ThreadA");
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			workObject.methodA();
		}
	}
}