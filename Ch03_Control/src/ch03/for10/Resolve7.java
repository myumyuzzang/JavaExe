package ch03.for10;

public class Resolve7 {

	public static void main(String[] args) {
		//7. do~while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요
		//   do~while문내에 조건문을 넣어주면 됨
		//   짝수 조건 if(num % 2 == 0);
		int num=1;
		
		do {if(num%2==0)
			System.out.println(num);
			num++;
		}
		while(num <= 10);
	
	}
}