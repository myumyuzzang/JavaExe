package ch09.Interface13.factroy01;

import ch09.Interface13.ICar;

public class FordCar implements ICar {

	@Override
	public void turnOn() throws InterruptedException {
		System.out.println("FordCar - The engine starts smoothly~F");
		Thread.sleep((long)(Math.random()*500) + 500);

	}

	@Override
	public void turnOff() throws InterruptedException {
		System.out.println("FordCar - The engine starts smoothly. Off well~F");
		Thread.sleep((long)(Math.random()*500) + 500);

	}

	@Override
	public void accel() throws InterruptedException {
		System.out.println("FordCar - The accelerator is turbo-operated~F");
		Thread.sleep((long)(Math.random()*500) + 500);

	}

	@Override
	public void footBreak() throws InterruptedException {
		System.out.println("FordCar - The brake is operated smoothly~F");
		Thread.sleep((long)(Math.random()*500) + 500);

	}
}