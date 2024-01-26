package ch03.for10;

import java.util.Scanner;

public class Resolve12 {

	public static void main(String[] args) {
		//12. 양의 정수를 입력받고 그 수만큼 "감사합니다"를 출력하세요
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("양의 정수를 입력하세요.");
		int count = scanner.nextInt();
		
		for (int i = 0; i < count; i++) {
			System.out.println("감사합니다.");
		}
	}
}