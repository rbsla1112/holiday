package holiday;

public class Player {
	
	/* 노현주 메모 : 기존 코드에 String gender, int age 추가함. */
	private String name;
	private Skill skill;
	private int life;
	
	private String gender; //노현주 추가
	private  int age; //노현주 추가
	private String nickname; //노현주 추가
	
	public Player() {}
	public Player(String name, /*String gender, int age,*/ Skill skill) {
		this.name = name;
//		this.gender = gender; //노현주 추가
//		this.age = age; //노현주 추가
		this.skill = skill;
		this.life = 5;
	}
	
	/**
	 * <pre>
	 * 입력 받은 성별, 나이 토대로 호칭이 결정된다.
	 * </pre>
	 * @author 노현주
	 * @return 
	 * */
	public String nickname() {
//		new Player(name, gender,age, skill);
		if(gender.equalsIgnoreCase("f")) {
			if(age > 30) {
				this.nickname = "이모";
			} else {
				this.nickname = "누나";
			}
		} else {
			if(age > 30) {
				this.nickname = "삼촌";
			} else {
				this.nickname = "형";
			}
		}
		return this.nickname;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	
//	public void playerUsingSkill(int stage) {
//		skill.usingSkill(stage);
//	}
	
	public void playerLifeMinus() {
        this.life--;
    }
	
	public void gameOver() {
        System.out.println("[모든 체력을 잃었습니다. GameOver]");
    }
}
