package ch09.Reslove14;

import java.util.Scanner;

public interface IQuestionAnswer {
	public void question();				// 문제 출력
	public void answer(Scanner sc);		// 해답 풀이
	public boolean isRun();				// 계속 진행 여부
}
