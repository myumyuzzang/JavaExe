package ch06.method;

import java.util.Scanner;

public class resolve4 {
	//4. gugudan(3);
	//   
	//   구구단 메서드를 void 리턴형으로 제작하세요.
	//  3을 입력하면 3단이 출력됩니다
	public static void main(String[] args) {
		
		// 스캐너 사용으로 구구단을 출력할 숫자 입력받을 수 있는 객체 생성		
		Scanner sc = new Scanner(System.in);
		// 숫자를 입력받기 위해 메세지 출력
		System.out.println("구구단을 출력할 숫자를 입력하세요 : ");
		// 숫자 입력, nextint 메서드 사용해서 정수 읽어오기
		int num = sc.nextInt();
		// 구구단 메서드를 호출해 입력된 숫자에 해당하는 구구단 출력
		gugudan(num);
		// 스캐너 객체 닫기
		sc.close();
}
		// 구구단 메서드는 입력된 숫자에 해당하는 구구단을 출력하는 역할
	public static void gugudan(int num) {
		// for 루프를 사용해서 1~9까지의 숫자와 입력된 숫자를 곱한 결과를 출력
		for (int i = 1; i <=9 ; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
}
