
public class Jackman extends Soldier{

	
	public Jackman(int count) {
		super(count);
		super.power = 5;
		this.price = 10;
		// TODO Auto-generated constructor stub
	}

	public static int getPrice() {
		return price;
	}
	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "hurra";
	}

	@Override
	public int getCalculatedPower() {
		// TODO Auto-generated method stub
		return power * count;
	}
	
	
}
