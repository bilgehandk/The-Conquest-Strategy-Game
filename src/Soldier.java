
public abstract class Soldier {
	protected int power, count;
	
	public Soldier(int power, int count) {
		this.power = power ;
		this.count = count;
	}
	
	public abstract String makeNoise();
	public abstract int getCalculatedPower();
}
