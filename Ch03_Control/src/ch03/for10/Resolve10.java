package ch03.for10;

public class Resolve10 {

	public static void main(String[] args) {
		// 10. for문을 이용해서 1부터 10까지 합을 출력하세요
		
		// 1번만 실행;조건(계속비교);실행이 끝나면 변화
		// 시작;끝;변화
		int sum = 0;
		
		for(int i=1;i<=10;i++) {
			sum += i;
		}
			System.out.println(sum);
							
		

	}
}