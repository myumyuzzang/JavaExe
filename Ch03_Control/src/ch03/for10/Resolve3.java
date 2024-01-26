package ch03.for10;

import java.util.Scanner;

public class Resolve3 {

	public static void main(String[] args) {
		//3. 정수 3개를 입력받고 이 3개의 수로 삼각형을 만들 수 있는지를 판별하세요
		//   삼각형이 가능하려면 두 변의 합이 다른 한 변의 합보다 반드시 커야 합니다. (조건 연산자를 사용하세요)
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력하세요: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		
		scanner.close();
		
		boolean isTriangle = (num1 + num2 > num3) && (num2 + num3 > num1)
				&& (num3 + num1 > num2 );
		
		if (isTriangle) {
			System.out.println("입력한 정수로 삼각형을 만들 수 있습니다.");
		} else {
			System.out.println("입력한 정수로 삼각형을 만들 수 없습니다.");
			
		}
	
	}

}