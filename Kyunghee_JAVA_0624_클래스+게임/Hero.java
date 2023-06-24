package java0624;
public class Hero extends Character {
	// 히어로 클래스의 멤버 변수
	int mp;
	int money;
	
	// 상속 후 생성자 지정
	Hero(int heart, int power, String name, int mp, int money) {
		super(heart, power, name);
		this.mp = mp;
		this.money = money;
	}
	
	Hero() {
		super(); // 부모 클래스의 디폴트 생성자 불러오기
		this.mp = 10;
		this.money = 30;
	}

	int attack(int type) {
		if (type == 1) {	return power;} //  기본공격
		else {
			if (mp < 5) {return power;} // 마나 부족
			
			mp -= 5; // 스킬 사용
			return (power * 3);
		}
	}
	
	void heal (int amount) {
		heart += amount;
	}
	
	int getMoney() {
		return money;
	}
	
	int getMP() {
		return mp;
	}
	
	@Override
	void printAll() {
		System.out.printf("체력 : %d\n공격력 : %d\n이름 : %s\n"
				+ "돈 : %d\n마나 : %d\n", heart, power, name, money, mp);
	}
}
