package holiday;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
