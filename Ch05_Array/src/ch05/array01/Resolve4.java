package ch05.array01;

public class Resolve4 {
	public static void main(String[] args) {
		//	4. int배열을 10개 생성하세요.
		//	int배열에 3의 배수를 차례대로 저장하세요.
		//	그리고 거꾸로 출력하세요.
		int[] num = new int[10];
		
		// 3의 배수 저장
		for(int i = 0; i < num.length; i++) {
			num[i] = (i + 1) * 3;
		}
		
		// 거꾸로 출력
		for(int i = num.length - 1; i >= 0; i--) {
			System.out.println(num[i]);
		}
	}

}
