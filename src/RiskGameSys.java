import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

public class RiskGameSys {

	private static ArrayList<HexButton> Areas = new ArrayList<HexButton>();
	private static Player player1;
	private static Player player2;
	private static int roundCount = 1;
	private static int roundNum = 1;
	private static final int ROUND = 50;
	
	
	
	public static void increaseRoundCount() {
		roundCount++;
	}
	public static int getRoundCount() {
		return roundCount;
	}
	public static void increaseRound() {
		roundNum++ ;
	}
	
	public static int getRound() {
		return roundNum;
	}

	public Player getWinner()
	{
		int team1 = 0, team2= 0;
		if(player2.getRound() == 20)
		{
			HexButton ex;
			for (int i = 0; i < Areas.size(); i++) {
				ex = Areas.get(i);
				if(ex.owner == 1)
				{
					team1++;
				}
				else if(ex.owner == 2)
				{
					team2++;
				}
			}
			
			if(team1 > team2)
			{
				return player1;
			}
			else {
				return player2;
			}
			
		}
		
		return null;
	}
	
	
	public static Color setFirstColor(String color)
	{
		switch (color) {
		case "Red":
			return Color.RED;
		case "Green":
			return Color.GREEN;
		case "Blue":
			return Color.BLUE;
		case "Yellow":
			return Color.YELLOW;
		case "Purple":
			return Color.PINK;
		case "Orange":
			return Color.ORANGE;
		default:
			break;
		}
		
		return null;
	}
	
	public void changeColor(String color)
	{
		HexButton area;
		for (int i = 0; i < Areas.size(); i++) {
			area = Areas.get(i);
			if(area.owner == 1)
			{
				area.setBackground(Color.RED);
			}
			else if(area.owner == 2)
			{
				area.setBackground(Color.GREEN);
			}
			else {
				area.setBackground(Color.CYAN);
			}
			Areas.add(i, area);
		}
	}
	
//	public void IncreaseMoney()
//	{
//		
//		int money1 = player1.getGold();
//		int money2 = player2.getGold();
//		if(player2.countRound()){
//			player1.setGold(money1+10);
//			player2.setGold(money2+10);
//		}
//		
//	}
	
	public static boolean addSoldier(HexButton a, int amount, String type) {
		if(type.equalsIgnoreCase("Jackman")) {
			a.addSoldier(0, amount);
		}else if(type.equalsIgnoreCase("Archer")) {
			a.addSoldier(1, amount);
		}else if(type.equalsIgnoreCase("Spearman")){
			a.addSoldier(2, amount);
		}else {
			return false;
		}
		return true;
		
	}
	
	
	
	public static void startTheConquest() {
		
		player1.setGold(10);
		player2.setGold(10);
		player1.setTurn(true);
		player2.setTurn(false);
		while(roundCount < 50) {
			
			
			
			
			
			
			
			
			
			
			increaseRoundCount();
		}
	}
	
}
