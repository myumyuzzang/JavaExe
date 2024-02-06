package ch09.Reslove14.question02;

import ch09.Interface13.ICar;
import ch09.Reslove14.question02.ITablet;

public class TabletTester {
	private final int TEST_NUM = 3;
	private ITablet tablet;

	public TabletTester (ITablet tablet) {
		this.tablet = tablet;
	}
	
	public TabletTester() {
		
	}
	
	public void setTablet(ITablet tablet) {
		this.tablet = tablet;
	}
		
	public int MusicTest() throws InterruptedException {
		for (int i = 0; i < TEST_NUM; i++) {
			tablet.music();
		}
		return (int) (Math.random()*50) + 50;		// 50 이상 ~ 99 이하
	}
	
	public int footBreakTest() throws InterruptedException {
		for (int i = 0; i < TEST_NUM; i++) {
		}
		return (int) (Math.random()*50) + 50;		// 50 이상 ~ 99 이하
	}
	public int readbookTest() throws InterruptedException {
		for (int i = 0; i < TEST_NUM; i++) {
		}
		return (int) (Math.random()*50) + 50;		// 50 이상 ~ 99 이하
	}
}
