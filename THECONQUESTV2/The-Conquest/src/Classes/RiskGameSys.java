package Classes;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;

public class RiskGameSys {

	public static ArrayList<HexButton> Areas = new ArrayList<HexButton>();
	private static Player player1;
	private static Player player2;
	private static int roundCount = 0;
	private static int roundNum = 1;
	private static final int ROUND = 5;
	public static boolean finishScreen;
	public static boolean win;
	
	
	
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
	
	
	
	public static void DeleteButton(HexButton sent)
	{
		int index = sent.btnIndex;
		sent.setOwnership(0);
		sent.setTotalPower(0);
		Player ex = null;
		changeColor(ex, sent);
		Areas.add(index, sent);
		
	}
	
	
	public static void setPlayer1(String name, String color) {
		player1 = new Player(name, color);
	}
	public static void setPlayer2(String name, String color) {
		player2 = new Player(name, color);
	}
	
	public static Player getPlayer1() {
		return player1;
	}
	public static Player getPlayer2() {
		return player2;
	}
	
	public static void increaseGold()
	{
		int gold = player1.getGold();
		player1.setGold(gold + 20);
		gold = player2.getGold();
		player2.setGold(gold + 20);
	}
	
	public static void increaseRoundCount() {
		
		++roundCount;
		if(roundCount > 2)
		increaseGold();
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
	
	
	public static void attackFunc(HexButton attackSide, HexButton defendSide, int numOfUnit) {
		
		if(numOfUnit >= defendSide.getTotalPower()) {
			attackSide.setTotalPower(attackSide.getTotalPower() - numOfUnit);
			attackSide.setCharacter(attackSide.getTotalPower() + "");
			defendSide.setTotalPower(0);
			defendSide.setCharacter(defendSide.getTotalPower() + "");
			System.out.println("defend Index:" +defendSide.btnIndex);
			System.out.println("attack Index:" +attackSide.btnIndex);
			changeAttackColor(attackSide, defendSide);
			Areas.add(defendSide.btnIndex, defendSide);
			Areas.add(attackSide.btnIndex, attackSide);
		}else {
			defendSide.setTotalPower(defendSide.getTotalPower() - numOfUnit);
			defendSide.setCharacter(defendSide.getTotalPower() + "");
			attackSide.setTotalPower(attackSide.getTotalPower() - numOfUnit);
			attackSide.setCharacter(attackSide.getTotalPower() + "");
		}
			
	}
	
	public static void playerTurner() {
		player1.setTurn(!player1.getTurn());
		player2.setTurn(!player2.getTurn());
	}
	
	public static void changeTurn() {
		player1.setTurn(!player1.getTurn());
		player2.setTurn(!player2.getTurn());
	}
	
	public static HexButton searchClicked() {
    	for(HexButton a : Areas) {
    		if(a.isClicked == true)
    			return a;
    	}
    	return null;
   }
	
	public static void playerConversion(Player player1, Player player2) {
		player1.setTurn(!player1.getTurn());
		player2.setTurn(!player2.getTurn());
	}
	
	public static Player checkWinner()
	{
		int p1Count = 0, p2Count = 0;
		if(roundCount == 10)
		{
			for (int i = 0; i < Areas.size(); i++) {
				if (Areas.get(i).getOwnership() == 1) {
					p1Count++;
				}
				else if(Areas.get(i).getOwnership() == 2)
				{
					p2Count++;
				}
				
			}
			finishScreen = true;
			
			if(p1Count > p2Count)
			{
				return player1;
			}
			else {
				return player2;
			}
		}
		
		finishScreen = false;
		
		
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
	
	
	public static void changeAttackColor(HexButton btn1, HexButton btn2)
	{
		
		
		
			int i = btn2.btnIndex;
			System.out.println("btn2= "+btn2.owner);
			System.out.println("btn1=" +btn1.owner);
			if(btn2.owner == 1)
			{
				btn2.setBackground(setColor(player2.getColor()));
			}
			else if(btn2.owner == 2)
			{
				btn2.setBackground(setColor(player1.getColor()));
			}
			else {
				btn2.setBackground(Color.GRAY);
			}
			Areas.add(i, btn2);
		
	}
	
	public static void changeColor(Player player, HexButton btn)
	{
		
		
		
			int i = btn.btnIndex;
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
	
	public static boolean addSoldier(HexButton btn, int amount, String type) {
		if(type.equalsIgnoreCase("Jackman")) {
			btn.addSoldier(0, amount);
		}else if(type.equalsIgnoreCase("Archer")) {
			btn.addSoldier(1, amount);
		}else if(type.equalsIgnoreCase("Spearman")){
			btn.addSoldier(2, amount);
		}else {
			return false;
		}
		return true;
		
	}
	
	
	
	public static void buySoldier(Player player, int price) {
		player.setGold(player.getGold() - price);
	}
	
	
	
}
