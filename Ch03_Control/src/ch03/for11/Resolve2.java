package ch03.for11;

public class Resolve2 {
	public static void main(String[] args) {
		// 교재 140페이지 6번
		// for 문을 이용해서 다음과 같은 실행 결과가 나오는 코드를 작성해보세요.
		// *
		// **
		// ***
		// ****
		// *****
		
		for(int i=1; i<=5; i++) {
			for (int j = 1; j<= i; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
	}
}