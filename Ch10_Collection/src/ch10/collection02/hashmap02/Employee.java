package ch10.collection02.hashmap02;

public abstract class Employee {
	protected String empno;
	protected String name;
	
	public Employee(String empno, String name) {
		this.empno = empno;
		this.name = name;
	}
	public void showEmployeeInfo() {
		System.out.println("--------------------------");
		System.out.println("empno : " + empno );
		System.out.println("name : " + name );
	}
	public abstract double getMonthPay();		//추상 메서드
}
