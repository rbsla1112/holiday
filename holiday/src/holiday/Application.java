package holiday;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		/**
		 * [Java로 만든 Console 게임제작]
		 * 프로젝트명 : holiday
		 * 게임 설명 : 설날을 맞아 본가에 내려가게 된 주인공이 
		 * 			 초딩/중딩/고딩/강사님/호랑이 캐릭터를 만나 주어진 미니게임을 클리어하는 게임
		 * 			 5개의 미니 게임과 4개의 엔딩으로 구현하였다.
		 * 
		 * 클래스와 객체/ 상속과 다형성 / 추상클래스와 인터페이스의 개념을 이용하여 제작함.
		 * 이 게임은 .jar파일로 export한 뒤 holiday.exe 파일로 이클립스 외에서 실행 가능하도록 제작하였다.
		 * 
		 * 2022.1.7~2022.1.9 (3일간 제작)
		 * @author 팀4조 : 임수연 / 임태미 / 노현주 / 박서영 / 조윤호
		 * 
		 */
		
		System.out.println("\n[holiday]\t\tㅡ팀4조 제작 \n");

		
		System.out.println("----------------------------------");
		
		GameService gameService = new GameService();
		
		gameService.gameStart();

	}

	/**
	 * <pre>
	* 게임 Rule을 출력한다.
	 * </pre>
	 * 
	 * @author 노현주
	 */
	void howToPlay() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 게임 Rule ======");
		System.out.println("[1. 캐릭터를 생성한 뒤 게임을 시작합니다.]");
		System.out.println("[2. Map은 총 다섯 개입니다: 1. 집 밖, 2. 초딩방, 3. 중딩방, 4. 고딩방, 5. 내 방]");
		System.out.println("[3. 주어진 체력은 5 입니다. 체력이 모두 깎이면 Game Over!");
		System.out.print("▶계속 읽으시려면 Enter : ");
		String check1 = sc.nextLine();
		System.out.println("[1. 집 밖 - 궁금하다면 나가 보시지~!]");
		System.out.println("[2. 초딩방 - 초딩의 예의 없는 말투에 대처하면 Clear!]");
		System.out.print("▶계속 읽으시려면 Enter : ");
		String check2 = sc.nextLine();
		System.out.println("~선택한 기본 스킬이 어디에 쓰일지 생각해 보세요~");
		System.out.println("[3. 중딩방 - 넌센스 퀴즈를 모두 풀면 Clear!]");
		System.out.println("[4. 고딩방 - 3자리 랜덤숫자를 맞히면 Clear!]");
		System.out.println("[5. 내 방 - 주어진 전공 문제를 모두 풀면 Clear!]");
	}
}
