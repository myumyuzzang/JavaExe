package ch05.array08;

import java.util.Arrays;

public class Resolve4 {
	public static void main(String[] args) {
		// 4.  정수 배열 5개를 할당하고
		// Arrays.sort를 사용하지 말고
		// 배열을 오름차순으로 정렬하도록 저장하세요.
		// 그리고 출력하세요.
		
		int[] numArr = {5, 2, 9, 1, 4}; // 정수 배열 선언 및 초기화
		
		System.out.println("정렬 전 배열: " + Arrays.toString(numArr));
		
		// 난수로 0~100000사이의 임의의 정수를 배열에 저장
//	+	for (int i = 0; i < numArr.length; i++) {
//	+		double dVal = Math.random();		 // 0~1사이의 실수 값
//	+		numArr[i] = (int)(dVal*100000);
//	+	}
		
		// 버블 정렬 알고리즘을 사용하여 배열을 오름차순으로 정렬
		
		for(int i = 0; i < numArr.length - 1; i++ ) {
			for (int j = 0; j < numArr.length - 1 - i; j++) {
				if (numArr[j] > numArr[j + 1]) {
					int temp = numArr[j];
					numArr[j] = numArr[j + 1];
					numArr[j + 1 ]= temp;						
				}
			}
		}
		System.out.println("정렬 후 배열: " + Arrays.toString(numArr));
	}
}
