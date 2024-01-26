package ch03.for11;

import java.util.Scanner;

public class Resolve3 {	
	public static void main(String[] args) {
	// 교재 140페이지 7번
	// while 문과 Scanner의 nextLine() 메소드를 이용햐소 다음 실행 결과와 같이 키보드로부터
	// 입력된 데이터로 예금, 출금, 종료 기능을 제공하는 코드를 작성해보세요.
		
		int deposit, withdraw, num;
		int money = 0;
		boolean isRun = true;
		Scanner sc = new Scanner(System.in);
		while(isRun) {
			System.out.println("--------------------------------");
			System.out.println("1. 예금 |2. 출금 |3. 잔고 |4. 종료");
			System.out.println("--------------------------------");		
			System.out.print("선택> ");
			num = sc.nextInt();
			switch(num) {
			case 1:
				System.out.print("예금액> ");
				deposit = sc.nextInt();
				money += deposit;
				break;
			case 2:
				System.out.print("출금액> ");
				withdraw = sc.nextInt();
				if(money >= withdraw) money -= withdraw;
				else System.out.println("잔액이 부족합니다.");
				break;
			case 3:
				System.out.println("잔고> " + money);
				break;
			case 4:
				System.out.println("프로그램 종료");
				break;
			}
			if(num == 4) isRun = false;
		}
		sc.close();
	}
}