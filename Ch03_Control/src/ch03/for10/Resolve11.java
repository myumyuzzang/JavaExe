package ch03.for10;

public class Resolve11 {

	public static void main(String[] args) {
		// 11. for문을 이용해서 1부터 10까지 중에 짝수만 출력하세요
		//   for문내에 조건문을 넣어주면 됨
		//   짝수 조건 if(num % 2 == 0)
		
		// 1번만 실행;조건(계속비교);실행이 끝나면 변화
		// 시작;끝;변화
		
		
		for(int num = 1 ; num <= 10; num++) {	
			if(num % 2 == 0)	{
				System.out.println(num);	
			}
		}
	}
}
	