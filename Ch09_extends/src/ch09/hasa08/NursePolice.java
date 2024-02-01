package ch09.hasa08;

public class NursePolice extends Police {
	
	private int thermometer;		// 체온계 개수
	
	public NursePolice(int clothes,int thermometers) {
		super(clothes);
		this.thermometer = thermometers;
	}
	public void calcThermometer() {
		if (thermometer > 0) {
			System.out.println("Check 36.5 Temp");
			thermometer--;
		} else {
			System.out.println("No Check Temp");
		}
	}

}
