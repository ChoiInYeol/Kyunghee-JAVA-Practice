package java0624;
public class Character {
	// ��� ���� : ü��, ���ݷ�, �̸�
	int heart;
	int power;
	String name;
	
	Character() { // ����Ʈ ������
		heart = 100;
		power = 10;
		name = "user1";
	}
	
	Character(int _heart, int _power, String _name) { // ������ �����ε�
		heart = _heart;
		power = _power;
		name = _name;
	}
	
	void printAll() {
		System.out.printf("ü�� : %d\n���ݷ� : %d\n�̸� : %s\n", heart, power, name);
	}
	
	int attack() { // ���ݷ� ��ȯ �Լ�
		return power;
	}
	
	void damage(int attack) {
		this.heart -= attack;
		if (this.heart < 0) this.heart = 0;
	}
	
}
