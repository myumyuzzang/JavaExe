package ch06.method;

import java.util.Scanner;

public class resolve1 {

	public static void main(String[] args) {
		// 1. 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
		// 작은 값을 반환하는 메서드를 작성하고 사용하세요

		// 사용자로부터 정수 입력
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수를 입력하세요.");
		int num0 = sc.nextInt();

		System.out.print("두번째 정수를 입력하세요.");
		int num1 = sc.nextInt();
		// getmax 메서드와 getmin 메서드를 호출하여 큰 값과 작은 값을 구함
		int max = getMax(num0, num1);
		int min = getMin(num0, num1);

		System.out.println("더 큰 값: " + max);
		System.out.println("더 작은 값: " + min);
	}

	// getmax 메서드에서는 두 정수를 비교해 더 큰 값을 반환
	// a>b일 경우 a를 반환하고, 그렇지 않으면 b를 반환함
	public static int getMax(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	// getmin 메서드에서는 두 정수를 비교해 더 작은 값을 반환
	// a<b일 경우 b를 반환하고, 그렇지 않으면 a를 반환함
	public static int getMin(int a, int b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}
}
