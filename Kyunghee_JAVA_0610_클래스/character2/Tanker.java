package character2;
class Tanker extends Character{
	Tanker(int _heart, int _power, String _name) {
		this.heart = 2 * _heart;
		this.power = _power;
		this.name = _name;
	}
	@Override
	void damage(int _power) {
		this.heart -= _power / 2;
	}
	
	@Override
	void fight(Character A) {
		this.heart -= (A.power / 2); // �� A���� �¾Ҵ�
		A.setHeart(A.getHeart() - this.power); // �� A ���ȴ�
		System.out.printf("%s�� %s���� %d��ŭ ���ظ� �Ծ����ϴ�. | %s�� ���� ü�� : %d\n"
				, this.name, A.name, A.power, this.name, this.heart);
		System.out.printf("%s�� %s���� %d��ŭ ���ظ� �Ծ����ϴ�. | %s�� ���� ü�� : %d\n"
				, A.name , this.name, this.power, A.name, A.heart);
	}
	
}
