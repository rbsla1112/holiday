package holiday;

public class Book implements Skill {

	// 책을 선택한 사람이 스킬 사용 박서영님
	@Override
	public void usingSkill(int stage, Player player) {
		// stage별로 구현, 1=호랑이, 2=초딩방, 3=중딩방, 4=고딩방, 내 방 생각해보니까 북을 가질 수가 없네요...?
		switch (stage) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		}
	}
}
