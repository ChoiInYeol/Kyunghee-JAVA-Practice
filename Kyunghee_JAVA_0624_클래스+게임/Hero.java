package java0624;
public class Hero extends Character {
	// ����� Ŭ������ ��� ����
	int mp;
	int money;
	
	// ��� �� ������ ����
	Hero(int heart, int power, String name, int mp, int money) {
		super(heart, power, name);
		this.mp = mp;
		this.money = money;
	}
	
	Hero() {
		super(); // �θ� Ŭ������ ����Ʈ ������ �ҷ�����
		this.mp = 10;
		this.money = 30;
	}

	int attack(int type) {
		if (type == 1) {	return power;} //  �⺻����
		else {
			if (mp < 5) {return power;} // ���� ����
			
			mp -= 5; // ��ų ���
			return (power * 3);
		}
	}
	
	void heal (int amount) {
		heart += amount;
	}
	
	int getMoney() {
		return money;
	}
	
	int getMP() {
		return mp;
	}
	
	@Override
	void printAll() {
		System.out.printf("ü�� : %d\n���ݷ� : %d\n�̸� : %s\n"
				+ "�� : %d\n���� : %d\n", heart, power, name, money, mp);
	}
}
