package ch09.resolve03;

import java.util.Arrays;

/*3. 다음 두 개의 static메소드를 가진 ArrayUtility클래스를 만들어보고 사용해보세요
  static double[] intToDouble(int[] source);	// int배열을 double배열로 변환
  static int[] doubleToInt(double[] source);	// double배열을 int배열로 변환
*/

public class ArrayUtilityMain {
	public static void main(String[] args) {
		
	
	int[] intArr = new int[] {31, 11, 9, 99, 2};
	double[] dArr = ArrayUtility.intToDouble(intArr);
	System.out.println(Arrays.toString(intArr));
	System.out.println(Arrays.toString(dArr));

	
	

	double[] dArr1 = new double[] {2.1, 3.4, 5.5, 7.9, 1.2};
	int[] intArr1 = ArrayUtility.doubleToInt(dArr1);
	System.out.println(Arrays.toString(dArr1));
	System.out.println(Arrays.toString(intArr1));
	
}

}