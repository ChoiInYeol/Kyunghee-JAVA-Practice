package character;
//Character Ŭ������ int Ÿ���� ü��(heart), ���ݷ�(power)�� ��������� �����ϴ�.
// �� ��������� �ʱⰪ�� 100, 100�Դϴ�.
//Character Ŭ������ ü�°� ���ݷ��� �Է����� �޾� �����ϴ� set �Լ��� �����ϴ�.
//Character Ŭ������ ü���� ����ϴ� print �Լ��� �����ϴ�.
//Character Ŭ������ ������ �Է����� �޾� ü���� ������Ʈ�ϴ� damage �Լ��� �����ϴ�.
public class Character {
	int heart; // ��� ���� : ü��
	int power; // ��� ���� : ���ݷ�
	Character() { // ����Ʈ ������
		heart = 100; 
		power = 100;
	}
	Character(int _heart, int _power) {  // ���� �μ��� �Է����� ��
		heart = _heart;
		power = _power;
	}
	
	int getHeart() {return this.heart;} // ���� �� ü���� ������ ��ȯ
	int getPower() {return this.power;} // ���� �� ���ݷ��� ������ ��ȯ
	void setHeart(int _heart) {this.heart = _heart;} // �� ü���� �����ϴ� �Լ�
	void setPower(int _power) {this.power = _power;} // �� ���ݷ��� �����ϴ� �Լ�
	void printHeart() { // ���� ü���� ����ϴ� �Լ�
		System.out.println("���� ü�� : " + heart);
	}
	void damage(int _power) { // ���� ü���� ������Ʈ�ϴ� �Լ�
		heart -= _power; // ������ ���ݷ¸�ŭ �� ü���� �����ϴ� �Լ�
	}
}