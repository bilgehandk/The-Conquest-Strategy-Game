package Classes;

public class Jackman extends Soldier {

	private static final int POWER = 5;
	private static final int PRICE = 10;

	public Jackman(int count) {
		super(count);
	}

	public static int getPrice() {
		return PRICE;
	}

	@Override
	public String makeNoise() {
		return "The Jackman swings his weapon with great strength!";
	}

	@Override
	public int getAttackPower() {
		// TODO Auto-generated method stub
		return POWER * getCount();
	}
}
