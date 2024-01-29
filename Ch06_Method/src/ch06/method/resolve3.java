package ch06.method;

public class resolve3 {
	// 3. int result = total(10, 100);
	//  위처럼 사용하면 result에는 10부터 100까지의 누적합이 저장되어야 합니다
	//  total메서드를 작성하고 사용해보세요.
		public static void main(String[] args) {
			
		int result = total(10, 100);
		System.out.println("10부터 100까지의 누적합 : "+ result);
		}
		
		// 주어진 범위 내의 누적합을 계산하는 메서드
		// total () 메서드는 두개의 정수를 입력받아 그 사이의 모든 수를 더하는 메서드
		// 그리고 main 메서드에서 total 메서드를 호출하고 그 결과를 result 변수에
		// 저장 후, 이 값을 콘솔에 출력
		public static int total(int start, int end) {
			
			// 누적합을 저장할 변수 선언
			int sum = 0;
			
			// 시작값부터 끝값까지의 모든 숫자를 더함
			for (int i = start; i <= end; i++) {
				sum += i;
			}
			
			// 계산된 누적합을 반환
			return sum;
		}
}
