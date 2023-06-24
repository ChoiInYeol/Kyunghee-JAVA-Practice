package character2;
// 공격력은 생성자에서 입력 받은 변수의 2배
// 공격을 받을 때, 받은 공격력의 2배의 데미지를 입음(damage  함수 오버라이딩)
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
		this.heart -= 2 * A.power; // 나 A한테 맞았다
		A.setHeart(A.getHeart() - this.power); // 나 A 때렸다
		System.out.printf("%s가 %s에게 %d만큼 피해를 입었습니다. | %s의 남은 체력 : %d\n"
				, this.name, A.name, A.power, this.name, this.heart);
		System.out.printf("%s가 %s에게 %d만큼 피해를 입었습니다. | %s의 남은 체력 : %d\n"
				, A.name , this.name, this.power, A.name, A.heart);
	}
}
