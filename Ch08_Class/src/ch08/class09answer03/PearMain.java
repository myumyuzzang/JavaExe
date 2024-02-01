package ch08.class09answer03;

/* 3. 나는 마트에 가서 5000원을 주고 배 가격 2500를 샀다를 
   클래스로 설계해서 프로그래밍 하세요
 */
public class PearMain {
	public static void main(String[] args) {
		PearSeller seller = new PearSeller(20);
		PearBuyer buyer = new PearBuyer(5000);
		
		seller.showSaleResult();
		buyer.showBuyResult();
		
		buyer.buyPear(seller, 2500);
		
		seller.showSaleResult();
		buyer.showBuyResult();
	}

}
