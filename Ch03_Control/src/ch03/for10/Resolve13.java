package ch03.for10;

import java.util.Scanner;

public class Resolve13 {

	public static void main(String[] args) {
		// 13. 양의 정수 입력받고 그 수만큼 3의 배수 출력하세요
		//     예를 들어 5를 입력받으면 3 6 9 12 15를 출력하면 됩니다
				
		// 1번만 실행;조건(계속비교);실행이 끝나면 변화
		// 시작;끝;변화
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("양의 정수를 입력하세요.");
		int count = scanner.nextInt();
		
		int number = 3; // int는 정수타입, 숫자 3 선언
		
		for (int i = 0; i < count; i++) {
			System.out.println(number);
			number += 3;
		}
	}
}