package character2;
public class Character {
	int heart; // ��� ���� : ü��
	int power; // ��� ���� : ���ݷ�
	String name;
	Character() { // ����Ʈ ������
		heart = 100; 
		power = 100;
		name = "";
	}
	Character(int _heart, int _power, String _name) {  // ���� �μ��� �Է����� ��
		heart = _heart;
		power = _power;
		name = _name;
	}
	
	int getHeart() {return this.heart;} // ���� �� ü���� ������ ��ȯ
	int getPower() {return this.power;} // ���� �� ���ݷ��� ������ ��ȯ
	String getName() {return this.name;} // �� �̸� ��ȯ
	void setHeart(int _heart) {this.heart = _heart;} // �� ü���� �����ϴ� �Լ�
	void setPower(int _power) {this.power = _power;} // �� ���ݷ��� �����ϴ� �Լ�
	void setName(String _name) {this.name = _name;} // �� �̸� ����
	void printHeart() { // ���� ü���� ����ϴ� �Լ�
		System.out.println(name + "�� ���� ü�� : " + heart);
	}
	void damage(int _power) { // ���� ü���� ������Ʈ�ϴ� �Լ�
		heart -= _power; // ������ ���ݷ¸�ŭ �� ü���� �����ϴ� �Լ�
	}
	
	void fight(Character A) {
		this.heart -= A.power; // �� A���� �¾Ҵ�
		A.setHeart(A.heart - this.power); // �� A ���ȴ�
		System.out.printf("%s�� %s���� %d��ŭ ���ظ� �Ծ����ϴ�. | %s�� ���� ü�� : %d\n"
				, this.name, A.name, A.power, this.name, this.heart);
		System.out.printf("%s�� %s���� %d��ŭ ���ظ� �Ծ����ϴ�. | %s�� ���� ü�� : %d\n"
				, A.name , this.name, this.power, A.name, A.heart);
	}
}