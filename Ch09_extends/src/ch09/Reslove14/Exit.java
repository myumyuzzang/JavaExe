package ch09.Reslove14;

import java.util.Scanner;

public class Exit implements IQuestionAnswer {

	@Override
	public void question() {
		String question = "4. Exit\r\n\r\n";
		
		System.out.println(question);

	}

	@Override
	public void answer(Scanner sc) {

	}

	public boolean isRun() {
		return false;
	}

}
