import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

public class RiskGameSys {

	public static ArrayList<HexButton> Areas = new ArrayList<HexButton>();
	private static Player player1;
	private static Player player2;
	private static int roundCount = 1;
	private static int roundNum = 1;
	private static final int ROUND = 50;
	
	
	
//	public static void disableButtons(HexButton hex) {
//		for(HexButton a : RiskFrame.hexButtons) {
//			if(!a.equals(hex) && a.getOwnership() == hex.getOwnership()) {
//				a.setEnabled(false);
//			}
//		}
//	}
//	public static void enableButtons() {
//		for(HexButton a : RiskFrame.hexButtons) {
//			a.setEnabled(true);
//		}
//	}
	
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
	
	
	public static Color setColor(String color)
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
	
	public static void btnNuller(HexButton hex) {
		hex = null;
	}
	
	public static void attackFunc(HexButton attackSide, HexButton defendSide, int numOfUnit) {
		
		if(numOfUnit >= defendSide.getTotalPower()) {
			attackSide.setTotalPower(attackSide.getTotalPower() - numOfUnit);
			attackSide.setCharacter(attackSide.getTotalPower() + "");
			defendSide.setTotalPower(0);
			defendSide.setCharacter(defendSide.getTotalPower() + "");
		}else {
			defendSide.setTotalPower(defendSide.getTotalPower() - numOfUnit);
			defendSide.setCharacter(defendSide.getTotalPower() + "");
			attackSide.setTotalPower(attackSide.getTotalPower() - numOfUnit);
			attackSide.setCharacter(attackSide.getTotalPower() + "");
		}
			
	}
	
	public static void changeTurn() {
		player1.setTurn(!player1.getTurn());
		player2.setTurn(!player2.getTurn());
	}
	
	public static HexButton searchClicked() {
    	for(HexButton a : RiskGameSys.Areas) {
    		if(a.isClicked)
    			return a;
    	}
    	return null;
   }
	
	public static void setFirstColor(Player player1, Player player2)
	{
		HexButton btn;
		btn = Areas.get(0);
		btn.owner = 1;
		
		btn.setBackground(setColor(player1.getColor()));
		
		
		btn = Areas.get(39);
		btn.owner = 2;
		
		btn.setBackground(setColor(player2.getColor()));
		
	}
	
	public static void changeColor(Player player, HexButton btn)
	{
		
		
			int i = btn.getBtnIndex();
			if(btn.owner == 1)
			{
				btn.setBackground(setColor(player.getColor()));
			}
			else if(btn.owner == 2)
			{
				btn.setBackground(setColor(player.getColor()));
			}
			else {
				btn.setBackground(Color.GRAY);
			}
			Areas.add(i, btn);
		
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
	
	public static void buySoldier(Player player, int price) {
		player.setGold(player.getGold() - price);
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
