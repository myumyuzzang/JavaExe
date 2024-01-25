package ch03.while08;

public class Resolve1 {

	public static void main(String[] args) {
		
		// 1. while문을 이용해서 1부터 100까지 출력하세요
		// while : ()이 true인 동안 계속 반복하라
		
		int i=0;	// 초기식 (시작:언제부터)
		while(i<100) {	// 조건 (종료:언제까지)
			i++;	// 증감식 (변화:얼마만큼)
			System.out.print(i + ", "); // 실행문
		}

	}

}
