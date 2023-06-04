package Classes;

public class Spearman extends Soldier{

	
	private static final int POWER = 3;
	private static final int PRICE = 7;

	public Spearman(int count) {
		super(count);
		// TODO Auto-generated constructor stub
	}
	
	public static int getPrice() {
		return PRICE;
	}

	@Override
	public String makeNoise() {
	     return "The Spearman charges forward with his spear!";
		}

	@Override
	public int getAttackPower() {
		return POWER * count;
	}
}
