package ch05.array04;

import java.util.Scanner;

public class Resolve5 {
	public static void main(String[] args) {
			//5. int배열을 10개 생성하세요.
			//  사용자로부터 10개의 값을 입력받고
			//  순서대로 출력하고  총합을 구하세요
		Scanner sc = new Scanner(System.in);
		
		int[] numArr = new int[10];
		int total = 0;
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.print((i + 1) + "번째 입력 >> ");
			int num = sc.nextInt();
			total += num;
			numArr[i] = num;
		}
		
		for(int num : numArr)
			System.out.print(num + " ");
		System.out.println();
		System.out.println("총합 : " + total);
		
		sc.close();
	}
}
				
/*		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "번째 입력 >> ");
			num[i] = sc.nextInt();
		}
			int total = 0;
			double avg = 0.;
			for (int i = 0; i < num.length; i++) {
				total += num[i];
			}
			avg = total / num.length;

			System.out.println("총점: " + total);

			sc.close();
	
		}
	}
*/
