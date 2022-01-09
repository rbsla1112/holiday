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

	final String [] QUIZ2 = new String[]{
			"소나무가 삐지면?",
			"세상에서 가장 지루한 중학교는?",
			"반성문을 영어로 하면?",
			"아재가 좋아하는 악기는?",
			"토끼용 빗은?",
			"논리적인 사람이 총을 쏘면?",
			"세상에서 가장 쉬운 숫자는?",
			"바다가 뜨거우면?",
			"딸기가 도망가면?",
			
		};
	final String [] QUIZ2_ANSWER = new String[] {
			"칫솔",
			"로딩중",
			"글로벌",
			"아쟁",
			"레빗",
			"타당타당",
			"190000",
			"열받아",
			"딸기쨈",
				
		};
	final String [] room2ment = new String[] {
			"중딩 : 어이어이~ 틀리면 내 안의 흑염룡이 깨어난다고~!",
			"중딩 : 후후... 역시 나와 놀 자격은 없는건가..?",
			"중딩 : 훗.. 역시 넌 나와 놀 자격이 없어! 내안의 흑염룡이 깨기전에 도망가라고!",
			"중딩 : 내..내안의 흑염룡이 깨어난다아아!!",
			"흑염룡 : 나는 이제 세계 최강 흑염룡..! 넌 이제 내 상대가 될 수 없다.."
			
		};
		
		
	public boolean roomStage1() {
		System.out.println("*******************************************");


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
			
			System.out.println("[초딩과 잼민어로 말싸움 Start!!!!!!!]");
				System.out.println("초딩이랑 놀아주기 선택, 주어진 기회는 단 세번뿐!");
//				System.out.println("잘못입력시 점수는 깎이지 않지만 게임 횟수는 차감 당한다!");
				System.out.println("\n==========================================");
				System.out.println("오늘은 조카가 놀러온 날. 그런데 집안 어딘가로 사라진 조카가 조용하다.");
				System.out.println("잠시뒤 방하나를 돼지우리로 만들어버린 초딩 조카를 발견했다!");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("내가 소리친다. \"방이 이게 뭐야!\" ");
				System.out.println("조카가 대꾸했다. \n초딩 : 응~ 어쩔티비~ ");
				System.out.println("다음 중 조카를 이길 수 있는 답변이 있다.");
				System.out.println();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("=================== 보기 ===================");
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
					System.out.println("초딩 : 잘못골랐티비");
				}
				
				num ++;
				System.out.println();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				/* 두번째 게임 */
				System.out.println("조카가 다시 의기양양하게 소리쳤다! \"응~ 저쩔플레이스테이션~\" ");
				
				System.out.println("다음 중 조카를 이길 수 있는 답변이 있다.");
				System.out.println();
				System.out.println("=================== 보기 ===================");
				System.out.println("1. 저쩔전기톱");
				System.out.println("2. 저쩔다이소통돌이세탁기");
				System.out.println("3. 저쩔샤오미체중기");
				System.out.println("4. 저쩔삼성NeoQLEDTV");
				System.out.print("당신이 고른 번호는? : ");
				
				int game2 = sc.nextInt();
			
				if (game2 == 4) {
					System.out.println("이겼다!");
				} else if (game2 <= 4 && game2 > 0) {
					System.out.println("말싸움에서 졌다! \n자존심에 손상이 가 체력이 1 깍였다.");
					player.playerLifeMinus();
					scores--;
				} else { 
					System.out.println("초딩 : 잘못골랐스테이션");
					
				}
				
				num++ ;
				System.out.println();
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				/* 세번째 게임 */
				
				System.out.println("조카가 다시 의기양양하게 소리쳤다! \"응~ 저쩔람보르기니~\" ");
				System.out.println("다음 중 조카를 이길 수 있는 답변이 있다.");
				System.out.println("=================== 보기 ===================");
				System.out.println("1. 저쩔페라리라페라리");
				System.out.println("2. 저쩔다이슨V11청소기");
				System.out.println("3. 저쩔삼성NeoQLEDTV");
				System.out.println("4. 저쩔아반떼");
				System.out.print("당신이 고른 번호는? : ");
				int game3 = sc.nextInt();
				
				if (game3 == 1) {
					System.out.println("이겼다!");
				} else if (game3 > 1 && game3 <= 4) {
					System.out.println("말싸움에서 졌다! \n자존심에 손상이 가 체력이 1 깍였다.");
					scores--;
					player.playerLifeMinus();
				} else { 
					System.out.println("초딩 : 잘못골람보르기니");
				}
				num++;
				break;
				}
				
				/* 스코어가 0이상일시 true 반환, 그렇지않으면 false 반환 */
				if (scores > 0) {
					
					System.out.println("나는 숨을 한번 가다듬었다.");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
									
				System.out.println("\n"+player.getName() + " : 지리고요 오지고요 고요고요 고요한 밤이고요 "
						+ "\n실화냐? 다큐냐? 맨큐냐? 오져따리오져따 쿵쿵따리 쿵쿵따 "
						+ "\n산기슭이 인정하는 바이고요 슭곰발이 인정하는 바입니다~"
						+ "\n이거레알 반박불가 빼박캔트 버벌진트 버캔스탁인 부분 지리고요~ "
						+ "\n오지고 지리고 렛잇고 아리랑 고개를 넘어 새가 날아들어 좌로 인정 우로 인정 "
						+ "\n뒷구르기 인정 앞으로 인정 뒤로 인정 앞구르기 인정 옆구르기 인정 풍차돌리기 인정 "
						+ "\n레알마드리드 인정 공중회전세바퀴후 인정따리인정따~쿵취따취 "
						+ "\n샘오취리 갈취따취 에바쎄바쌈바디바 참치넙치꽁치삼치갈치뭉치면살고 "
						+ "\n흩어지면 씹인정하는 각이옵니다"
						+ "\n동의?어 보감~~");
					
					System.out.println(player.getName() +" : 잼민아... 이모 잘 하지?");
					
					System.out.println("\n초딩 : 인정하는 바 입니다.");
					
					return true;
				} 
				System.out.println("초딩 : 이겼고 지렸고 레릿고");
				player.playerLifeMinus();
				return false;
		}


	public boolean roomStage2() {
		System.out.println("*******************************************");
		stage = 2;
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("[중딩과 넌센스 게임 Start!!!!!!!!!]");
		System.out.println();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("게임 규칙");
		System.out.println("중딩이 문제를 내면 해당 문제를 입력하라!");
		System.out.println("총 5문제가 주어지며 1문제 틀릴때마다 체력이 깍인다!");
		System.out.println("가지고 있는 스킬로 해당 문제를 해결할 수 있다!");
		System.out.println();
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("스킬 발동 조건 - '스킬'입력");
		System.out.println("1. 책 - 중딩이 좋아하는 만화책을 주면 해당 문제 패스!");
		System.out.println("2. 게임기 - 게임기를 주면 힌트를 줄수도..?!");
		System.out.println("스킬은 2번만 사용가능하다!");
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("야생의 흑염룡 중딩을 만나다!");
		System.out.println("중딩 : 어이어이, 감히 나랑 놀아준다고 자격이 있는지 볼까?");
		System.out.println("중딩 : 문제를 내도록 하지");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String answer = "";
		int room2ment_index = 0;
		
		int count = 0;
		int skill_count = 2;
		
		int [] ran_num = new int[5];
		
		// 랜덤값 5개를 중복없이 배열에 넣어줌
		for(int i = 0 ; i < 5 ; i++) {
			ran_num[i] = (int)(Math.random()*10);
			for(int j = 0 ; j < i ; j++) {
				if(ran_num[i] == ran_num[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println("===================================");
		// 문제 5개 중딩이 내는 반복문
		while(count < 5) {
		
			System.out.println("문제 : " + QUIZ2[ran_num[count]]);
			System.out.print(player.getName() + " : ");
			answer = sc.next();
			System.out.println();
			
			
			// 중딩이 재시한 문제를 맞췄을 경우
			if(answer.equals(QUIZ2_ANSWER[ran_num[count]])) {
				
				// 문제가 마지막일 경우에 따른 화면 출력을 하기위해 if문 작성
				// 문제가 마지막이 아닐 경우
				if(count <4)
					System.out.println("중딩 : 정답이군.. 하지만 다음 문제는 어떨까?!");
				// 문제가 마지막일 경우
				else {
					System.out.println("player life : " + player.getLife());
					System.out.println();
				
					break;
				}
			// 문제를 안풀고 스킬 사용시 해당 스킬 발동
			}else if(answer.equals("스킬")) {
				if(skill_count == 0) {
					System.out.println("더이상 스킬을 사용 할 수 없어...");
					continue;
				}

				// 책 스킬 발동
				if(player.getSkill() instanceof Book) {
					player.playerUsingSkill(stage, ran_num[count]);
					count++;
					skill_count--;
					System.out.println("===================================");
					continue;
					
					
				}
				// 게임기 스킬 발동
				else {
					if(skill_count == 0)
						continue;
					player.playerUsingSkill(stage, ran_num[count]);
					
					System.out.print(player.getName() + " : ");
					answer = sc.next();
					skill_count--;
					if(answer.equals(QUIZ2_ANSWER[ran_num[count]])) {
						
						// 문제가 마지막일 경우에 따른 화면 출력을 하기위해 if문 작성
						// 문제가 마지막이 아닐 경우
						if(count <4)
							System.out.println("중딩 : 정답이군.. 하지만 다음 문제는 어떨까?!");
						// 문제가 마지막일 경우
						else {
							System.out.println("player life : " + player.getLife());
							System.out.println();
						
							break;
						}
					
					}else {
						
						System.out.println(room2ment[room2ment_index++]);
						// 플레이어 생명 -1
						player.playerLifeMinus();
						if(player.getLife() > 0)
							System.out.println("중딩 : 정답은 [" + QUIZ2_ANSWER[ran_num[count]] + "] ㅋㅋㅋㅋㅋㅋㅋ 그것도 못마췈ㅋㅋㅋ");
						// 플레이어의 생명이 0이 되었을 경우 게임오버(return으로 false)
						System.out.println();
						if(player.getLife()==0)
							return false;
					}
					
					
				}
			}
			// 문제를 틀렸을 경우
			else {
				
				System.out.println(room2ment[room2ment_index++]);
				// 플레이어 생명 -1
				player.playerLifeMinus();
				if(player.getLife() > 0)
					System.out.println("중딩 : 정답은 [" + QUIZ2_ANSWER[ran_num[count]] + "] ㅋㅋㅋㅋㅋㅋㅋ 그것도 못마췈ㅋㅋㅋ");
				// 플레이어의 생명이 0이 되었을 경우 게임오버(return으로 false)
				System.out.println();
				if(player.getLife()==0)
					return false;
			}
			
			count++;
			// 현재 남은 생명 화면에 출력
			System.out.println("\n현재 내 체력은 " + player.getLife());
			System.out.println();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("===================================");
		}
		
		// while문을 나왔다는 것은 문제를 다 풀었다는 뜻이므로 
		// return값을 true로 리턴
		System.out.println("중딩 : 후.. 이정도면 만족해주지(찡긋)");
		return true;
	}

	public boolean roomStage3() {
		System.out.println("*******************************************");
		stage = 3;
		
		System.out.println("[고딩과 숫자 야구 게임 Start!!!!!!!]");

		System.out.println("\n고딩 조카는 독특한 게임을 하나 제시한다. 바로 숫자 야구게임");
		System.out.println("고딩이가 마음속으로 생각한 랜덤한 숫자 3자리를 맞춰라!");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("같은 자리에 같은 숫자일 경우 1S (스트라이크) , 숫자만 같을경우 1B(볼) 이다!");
		System.out.println("기회는 단 5번! 맞추지 못할 경우 체력이 깍인다.");
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
		
		System.out.print("\n(실행확인용 random 값 : )");
		for (int i : random) {
			System.out.print(i);
		}
		System.out.println();

		int tryNum = 5; // 시도횟수
		int s = 0; // 스트라이크
		int b = 0; // 볼

		System.out.println("\n고딩 : 나 숫자 생각했어. 맞춰봐!");
		while (true) {
			
			System.out.println("고딩 : 자 " + tryNum + "번 남았어!");
			System.out.print("3자리의 숫자를 외쳐보자 !! : ");
			String str = sc.nextLine();

			/* 4자리 정수인지 확인 */
			if (str.length() != 3) {
				System.out.println("고딩 : 3자리 숫자라고~~");
				continue;
			}

			/* 입력한 값을 배열에 저장 */

			int[] answer = new int[3];

			for (int i = 0; i < 3; i++) {
				char ch = str.charAt(i); // 문자열을 문자로
				answer[i] = ch - 48;
				// 문자를 배열에 값저장 유니코드 정수로 값 변환하려면 -48 하기!
			}

			/* 스트라이크 확인 */
			for (int i = 0; i < 3; i++) {
				if (answer[i] == random[i]) {
					s++; // 스트라이크
					b--; // 볼 중복제거
				}
				/* 정답인 경우 */
				if (s == 3) {
					System.out.println("고딩 : 정답이야!! 헐 어떻게 바로 알지?");
					System.out.println("고딩 조카가 대단하다는 듯이 우러러본다. \'난 사실 독심술을...\'");
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
				System.out.println("고딩 : 아쉽다! " + s + "S, " + b + "B !");

				tryNum--; // 시도횟수 -1회
				s = 0; // 스트라이크 개수 초기화
				b = 0; // 볼 개수 초기화

				/* 게임 중간에 스킬을 쓸 수 있다. */
				if(tryNum==3) {
				if(player.getSkill() instanceof gameMachine) {
					System.out.println("\n잠깐 힌트 힌트!!! 게임기 빌려줄게!!!");
					System.out.println("\n고딩 : 아 정말 ~~ 알았어 하나만 알려줄게. 대신 게임기 내일까지 써도 되지?");
					System.out.println("고딩 : 첫번째 자리는 "+random[0]+" 이야" );
					continue;
					}
				}
				
				/* 시도 횟수가 0번이 되면 게임 종료 */
				if (tryNum == 0) {
					System.out.println("고딩 : 5번 안에 못 맞췄어. 아웃이야!");
					player.playerLifeMinus();
					
					System.out.println("고딩 조카는 게임이 끝나자 흥미를 잃었다. 다시 밖으로 나가자.");
					return false;
				}
			}
		}

	}

	// int로 수정하여 결과에 따라 선생님 멘트가 달라지도록 했음
	public int roomStage5(Player player) {
		System.out.println("*******************************************");
		stage = 5;
		int checkNum = 3;
		System.out.println("\n[내 방에서 java 공부하기.....Start]");
		System.out.println("\n에휴... 오늘 퀴즈 있다고 했어... 퀴즈 풀어야지 ㅠㅠ");
		System.out.println("(점수는 " + checkNum + "점 만점!)");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n우별림 강사님: 여러분 다 자리에 앉으셨죠? 자리에 계시면 확인 버튼 한 번 눌러주세요~");
		System.out.print("확인을 입력하세요 : ");
		String check = sc.next();
		if (check.equals("확인")) {
			System.out.println("\n네, 다들 들어오셨네요~ 퀴즈 시작할게요.");
		} else {
			System.out.println("\n우별림 강사님: " + player.getName() + "씨 아직 안 돌아오셨어요? 여러분... 수업 시간은 지키셔야죠...");
			System.out.println(player.getName() + ": 정말 죄송합니다... ㅠㅠ\n점수를 잃었습니다...");
			player.setLife(checkNum - 1);
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
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
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
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

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
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
