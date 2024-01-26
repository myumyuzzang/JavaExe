package ch03.for10;

import java.util.Scanner;

public class Resolve15 {

	public static void main(String[] args) {
		// 15. 사용자로부터 정수를 입력받습니다.
		// 입력 받은 값을 계속 더합니다
		// 사용자가 0을 입력하면 합을 출력합니다
		// 프로그램을 종료합니다.
		// 1번만 실행;조건(계속비교);실행이 끝나면 변화
		// 시작;끝;변화

		Scanner scanner = new Scanner(System.in);

		System.out.println("숫자를 입력하세요. (0 입력은 합계 출력)");
		int number = scanner.nextInt();

		int sum = 0;

		do {
			number = scanner.nextInt();
			sum += number;

		} while (number != 0);

		System.out.println("합: " + sum);
		System.out.println("프로그램을 종료합니다");
	}
}