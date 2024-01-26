package ch05.array05.ch05.sec09;

public class ArrayCopyExample {
	// 교재 188페이지 예문 배열 복사
	public static void main(String[] args) {
		// 길이가 3인 배열
		String[] oldStrArray = { "java", "array", "copy" };
		// 길이가 5인 배열을 새로 생성
		String[] newStrArray = new String[5];
		// 배열 항목 복사
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		// 배열 항목 출력
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
	}
}
