package ch03.for10;

import java.util.Scanner;

public class Resolve14 {

	public static void main(String[] args) {
		// 14. 입력받은 숫자의 구구단을 출력하세요
		// 예를 들어 3을 입력하면
		// 3 x 1 = 3
		// 3 x 2 = 6
		// ...
		// 3 x 9 = 27

		// 1번만 실행;조건(계속비교);실행이 끝나면 변화
		// 시작;끝;변화

		Scanner scanner = new Scanner(System.in);

		System.out.println("숫자를 입력하세요.");
		int number = scanner.nextInt();

		for (int i = 1; i <= 9; i++) {
			int result = number * i;
			System.out.println(number + " * " + i + "=" + result);
		}

	}
}