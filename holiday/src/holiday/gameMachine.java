package holiday;

public class gameMachine implements Skill{
	final String [] HINT = new String[] {
			"초성 ㅊㅅ",
			"초성 ㄹㄷㅈ",
			"초성 ㄱㄹㅂ",
			"초성 ㅇㅈ",
			"초성 ㄹㅂ",
			"초성 ㅌㄷㅌㄷ",
			"숫자 19가 포함",
			"초성 ㅇㅂㅇ",
			"초성 ㄸㄱㅉ",
			"초성 ㄸㄱㅁㅉ"
	};
	@Override
	public void usingSkill(int stage, int num) {
		// TODO Auto-generated method stub
		System.out.println("게임기 스킬 사용!");
		
		if(stage == 2)
		System.out.println("힌트 : " + HINT[num]);
	}
	
}