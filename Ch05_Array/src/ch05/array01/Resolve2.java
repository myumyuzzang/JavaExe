package ch05.array01;

public class Resolve2 {
	public static void main(String[] args) {
		// 2. String 배열을 10명의 이름으로 초기화하고 역순으로 출력하세요
		
		String[] names = {"ethan", "leo", "oliver", "mattew", "dylan",
				"william", "alfie", "noah", "freddie", "theo"};
		
		for(int i = names.length - 1; i >=0; i--) {
			System.out.println(names[i]);
		}
	}
}
