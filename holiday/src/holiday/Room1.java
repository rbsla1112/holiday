package holiday;

import java.util.Scanner;

public class Room1 {

	Scanner sc = new Scanner(System.in);

	private Player player;
	private int stage;

	public Room1(Player player) {
		this.player = player;
		this.stage = 1;
	}

	public boolean roomStage1() {


//			[답근거] :  더 비싼 것이 이긴다!
//				 저쩔티비 < 저쩔플레이스테이션 < 저쩔다이슨V11청소기 < 저쩔삼성NeoQLEDTV 
//				< 저쩔람보르기니 < 저쩔부가티시론 < 저쩔페라리라페라리
//				(단, 어쩔티비는 저쩔티비만이 이길 수 있다.)
//		    이게 무슨 근본없는 논리인가싶지만... 우리가 상태하는 것은 잼민이다
//				답 1,4,1
				
		/* 게임 세판 한정, 게임 도는 횟수를 저장할 변수 num, 단 잘못고른것은 세지않는다. */
		int num = 0;
				
		/* scores가 0보다 크기만 하면 메소드 호출문에 true 반환 */
		int scores = 3;
				
		/* 반복문 시작, 게임 횟수 0 <= num <= 3 일시 반복 */
		while (num < 3) {
				
				/* 첫번째 문제 */
				System.out.println("초딩이랑 놀아주기 선택, 주어진 기회는 단 세번뿐!");
				System.out.println("잘못입력시 점수는 깎이지 않지만 게임 횟수는 차감 당한다!");
				System.out.println("======================");
				System.out.println("오늘은 조카가 놀러온 날. 그런데 집안 어딘가로 사라진 조카가 조용하다.");
				System.out.println("잠시뒤 방하나를 돼지우리로 만들어버린 초딩 조카를 발견했다!");
				System.out.println("내가 소리친다. \"방이 이게 뭐야!\" ");
				System.out.println("조카가 대꾸했다. \"응~ 어쩔티비~\" ");
				System.out.println("다음 중 조카를 이길 수 있는 답변이 있다.");
				System.out.println();
				System.out.println("=====보기=====");
				System.out.println("1. 저쩔티비");
				System.out.println("2. 저쩔다이슨V11청소기");
				System.out.println("3. 저쩔플레이스테이션");
				System.out.println("4. 저쩔삼성NeoQLEDTV");
				System.out.print("당신이 고른 번호는? : ");
				int game1 = sc.nextInt();
				
				if (game1 == 1) {
					System.out.println("이겼다!");
				} else if (game1 >= 2 && game1 <= 4) {
					System.out.println("말싸움에서 졌다! \n자존심에 손상이 가 체력이 1 깍였다.");
					player.playerLifeMinus(); 
					scores--;
				} else { 
					System.out.println("잘못골랐티비");
				}
				
				num ++;
				System.out.println();
				
				/* 두번째 게임 */
				System.out.println("조카가 다시 의기양양하게 소리쳤다! \"응~ 저쩔플레이스테이션~\" ");
				
				System.out.println("다음 중 조카를 이길 수 있는 답변이 있다.");
				System.out.println();
				System.out.println("=====보기=====");
				System.out.println("1. 저쩔전기톱");
				System.out.println("2. 저쩔다이소통돌이세탁기");
				System.out.println("3. 저쩔샤오미체중기");
				System.out.println("4. 저쩔삼성NeoQLEDTV");
				System.out.print("당신이 고른 번호는? : ");
				
				int game2 = sc.nextInt();
			
				if (game2 == 4) {
					System.out.println("이겼다!");
				} else if (game2 <= 4 && game2 > 0) {
					System.out.println("말싸움에서 졌다!");
					player.playerLifeMinus();
					scores--;
				} else { 
					System.out.println("잘못골랐스테이션");
				}
				
				num++ ;
				System.out.println();
				
				/* 세번째 게임 */
				
				System.out.println("조카가 다시 의기양양하게 소리쳤다! \"응~ 저쩔람보르기니~\" ");
				System.out.println("다음 중 조카를 이길 수 있는 답변이 있다.");
				System.out.println("=====보기=====");
				System.out.println("1. 저쩔페라리라페라리");
				System.out.println("2. 저쩔다이슨V11청소기");
				System.out.println("3. 저쩔삼성NeoQLEDTV");
				System.out.println("4. 저쩔아반떼");
				System.out.print("당신이 고른 번호는? : ");
				int game3 = sc.nextInt();
				
				if (game3 == 1) {
					System.out.println("이겼다!");
				} else if (game3 > 1 && game3 <= 4) {
					System.out.println("말싸움에서 졌다!");
					scores--;
					player.playerLifeMinus();
				} else { 
					System.out.println("잘못골람보르기니");
				}
				
				num++;
				break;
				}
				
				/* 스코어가 0이상일시 true 반환, 그렇지않으면 false 반환 */
				if (scores > 0) {
					return true;
					
				} 
				player.playerLifeMinus();
				return false;
		}


	public boolean roomStage2() {
		System.out.println("중딩이랑 놀아주기");
//		player.playerUsingSkill(stage);
		player.playerLifeMinus();

		return true;
	}

	public boolean roomStage3() {
		System.out.println("고딩이랑 놀아주기");

		System.out.println("--------------- 게임 설명 ---------------");
		Scanner sc = new Scanner(System.in);

		int[] random = new int[3];

		/* 랜덤 숫자 발생 */
		for (int i = 0; i < 3; i++) {
			random[i] = (int) (Math.random() * 10);
			for (int j = 0; j < i; j++) {
				if (random[i] == random[j]) {
					i--;
				}
			}
		}
		System.out.print("실행확인용 random 값 : ");
		for (int i : random) {
			System.out.print(i);
		}
		System.out.println();

		int tryNum = 5; // 시도횟수
		int s = 0; // 스트라이크
		int b = 0; // 볼

		while (true) {
			System.out.println("자 " + tryNum + "번 남았어!");
			System.out.print("3자리의 숫자를 입력하세요 : ");
			String str = sc.nextLine();

			/* 4자리 정수인지 확인 */
			if (str.length() != 3) {
				System.out.println("3자리 숫자라고~~");
				continue;
			}

			/* 입력한 값을 배열에 저장 */

			int[] answer = new int[3];

			for (int i = 0; i < 3; i++) {
				char ch = str.charAt(i); // 문자열을 문자로
				answer[i] = ch - 48;
				// 문자를 배열에 값저장 유니코드 int로 값 변환하려면 -48 하기!
			}

			/* 스트라이크 확인 */
			for (int i = 0; i < 3; i++) {
				if (answer[i] == random[i]) {
					s++; // 스트라이크
					b--; // 볼 중복제거
				}
				/* 정답인 경우 */
				if (s == 3) {
					System.out.println("정답이야 !!");
					return true;
				}
			}
			/* 볼 확인 */
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (answer[i] == random[j]) {
						b++; // 볼
					}
				}
			}

			/* 정답이 아닌 경우 */
			if (s != 3) {
				System.out.println("아쉽다! " + s + "S, " + b + "B !");

				tryNum--; // 시도횟수 -1회
				s = 0; // 스트라이크 개수 초기화
				b = 0; // 볼 개수 초기화

				/* 시도 횟수가 0번이 되면 게임 종료 */
				if (tryNum == 0) {
					System.out.println("5번 안에 못 맞췄어. 아웃이야!");
					player.playerLifeMinus();

					return false;
				}
			}
		}

	}

	// int로 수정하여 결과에 따라 선생님 멘트가 달라지도록 했음
	public int roomStage5(Player player) {
		stage = 5;
		int checkNum = 3;
		System.out.println("\n----- 내 방 -----");
		System.out.println("\n에휴... 오늘 퀴즈 있다고 했어... 퀴즈 풀어야지 ㅠㅠ");
		System.out.println("(기회는 " + checkNum + "번!)");
		System.out.println("\n우별림 강사님: 여러분 다 자리에 앉으셨죠? 자리에 계시면 확인 버튼 한 번 눌러주세요~");
		System.out.print("확인을 입력하세요 : ");
		String check = sc.next();
		if (check.equals("확인")) {
			System.out.println("\n네, 다들 들어오셨네요~ 퀴즈 시작할게요.");
		} else {
			System.out.println("\n" + player.getName() + "씨 아직 안 돌아오셨어요? 여러분... 수업 시간은 지키셔야죠...");
			System.out.println(player.getName() + ": 정말 죄송합니다... ㅠㅠ\n점수를 잃었습니다...");
			player.setLife(checkNum - 1);
		}

		// 문제 제출
		// 1번
		System.out.println("\n우별림 강사님: 첫 번째 문제 드릴게요~");
		System.out.println("\n1. 다음은 무엇에 관한 설명인가?");
		System.out.println("(1) 서로 다른 패키지에 있는 클래스를 참조하기 위함이다.");
		System.out.println("(2) 소스 파일에 여러 번 선언이 가능하다.");
		System.out.println("(3) 클래스 선언 이전에 명시한다.");
		System.out.println("(4) 패키지 선언 다음에 명시한다.");
		System.out.println("(1) method   (2) import   (3) variable  (4) interface");

		int correctAnswer1 = 2;
		System.out.print("답 입력 > ");
		int answer1 = sc.nextInt();
		if (correctAnswer1 == answer1) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("오답입니다. 점수를 잃었습니다.");
			--checkNum;
		}

		// 2번
		System.out.println("\n우별림 강사님: 두 번째 문제 드릴게요~");
		System.out.println("\n2. 객체 배열에 대한 설명으로 옳은 것은?");
		System.out.println("(1) 객체 배열은 기본 자료형 2차원 배열과 유사한 레퍼런스 배열이다.");
		System.out.println("(2) 한 번의 할당으로 지정한 개수만큼 자동으로 객체가 생성된다.");
		System.out.println("(3) 생성된 객체의 인스턴스 변수에는 쓰레기값이 들어간다.");
		System.out.println("(4) 매모리에 객체들을 연속 나열한다.");

		int correctAnswer2 = 1;
		System.out.print("답 입력 > ");
		int answer2 = sc.nextInt();
		if (correctAnswer2 == answer2) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("오답입니다. 점수를 잃었습니다.");
			--checkNum;
		}

		// 3번
		System.out.println("\n우별림 강사님: 세 번째 문제 드릴게요~");
		System.out.println("\n3. 다음은 무엇에 관한 설명인가? (주관식, 한글로 적으세요)");
		System.out.println("(1) 추상화된 대상의 행위(기능)을 담당한다.");
		System.out.println("(2) 이것이 호출되면 수행에 필요한 메모리 영역을 할당 받는다.");

		String correctAnswer3 = "메소드";
		System.out.print("답 입력 > ");
		String answer3 = sc.next();
		if (correctAnswer3.equals(answer3)) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("오답입니다. 점수를 잃었습니다.");
			--checkNum;
		}

		return checkNum;
	}
}
