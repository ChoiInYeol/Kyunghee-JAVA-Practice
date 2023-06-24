package java0624;
import java.util.Scanner;
public class CharacterEX {
	public static void delay( ) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) { // �빮�� I��
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Hero user = new Hero(100, 20, "�ο�", 10, 30);
		Tanker tanker = new Tanker(100, 20, "����");
		Healer healer = new Healer(100, 20, "�Ҷ�ī");
		
		Scanner scan = new Scanner(System.in);
		
		user.printAll();
		tanker.printAll();
		healer.printAll();
		
		int gameType = 1;
		while (gameType != 3) {
			System.out.println("���� �ൿ ���� : (1) MP ���� (2) �ο�� (3) ����");
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
				System.out.println("���� ���� : (1) ������ (2) ���� (3) ��������");
				int MonsterType = scan.nextInt();
				Monster monster;
				if (MonsterType == 1) {
					monster = new Monster(200, 20, "������", 5);
				}
				else if (MonsterType == 2) {
					monster = new Monster(300, 30, "����", 7);
				}
				else {
					monster = new Monster(450, 40, "��������", 10);
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
					
					System.out.println("-----���� ����-----");
					user.printAll();
					tanker.printAll();
					healer.printAll();
					delay();
					
					System.out.println("-----���� ����-----");
					System.out.print("���� ����� �����ϼ���. (1) ��Ÿ (2) ��ų : ");
					int type = scan.nextInt();
					monster.damage(user.attack(type));
					monster.printAll();
					delay();
					
					if (tanker.heart > 0) {
						System.out.println("-----��Ŀ ����-----");
						monster.damage(tanker.attack());
						monster.printAll();
						delay();
					}
					
					if (healer.heart > 0) {
						System.out.println("-----���� ����-----");
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
		System.out.println("������ ����Ǿ����ϴ�.");
	}
}
