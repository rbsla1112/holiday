package holiday;

public class Player {
	
	private String name;
	private Skill skill;
	private int life;
	
	public Player(String name, Skill skill) {

		this.name = name;
		this.skill = skill;
		this.life = 5;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public int getLife() {
		return life;
		
	}

	public void setLife(int life) {
		this.life = life;
	}
	
	public void playerUsingSkill(int stage) {
		skill.usingSkill(stage);
	}
	
}
