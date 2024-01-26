package ch03.for10;

import java.util.Scanner;

public class Resolve2 {

	public static void main(String[] args) {
		//2. 369게임을 작성합니다.
		//   1~99까지의 정수를 입력받고
		//   3,6,9중 하나가 있으면 "박수짝"을 출력하고
		// 2개가 있으면 "박수짝짝"을 출력하세요
		//   예를 들어 13은 "박수짝"
		//   36인 경우는 "박수짝짝"을 출력하면 됩니다.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요: ");
		
		int number = scanner.nextInt();
		scanner.close();
		
			int quotient = number / 10; // 몫
			int remainder = number % 10; // 나머지
			
			if ((quotient == 3 || quotient == 6 || quotient == 9) && 
					(remainder == 3 || remainder == 6 || remainder == 9))
			{ System.out.println("박수짝짝");
			} else if (quotient == 3 || quotient == 6 || quotient == 9 ||
					remainder == 3 || remainder == 6 || remainder == 9)	{
			  System.out.println("박수짝");
			} else {
				System.out.println("박수없음");
			}
		}
							
	}


