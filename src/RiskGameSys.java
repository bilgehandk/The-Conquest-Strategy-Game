
public class RiskGameSys {

	private static ArrayList<Area> areas = new ArrayList<Area>();
	private static Player player1;
	private static Player player2;
	
	
	public void buySoldier(int numberOfSoldier, int index)
	{
		int priceOfSoldier = numberOfSolider*10;
		if(player1.getIsTurn())
		{
			if(Areas.get(index).equals(Areas))
			{
				if(player1.getGold() >= priceOfSoldier)
				{
					Areas.add(index, numberOfSoldier);
				}
				else {
					System.out.println("Your money is not enough. Try with less soldier amount.");
				}
				
			}	
			else {
				System.out.println("You need to enter less number of soldier");
			}
		}
	}
	
	public void checkPlace()
	{
		if(player1.getIsTurn() && Areas.owner == 1)
		{
			Areas.viewPanelMarket();
		}
		else if(player1.getIsTurn() && (Areas.owner == 2 || Areas.owner == 0))
		{
			Areas.viewPanelAttack();
		}
		else if(player2.getIsTurn() && Areas.owner == 2)
		{
			Areas.viewPanelMarket();
		}
		else
		{
			Areas.viewPanelAttack();
		}
	}
	
	
}
