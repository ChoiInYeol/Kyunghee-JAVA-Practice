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
		this.heart -= (A.power / 2); // 나 A한테 맞았다
		A.setHeart(A.getHeart() - this.power); // 나 A 때렸다
		System.out.printf("%s가 %s에게 %d만큼 피해를 입었습니다. | %s의 남은 체력 : %d\n"
				, this.name, A.name, A.power, this.name, this.heart);
		System.out.printf("%s가 %s에게 %d만큼 피해를 입었습니다. | %s의 남은 체력 : %d\n"
				, A.name , this.name, this.power, A.name, A.heart);
	}
	
}
