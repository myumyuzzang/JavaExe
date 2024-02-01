package ch09.resolve01;

/*1. 클래스 Add
   클래스 Sub
   클래스 Mul
   클래스 Div을 만드세요
   이들은 다음 필드와 메서드를 가집니다
   int타입의 a, b 필드 : 연산하고자 하는 값
   void setValue(int _a, int _b) : 연산값을 전달받아 필드에 저장
   int calculate() : 해당 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴합니다
*/

public class Div { 
		private int a, b;
		public void setValue(int _a, int _b) {
			this.a = _a;
			this.b = _b;
		}
		public int calculate() {
			  return a / b;
		  }
		
	}

	

