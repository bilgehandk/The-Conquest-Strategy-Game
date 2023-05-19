
public class Archer extends Soldier{

	private final int power = 2;
	public Archer(int count) {
		super(count);
		// TODO Auto-generated constructor stub
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
