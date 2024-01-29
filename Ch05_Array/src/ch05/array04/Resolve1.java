package ch05.array04;

public class Resolve1 {
	public static void main(String[] args) {
		// 1. String 배열을 10명의 이름으로 초기화하고 순서대로 출력하세요
		String[] names = {"ethan", "leo", "oliver", "mattew", "dylan",
				"william", "alfie", "noah", "freddie", "theo"};
		
		for(int i = 0; i < names.length; i++) 
			System.out.print(names[i] + ", ");
			System.out.println();
		
		for(String name : names)
			System.out.print(name + ", ");
		System.out.println();
	}	
}

