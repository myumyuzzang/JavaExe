package ch03.control01;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		int score;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0~100 점수 입력 >> ");
		score = sc.nextInt();
		
		// if문은 ()안의 결과가 참일 때 소속 영역을 실행한다.
		if(score >= 90)
			System.out.println("A학점");

		// 한줄 이상일 경우 {} 괄호
//		if(score >= 90) {
//			System.out.println("A학점");
//		}
		
		sc.close();

	}

}
