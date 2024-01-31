package ch09.Extends05;

public class GrandFather {
	private int handsomeScore;
	
	GrandFather() {
		System.out.println("GrandFather 생성자");
	}
	
	GrandFather(int score) {
		this.handsomeScore = score; // this 생략가능하나 강조위해 사용
		System.out.println("GrandFather 매개변수 생성자");
	}
	
	void handsome() {
		System.out.println("잘 생겼다");
	}

}
