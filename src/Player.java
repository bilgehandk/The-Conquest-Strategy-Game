import java.util.ArrayList;

public class Player {
	private boolean isTurn = false;
	private int gold;
	private int round;
	private String color;
	private String nickname;
	private String file;
	
	private static ArrayList<HexButton> playerArrList = new ArrayList();

	public Player(String nickname, String color) {
		this.nickname = nickname;
		this.color = color;
	}

	public boolean getTurn() {
		return isTurn;
	}
	public static boolean searchButton(HexButton a) {
		for(HexButton hex : playerArrList) {
			if(hex.getBtnIndex() == a.getBtnIndex())
				return true;
		}
		return false;
	}
	public static boolean addBtn2Arr(HexButton a) {
		if(!searchButton(a)) {
			playerArrList.add(a);
		}
		return false;
	}
	
	public boolean isTurn() {
		return isTurn;
	}


	public void setTurn(boolean isTurn) {
		this.isTurn = isTurn;
	}


	public int getGold() {
		return gold;
	}


	public void setGold(int gold) {
		this.gold = gold;
	}


	public int getRound() {
		return round;
	}


	public void setRound(int round) {
		this.round = round;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getColor() {
		return color;
	}
	
}
