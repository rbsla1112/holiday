package holiday;

import java.util.Scanner;

public class GameService {
	
	Player player;
	int life = 5;
	

	void gameStart() {
		Scanner sc = new Scanner(System.in);
		String name ="";
		String skillChoice = "";

		System.out.print("플레이어 이름 : ");
		name = sc.next();
		System.out.print("스킬선택(book, notebook, gameMachine) :");
		skillChoice = sc.next();
		int menu = 0;
		
		// 스킬선택에 따른 Player 객체 초기화
		player = new Player(name, new Book());
		while(true) {
			System.out.println("1 : 나갈래, 2 : 조카랑 놀래, 3 : 강사님 만날래");
			System.out.print("어디가?");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: 
				goOut();
				break;
			case 2: 
				playingWithBrother();
				break;
			case 3: 
				studingWithteacher();
				break;
			
			}

		}
		
	}
	void studingWithteacher() {
		System.out.println("강사님과 공부");
		
	}
	void playingWithBrother() {
		Room1 room = new Room1(player);
		if(room.roomStage1())
			System.out.println("초딩이 만족한다!");
		else {
			System.out.println("초딩이 화났다! 엄마의 등짝스매싱");
			return;
		}
		if(room.roomStage2())
			System.out.println("중딩이 만족한다!");
		else {
			System.out.println("중딩이 화났다! 엄마의 등짝스매싱");
			return;
		}
		if(room.roomStage3())
			System.out.println("고딩이 만족한다!");
		else {
			System.out.println("고딩이 화났다! 엄마의 등짝스매싱");
			return;
		}
		
		
	}
	void goOut() {
		System.out.println("호랑이 만남");
		player.setLife(--life);
		if(life == 0) {
			System.out.println("호랑이에게 죽음...");
			return;
		}
		else
			System.out.println("호랑이에게 살아돌아왔다..");
		
	}
}
