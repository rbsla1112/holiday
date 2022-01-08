package holiday;

public class gameMachine implements Skill{

	@Override
	public void usingSkill(int stage, int num) {
		System.out.println("게임기 스킬 사용!");
	}
	
}
