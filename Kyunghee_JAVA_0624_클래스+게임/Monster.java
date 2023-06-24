package java0624;
public class Monster extends Character {
	int money;
	
	Monster (int heart, int power, String name, int money) {
		super(heart, power * 2, name);
		this.money = money;
		// 몬스터는 공격력 2배
	}
	
	// 몬스터는 피해량 2배
	@Override
	void damage (int attack) {
		heart -= (attack * 2);
		if (this.heart < 0) this.heart = 0;
	}
}
