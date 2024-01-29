package ch05.array08;

import java.util.Arrays;

public class Resolve3 {
	public static void main(String[] args) {
		// 3.  정수 배열 5개를 할당하고
		// System.out.println(Arrays.toString(numArr));
		// 로 배열을 출력했을 때 거꾸로 출력되도록
		// 배열의 값을 거꾸로 저장하세요.
		
		int[] numArr = {1, 3, 5, 7, 9}; // 정수 배열 선언 및 초기화
		
		System.out.println("변경 전 배열: " + Arrays.toString(numArr));
		
		// 배열의 값을 거꾸로 저장
		for(int i = 0; i < numArr.length / 2; i++) {
			int temp = numArr[i];
			numArr[i] = numArr[numArr.length - 1 - i];
			numArr[numArr.length - 1 - i] = temp;			
		}
		
		System.out.println("변경 후 배열: " + Arrays.toString(numArr));
	}
}
