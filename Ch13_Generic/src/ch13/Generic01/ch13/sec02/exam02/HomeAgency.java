package ch13.Generic01.ch13.sec02.exam02;

public class HomeAgency implements Rentable<Home> {
	@Override
	public Home rent() {
		return new Home();
	}
}
