package ch08.class09;

/*4. Rectangle클래스를 작성하세요
   int타입의 x1, y1, x2, y2 : 사각형을 구성하는 두 점의 좌표
   void set(int x1, int y1, int x2, int y2) : 좌표 설정
   int square() : 사각형 넓이 리턴
   void show() : 좌표와 넓이 등 직사각형 정보의 화면 출력
   boolean equals(Rectangle r) : 인자로 전달된 객체 r과 현 객체가 
   동일한 좌표의 직사각형이면 true 리턴
 */
public class RectangleMain {

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle();
		rectangle1.set(0, 0, 5, 5);
		rectangle1.show();
		
		Rectangle rectangle2 = new Rectangle();
		rectangle2.set(0, 0, 10, 10);
		rectangle2.show();
		
		boolean isEqual = rectangle1.equals(rectangle2);
		System.out.println("두 사각형이 동일한 좌표인가요? " + isEqual);
	}
}

