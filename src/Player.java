
public class Player {
	private boolean isTurn = false;
	private int gold;
	private int round;
	private String nickname;
	private String file;

	
	public boolean countRound()
	{
		round++;
		
		return true;
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


	public String getFile() {
		return file;
	}


	public void setFile(String file) {
		this.file = file;
	}
	
	
}
