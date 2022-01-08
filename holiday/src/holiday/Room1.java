package holiday;

public class Room1 {
	
	private Player player;
	private int stage;

	public Room1(Player player) {
		this.player = player;
		this.stage = 1;
	}
	
	
	public boolean roomStage1() {
		System.out.println("초딩이랑 놀아주기");
		
		return false;
	}
	public boolean roomStage2() {
		System.out.println("중딩이랑 놀아주기");
		player.playerUsingSkill(stage);
		return true;
	}
	public boolean roomStage3() {
		System.out.println("고딩이랑 놀아주기");
		return false;
	}

}
