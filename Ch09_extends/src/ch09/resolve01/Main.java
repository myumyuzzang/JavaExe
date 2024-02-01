package ch09.resolve01;

public class Main {
public static void main(String[] args) {
	Add add = new Add();
	Div div = new Div();
	Mul mul = new Mul();
	Sub sub = new Sub();
	
	add.setValue(100, 20);
	sub.setValue(100, 20);
	mul.setValue(100, 20);
	div.setValue(100, 20);
	
	
	System.out.println("add.setValue() = " + add.calculate());
	System.out.println("sub.setValue() = " + sub.calculate());
	System.out.println("nul.setValue() = " + mul.calculate());
	System.out.println("div.setValue() = " + div.calculate());

}
}
