package Classes;

public abstract class Soldier implements Attackable{
	protected int power, count;
	protected static int price;
	
	public Soldier(int count) {
		this.count = count;
	}
	
	public abstract String makeNoise();
	

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}
