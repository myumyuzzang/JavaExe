package ch09.Interface13.factroy01;

import ch09.Interface13.ICar;

public class ToyotaCar implements ICar {

	@Override
	public void turnOn() throws InterruptedException {
		System.out.println("ToyotaCar - 正確にエンジンがかかる~T");
		Thread.sleep((long)(Math.random()*500) + 500);

	}

	@Override
	public void turnOff() throws InterruptedException {
		System.out.println("ToyotaCar - エンジンがスムーズにオフになる~T");
		Thread.sleep((long)(Math.random()*500) + 500);

	}

	@Override
	public void accel() throws InterruptedException {
		System.out.println("ToyotaCar - アクセルがターボで動作する~T");
		Thread.sleep((long)(Math.random()*500) + 500);

	}

	@Override
	public void footBreak() throws InterruptedException {
		System.out.println("ToyotaCar - ブレーキがスムーズに動作される~T");
		Thread.sleep((long)(Math.random()*500) + 500);


	}

}
