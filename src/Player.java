
public class Player {
	private boolean isTurn = false;
	private int gold;
	private int round;
	private String color;
	private String nickname;
	private String file;

	public Player(String nickname, String color) {
		this.nickname = nickname;
		this.color = color;
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
