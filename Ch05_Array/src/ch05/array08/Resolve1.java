package ch05.array08;

import java.util.Arrays;

public class Resolve1 {
	public static void main(String[] args) {
		// 1. 정수 배열 5개를 할당하고
		// Arrays.sort를 활용해서 최소값과 최대값을 얻으세요.
		
		int[] numbers = { 7, 3, 9, 1, 5}; // 정수 배열을 할당하고 초기화
		
		Arrays.sort(numbers); // 배열을 오름차순으로 정렬
		
		System.out.println("최소값: " + numbers[0]); 
		// numArr[0]은 정렬된 배열에서 가장 작은 값인 최소값을 의미
		System.out.println("최대값: " + numbers[numbers.length - 1]);  
		// numArr[numArr.length-1]은 정렬된 배열에서 가장 큰 값인 최대값을 의미
	}
}
