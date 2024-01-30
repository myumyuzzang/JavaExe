package ch06.method;

import java.util.Scanner;

public class resolve2 {
	
	public static void main(String[] args) {
	// 2. 두 개의 정수를 받아서, 두 수의 차의 절대값을 계산하여 출력하는 메서드를 만들고
	// 사용해보세요. 메서드 호출 시 전달되는 값의 순서와 상관없이
	// 절대값이 계산되어서 출력되어야 합니다
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요.");
		int num0 = sc.nextInt();
		
		System.out.print("두번째 정수를 입력하세요.");
		int num1 = sc.nextInt();
		
		printAbsoluteDifference( num0, num1 );
		
		sc.close();
	}
		// printAbsoluteDifference는 두 개의 정수를 매개변수로 받아서
		// 두 수의 차를 구한 후 절대값을 계산함
		public static void printAbsoluteDifference(int num0, int num1) {
			// difference 변수 선언
			int difference;
			// if문을 사용해 2가지 경우로 나눔, 계산 후 값을 difference에 저장
			if (num0 > num1) {
				difference = num0 - num1;
			} else {
				difference = num1 - num0;
			}
			System.out.println("두 수의 차의 절대값: " + difference);
		}
	
	}
