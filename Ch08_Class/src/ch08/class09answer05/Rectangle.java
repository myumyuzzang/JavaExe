package ch08.class09answer05;

/*4. Rectangle클래스를 작성하세요
   int타입의 x1, y1, x2, y2 : 사각형을 구성하는 두 점의 좌표
   void set(int x1, int y1, int x2, int y2) : 좌표 설정
   int square() : 사각형 넓이 리턴
   void show() : 좌표와 넓이 등 직사각형 정보의 화면 출력
   boolean equals(Rectangle r) : 인자로 전달된 객체 r과 현 객체가 
   동일한 좌표의 직사각형이면 true 리턴
 */
public class Rectangle {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	public void set(int x1, int y1,int x2,int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public int square() {
		int width = Math.abs(x1 - x2);
		int height = Math.abs(y1 - y2);
		return width * height;
	}
	
	public void show() {
		System.out.println("좌표 : (" + x1 + "," + y1 + "), (" + x2 + ", "
				+ y2 + ")");
		System.out.println("넓이 : " + square());
		
	}
	public boolean equals(Rectangle r) {
		return x1 == r.x1 && y1 == r.y1 && x2 == r.x2 && y2 == r.y2;
	}
}

