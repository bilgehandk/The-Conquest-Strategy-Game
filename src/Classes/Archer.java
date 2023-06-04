package Classes;

public class Archer extends Soldier{

	private static final int POWER = 2;
	private static final int PRICE = 5;

	public Archer(int count) {
		super(count);
	}

	public static int getPrice() {
		return PRICE;
	}

	@Override
	public String makeNoise() {
		return "The Archer unleashes a volley of arrows!";
		
	}

	@Override
	public int getAttackPower() {
		return POWER * getCount();
	}
}

