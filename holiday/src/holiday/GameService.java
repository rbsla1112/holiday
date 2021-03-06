package holiday;

import java.io.IOException; // 입력 제어
import java.util.Scanner;

public class GameService {

	
	Player player;
	int life = 5;

	int skillChoice=0;
	void gameStart() {
		
		Scanner sc = new Scanner(System.in);
		String name ="";
		char skillChoice;
		
		
		//캐릭터 프로필생성
		System.out.println("----------------------------------");
		System.out.print("\n내 이름은 : ");
		name = sc.next();
		
		System.out.println("\n설날에 본가에 내려가게 된 " + name + "...");
		System.out.println("엄마의 미션으로 급식이 조카들을 돌보라는 미션을 받게 되는데...");
		System.out.println(name + " : 본가에 가져갈 물건부터 챙기자.");
		
		// skill 선택에 따른 Player 객체 초기화
		skillchoice: while (true) {
			System.out.print("\n(1)책   (2)게임기   (3)노트북\n하나를 선택하자.(숫자 입력) > ");
			
			skillChoice = sc.next().charAt(0);
			
			if (skillChoice == 49) {
				player = new Player(name, new Book());
				break skillchoice;
			} else if ((int)skillChoice == 50) {
				player = new Player(name, new gameMachine());
				break skillchoice;
			} else if ((int)skillChoice == 51) {
				player = new Player(name, new notebook());
				break skillchoice;
			} else {
				System.out.println("숫자를 입력해야지!");
				continue skillchoice;
			}
		}

		 //노트북을 고른 사람은 내 방으로 바로 가야 함
		if (player.getSkill() instanceof notebook) {
			// 공부 하러 가는 것 구현
			System.out.println("\n애들이랑 노는 것보다 공부가 더 중요하지... 오늘 퀴즈 풀어야 한다구...");
			studingWithteacher();
			pause();
			return;
		}

		// 반복문 나가는 라벨 추가 @임태미
		exit: 
			while (true) {
			System.out.println("\n(1) 밖으로 (2) 조카들과 놀아주기 (3) 조용한 내 방");
			System.out.print("어디로 갈까? ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				// 결과를 논리값으로 리턴받아 참이면 게임진행 거짓이면 게임오버

				boolean ending1 = goOut();
				if (ending1 == true) {
					break;
				} else {
					pause();
					break exit;
					
				}
			case 2:
				boolean ending2 = playingWithBrother();
				if (ending2 == true) {
					// 사촌동생들과 잘 놀아준 엔딩
					System.out.println("\n" + player.getName() + ": 난 이제 지쳤어요... 공부는 못 하겠어...");
					System.out.println("조카들: 추석에 또 올게~!");
					pause();
					return;
				} else {
					pause();
					break exit;
				}
			case 3:
				if (!(player.getSkill() instanceof notebook)) {
					System.out.println("\n노트북 없이는 공부할 수 없다! 다른 선택지를 골라보자...");
				} else {
					studingWithteacher();
					break exit;
				}
				break;
			}
		}
	}

	/* 강사님 시험 엔딩 */
	void studingWithteacher() {
		Room1 room = new Room1(player);
		
		int num = room.roomStage5(player);
		
		System.out.println("\n내 점수는...! " + num + "점이다...");
		switch (num) {
		case 0:
			System.out.println("\n우별림 강사님: " + player.getName() + "씨... 내일 재시험 보셔야겠어요...");
			System.out.println(player.getName() + "... 조카랑도 안 놀아주고 공부했는데 이게 뭐람,,,");
			return;
		case 1:
			System.out.println("\n우별림 강사님: " + player.getName() + "씨... 분발하셔야겠어요...! 설 연휴동안 공부 열심히 하세요~");
			return;
		case 2:
			System.out.println("\n우별림 강사님: " + player.getName() + "씨 잘하셨네요~ 설 연휴 끝나고 봅시다~");
			return;
		case 3:
			System.out.println("\n우별림 강사님: " + player.getName() + "씨 공부 열심히 하셨나 봐요! 설 연휴 끝나고 봅시다~");
			return;
		}

	}

	boolean playingWithBrother() {
		Room1 room = new Room1(player);

		/*
		 * 초딩 중딩 고딩 순으로 게임 메소드 호출 생명력을 확인하여 0이 되면 게임종료 체력이 남아있으면 다음 스테이지 도전
		 */
		System.out.println("\n현재 내 체력은 " + player.getLife());
		room.roomStage1();
		// 체력소진시 게임오버
		if (player.getLife() == 0) {
			player.gameOver();
			return false;
		}

		System.out.println("\n현재 내 체력은 " + player.getLife());

		room.roomStage2();
		// 체력소진시 게임오버
		if (player.getLife() == 0) {
			player.gameOver();
			return false;
		}
		System.out.println("\n현재 내 체력은 " + player.getLife());

		room.roomStage3();
		// 체력소진시 종료 / 체력이 남은경우 true;
		if (player.getLife() == 0) {
			player.gameOver();
			return false;
		} else {
			pause();
			return true;
		}
	}

	boolean goOut() {
		/**
		 * 호랑이 퀴즈 횟수: 2번 받아쓰기/거꾸로받아쓰기 1번째 문제를 틀리면 체력 -1, 두번째 문제를 맞췄을 경우 생존. 2번째 문제를 틀리면
		 * 체력이 0이 되며 게임 오버
		 * 
		 * @author 임태미
		 */
		System.out.println("\n▶밖으로 나왔다. \n시골은 정말 어둡다. 그런데 마당에 있는 건...?! \n" + "!!!!! 야생의 호랑이가 나타났다 !!!!! ");

		System.out.println("*******************************************");
		
		System.out.println("[Tiger Game Start!!!!!!!]");
		System.out.println("\n--------- 호랑이 굴에 들어가도 호랑이 말만 잘하면 살아 남는다 !!! ------");
		System.out.println();
		Scanner sc = new Scanner(System.in);

		String Q1 = "뜐젺흎냓쑚힗뼜낳";
		System.out.println("호랑이 : 어흥(" + Q1 + ")!!!");
		System.out.print("호랑이의 울음소리를 똑같이 따라해보자! : ");
		String str = sc.nextLine();
		System.out.println("\n"+ player.getName()+" : " + str + "!!!!!!!!!");

		if (str.equals(Q1)) {
			System.out.println("호랑이가 고개를 갸웃거린다.");

		} else {
			System.out.println("호랑이가 화가난 듯 거칠게 포효한다!!");
			System.out.println("생명력이 1 감소했습니다.");
			player.playerLifeMinus();

		}
		System.out.println();

		System.out.print("내 수중에 물건이라도 써볼까!? (y/n): ");
		char ch = sc.next().charAt(0);
		if (ch == 'y') {
			if (player.getSkill() instanceof notebook) {
				System.out.println("▶노트북으로 호랑이를 이길 순 없다.");
			} else if (player.getSkill() instanceof Book) {
				System.out.println("▶책으로 호랑이를 이길 순 없다.");
			} else if (player.getSkill() instanceof gameMachine) {
				System.out.println("▶닌텐도로 호랑이를 이길 순 없다.");
			}
		} else {
			System.out.println("▶쓸만한 물건은 없다.");
		}
		System.out.println();

		// 이 부분 스킬 메소드 호출하기.
//		player.playerUsingSkill(3);

		System.out.println();

		String Q2 = "흅젺뼜낳껵죤쎣"; // 쎣죤껵낳뼜젺흅

		System.out.println("호랑이 : 어흥(" + Q2 + ")!!!");
		System.out.print("이번엔 호랑이의 울음소리를 거꾸로 따라해보자! : ");
		sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println("\n"+player.getName()+" : " + str2 + "!!!!!!!!!");

		StringBuffer sb = new StringBuffer(Q2);
		String reverse = sb.reverse().toString();

		/* 엔딩 분기점 */
		// 정답을 맞춘경우 생존
		if (str2.equals(reverse)) {
			System.out.println("\n호랑이가 그대로 떠나갔다... 나 살아남은건가?");
			System.out.println();

			System.out.println("집안으로 서둘러 들어왔다.. 역시 집밖은 위험해");
			return true;

			// 정답을 못 맞춘 경우 게임오버
		} else {
			System.out.println("호랑이가 한층 화가났다..... 으아아아아아!!!");
			System.out.println("[당신은 호랑이에게 죽고 말았습니다]");
			
			return false;

		}
	}
	//콘솔 강제 종료 방지 메소드. 키보드로 입력 받도록 기다림. @박서영
	public static void pause() {
	     try {
	       System.in.read();
	     } catch (IOException e) { }
	   }
}
