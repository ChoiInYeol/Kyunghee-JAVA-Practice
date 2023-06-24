package character2;
// ���ݷ��� �����ڿ��� �Է� ���� ������ 2��
// ������ ���� ��, ���� ���ݷ��� 2���� �������� ����(damage  �Լ� �������̵�)
class Monster  extends Character{
	Monster(int _heart, int _power, String _name) {
		this.heart = _heart;
		this.power = 2 * _power;
		this.name = _name;
	}
	@Override
	void damage (int _power) {
		this.heart -= 2 * _power;
	}
	@Override
	void fight(Character A) {
		this.heart -= 2 * A.power; // �� A���� �¾Ҵ�
		A.setHeart(A.getHeart() - this.power); // �� A ���ȴ�
		System.out.printf("%s�� %s���� %d��ŭ ���ظ� �Ծ����ϴ�. | %s�� ���� ü�� : %d\n"
				, this.name, A.name, A.power, this.name, this.heart);
		System.out.printf("%s�� %s���� %d��ŭ ���ظ� �Ծ����ϴ�. | %s�� ���� ü�� : %d\n"
				, A.name , this.name, this.power, A.name, A.heart);
	}
}
