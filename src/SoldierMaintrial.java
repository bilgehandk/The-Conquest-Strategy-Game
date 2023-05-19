import java.util.ArrayList;

public class SoldierMaintrial {
	
	public static int calcSoldierPower() {
		int totalPower = 0;
		for(Soldier a : soldierin) {
			totalPower += a.getCalculatedPower();
		}
		return totalPower;
	}

	public static ArrayList<Soldier> soldierin = new ArrayList();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jackman a = new Jackman(5);
		Archer b = new Archer(4);		
		Spearman c = new Spearman(6);
		soldierin.add(a);
		soldierin.add(b);
		soldierin.add(c);
		System.out.println(calcSoldierPower());
	}

}
