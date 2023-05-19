
public class Jackman extends Soldier{

	
	public Jackman(int count) {
		super(count);
		super.power = 5;
		// TODO Auto-generated constructor stub
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
