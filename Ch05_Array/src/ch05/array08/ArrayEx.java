package ch05.array08;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		// 이차원 배열
		// arr은 1차원 배열을 가르키는 3개의 참조변수 배열을 가리킨다.(참조값을 가진다)
		int[][] arr = new int[3][];
		// arr의 배열 요소는 1차원 배열을 가리킨다. (참조값을 가진다)
		arr[0] = new int[2];
		arr[1] = new int[2];
		arr[2] = new int[2];
		
		for(int i = 0; i <arr.length;i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = i*3 + j;
			}
		}
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		for(int[] temp : arr)
		System.out.println(Arrays.toString(temp));
	}
}
