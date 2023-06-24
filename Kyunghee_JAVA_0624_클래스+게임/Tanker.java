package java0624;
public class Tanker extends Character {
	Tanker (int heart, int power, String name) {
		super(heart * 2, power, name);
	}
	
	@Override
	void damage (int attack) {
		heart -= (attack / 2);
		if (this.heart < 0) this.heart = 0;
	}
}
