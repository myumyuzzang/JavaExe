package ch08.class11;

// this는 객체의 레퍼런스 값을 가지고 있다
public class WatchTime {
	private int hour, min, sec;


	public WatchTime(int hour, int min, int sec) {
		System.out.println("this: " + this);
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}

	// public void viewTime(WatchTime this) 
	public void viewTime() {
			System.out.printf("[%02d:%02d:%02d]\n", hour, min, sec);
	}

	public static void main(String[] args) {
		WatchTime wtNum = new WatchTime(12, 13, 33);
		System.out.println("wtNum: " + wtNum);
		System.out.printf("wtNum:%x\n", wtNum.hashCode());
		wtNum.viewTime();			//viewTime(wtNum);
		
		WatchTime wtNum1 = new WatchTime(13, 23, 53);
		System.out.println("wtNum1: " + wtNum1);
		System.out.printf("wtNum1:%x\n", wtNum1.hashCode());
		wtNum1.viewTime();			//viewTime(wtNum1);

	}
}
