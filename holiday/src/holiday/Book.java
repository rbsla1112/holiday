package holiday;

public class Book implements Skill{
	
	@Override
	public void usingSkill(int stage) {
		// TODO Auto-generated method stub
		System.out.println("book 스킬 사용!");
		if(stage == 1 )
			System.out.println("초딩방에서 스킬사용");
	}

}
