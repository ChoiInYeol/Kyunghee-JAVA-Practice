package java0624;
public class Monster extends Character {
	int money;
	
	Monster (int heart, int power, String name, int money) {
		super(heart, power * 2, name);
		this.money = money;
		// ���ʹ� ���ݷ� 2��
	}
	
	// ���ʹ� ���ط� 2��
	@Override
	void damage (int attack) {
		heart -= (attack * 2);
		if (this.heart < 0) this.heart = 0;
	}
}
