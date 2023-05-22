
public class Archer extends Soldier{

	private final int power = 2;
	public Archer(int count) {
		super(count);
		this.price = 5;
		// TODO Auto-generated constructor stub
	}

	public static int getPrice() {
		return price;
	}
	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "ficuv";
	}

	@Override
	public int getCalculatedPower() {
		// TODO Auto-generated method stub
		return power * count;
	}
	
	

}
