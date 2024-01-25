package ch03.while08;

public class Resolve3 	{
	
	public static void main(String[] args) {
		
		// 3. while문을 이용해서 1부터 10까지 합을 출력하세요
		// while : ()이 true인 동안 계속 반복하라
		
		int i=1, sum=0;
		while(i <= 10) { 
			sum += i;
			System.out.print(i + " : " + sum);
			System.out.println();
			i++;
		}
		System.out.println("1~10의 합은 " + sum);
		
//		int sum = 0;
//		int i = 1;
		
//		while(1 <= 10) {
//			sum += i;
//			i++;
//		}
//		System.out.println("1부터 10까지의 합 = " + sum);
	
	}
}
