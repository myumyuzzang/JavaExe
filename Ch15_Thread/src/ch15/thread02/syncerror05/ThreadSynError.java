package ch15.thread02.syncerror05;


class Value {
	private int num = 0;
	public int getNum() {
		return num;
	}
	public void Increment() {
		num++;
	}
}

class IncThread extends Thread {
	private Value val;
	public IncThread(Value val) {
		this.val = val;
	}
	@Override
	public void run() {
		for (int i = 0 ; i < 100000; i++)
			val.Increment();
	}
}

public class ThreadSynError {
	public static void main(String[] args) {
		Value val = new Value();
		IncThread it1 = new IncThread(val);
		
		it1.start();
		
		try {
			it1.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(val.getNum());
	}
}