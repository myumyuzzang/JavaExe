package ch08.class09answer02;

import java.util.Scanner;

import ch08.class07.Restaurant;

// 1. 중화요리집을 임의대로 클래스로 만드세요.
public class ChineseMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Restaurant rest = 
				new Restaurant(sc, "중화요리집", 
					new String [] {"짜장면", "짬뽕", "탕수육"});
		rest.viewMenu();
		rest.selectFood();
		rest.deliveryFood();
		
		sc.close();
}
}