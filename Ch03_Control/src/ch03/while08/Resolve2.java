package ch03.while08;

public class Resolve2 {
	
	public static void main(String[] args) {
		
		// 2. while문을 이용해서 10부터 20까지 출력하세요
		// while : ()이 true인 동안 계속 반복하라
		
		int i=9;	// 초기식 (시작:언제부터)
		while(i<20) {	// 조건 (종료:언제까지)
			i++;	// 증감식 (변화:얼마만큼)
			System.out.print(i + ", "); // 실행문
		}

	}

}
