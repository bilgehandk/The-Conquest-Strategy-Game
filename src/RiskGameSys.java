import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

public class RiskGameSys {

	private static ArrayList<HexButton> Areas = new ArrayList<HexButton>();
	private static Player player1;
	private static Player player2;
	private static int roundCount = 1;
	private static int roundNum = 1;
	
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
	
	
	public static void changeColor(Player player) {
		
	}
//	public void buySoldier(int numberOfSoldier, int index)
//	{
//		int priceOfSoldier = numberOfSoldier *10;
//		if(player1.getIsTurn())
//		{
//			if(Areas.get(index).equals(Areas))
//			{
//				if(player1.getGold() >= priceOfSoldier)
//				{
//					Areas.add(index, numberOfSoldier);
//				}
//				else {
//					System.out.println("Your money is not enough. Try with less soldier amount.");
//				}
//				
//			}	
//			else {
//				System.out.println("You need to enter less number of soldier");
//			}
//		}
//	}
//	
//	public void checkPlace()
//	{
//		if(player1.getisturn() && areas.owner == 1)
//		{
//			areas.viewpanelmarket();
//		}
//		else if(player1.getisturn() && (areas.owner == 2 || areas.owner == 0))
//		{
//			areas.viewpanelattack();
//		}
//		else if(player2.getisturn() && areas.owner == 2)
//		{
//			areas.viewpanelmarket();
//		}
//		else
//		{
//			areas.viewpanelattack();
//		}
//	}
//	
}
