package ch13.Generic01.ch13.sec04;

public class GenericExample {
	//제한된 타입 파라미터를 갖는 제네릭 메소드
	/*Number이거나 Nymber의 자식 객체만 T에 전달 가능*/
	public static <T extends Number> boolean compara(T t1, T t2) {
		//T의 타입을 출력
		System.out.println("compara(" + t1.getClass().getSimpleName() + ", " +
		t2.getClass().getSimpleName() + ")" );
		
		//Number의 메소드 사용
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return (v1 == v2);
	}
	public static void main(String[] args) {
		//제네릭 메소드 호출
		boolean result1= compara(10, 20);
		System.out.println(result1);
		System.out.println();
		
		//제네릭 메소드 호출
		boolean result2 = compara(4.5, 4.5);
		System.out.println(result2);
	}

}
