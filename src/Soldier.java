
public abstract class Soldier {
	protected int power, count;
	
	public Soldier(int count) {
		this.count = count;
	}
	
	public abstract String makeNoise();
	public abstract int getCalculatedPower();
}
