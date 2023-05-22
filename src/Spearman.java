
public class Spearman extends Soldier{

	
	public Spearman(int count) {
		super(count);
		super.power = 3;
		this.price = 7;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "picuv";
	}

	@Override
	public int getCalculatedPower() {
		// TODO Auto-generated method stub
		return power * count;
	}
	public static int getPrice() {
		return price;
	}
	

}
