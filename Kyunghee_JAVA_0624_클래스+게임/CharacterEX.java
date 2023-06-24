package java0624;
import java.util.Scanner;
public class CharacterEX {
	public static void delay( ) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { // 대문자 I임
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Hero user = new Hero(100, 20, "인열", 10, 30);
		Tanker tanker = new Tanker(100, 20, "오른");
		Healer healer = new Healer(100, 20, "소라카");
		
		Scanner scan = new Scanner(System.in);
		
		user.printAll();
		tanker.printAll();
		healer.printAll();
		
		int gameType = 1;
		while (gameType != 3) {
			System.out.println("다음 행동 선택 : (1) MP 포션 (2) 싸우기 (3) 종료");
			gameType = scan.nextInt();
			if (gameType == 3)
				break;
			if (gameType == 1) {
				if (user.money >= 10) {
					user.money -= 10;
					user.mp += 10;
					user.printAll();
				}
			} else {
				System.out.println("몬스터 선택 : (1) 달팽이 (2) 돼지 (3) 엑스텀프");
				int MonsterType = scan.nextInt();
				Monster monster;
				if (MonsterType == 1) {
					monster = new Monster(200, 20, "달팽이", 5);
				}
				else if (MonsterType == 2) {
					monster = new Monster(300, 30, "돼지", 7);
				}
				else {
					monster = new Monster(450, 40, "엑스텀프", 10);
				}
				
				while (true) {
					if (tanker.heart == 0) {
						user.damage(monster.attack());
					}
					else
						tanker.damage(monster.attack());
					if (healer.heart != 0) {
						healer.damage(monster.attack());
					}
					
					System.out.println("-----몬스터 공격-----");
					user.printAll();
					tanker.printAll();
					healer.printAll();
					delay();
					
					System.out.println("-----유저 공격-----");
					System.out.print("공격 방법을 선택하세요. (1) 평타 (2) 스킬 : ");
					int type = scan.nextInt();
					monster.damage(user.attack(type));
					monster.printAll();
					delay();
					
					if (tanker.heart > 0) {
						System.out.println("-----탱커 공격-----");
						monster.damage(tanker.attack());
						monster.printAll();
						delay();
					}
					
					if (healer.heart > 0) {
						System.out.println("-----힐러 공격-----");
						monster.damage(healer.attack());
						monster.printAll();
						delay();
					}
					System.out.println("--------------------");
					
					if (monster.heart <= 0) {
						user.money += monster.money;
						break;
					}
					if (user.heart <= 0) {
						gameType = 3;
						break;
					}
				}
			}
		}
		System.out.println("게임이 종료되었습니다.");
	}
}
