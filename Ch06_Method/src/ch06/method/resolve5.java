package ch06.method;

public class resolve5 {
	/* 5. star(5);
	   을 입력하면 
	   *
	   **
	   ***
	   ****
	   *****
	   위처럼 출력되는 void star(int num) 메서드를 작성하고 사용해보세요.
	*/
	public static void main(String[] args) {
			star(5);
	}
	
	// star 메서드는 매개변수로 받은 num 값에 따라 별 모양을 출력
	// for문을 사용하여 i 변수를 1부터 num까지 반복하며 출력
	
    public static void star(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}