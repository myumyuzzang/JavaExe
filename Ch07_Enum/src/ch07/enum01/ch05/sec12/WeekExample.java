package ch07.enum01.ch05.sec12;

import java.util.Calendar;

public class WeekExample {
	public static void main(String[] args) {
		// week 열거 타입 변수 선언
		Week today = null;
		
		// Calendar 얻기
		Calendar cal = Calendar.getInstance();
		
		// 오늘의 요일 얻기
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		// 숫자를 열거 상수로 변환해서 변수에 대입
		switch(week) {
		case 1: today = Week.SUNDAY; 	break;
		case 2: today = Week.MONDAY;	break;
		case 3: today = Week.THURSDAY; 	break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.TUSEDAY; 	break;
		case 6: today = Week.FIRDAY;	break;
		case 7: today = Week.SATURDAY; 	break;
		}
		
		// 열거 타입 변수를 사용
		if(today == Week.SUNDAY) {
			System.out.println("일요일 아침에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
	}
}
