package ch05.array08;

public class Resolve2 {
	public static void main(String[] args) {
		// 2. 정수 배열 5개를 할당하고
		// Arrays.sort를 사용하지 않고 최소값과 최대값을 얻으세요.
		
		int[] numArr = { 7, 3, 9, 1, 5};
		
		int min, max;
		min = max = numArr[0];
		
		for(int i=1; i<numArr.length;i++ ) {
		// 최소값
		if(min > numArr[i])
			min = numArr[i];
		// 최대값
		if (max < numArr[i])
				max = numArr[i];
				
		System.out.println("최소값은 " + numArr[0]);
		System.out.println("최대값은 " + numArr[numArr.length-1]);
		}
	}
}