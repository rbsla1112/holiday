package holiday;

public class notebook implements Skill {
	
	// 노트북을 선택한 사람 - 내 방 가서 공부하기
	@Override
	public void usingSkill(int stage, int num) {
		System.out.println("노트북을 꺼냈다.");
		return;
	}
}