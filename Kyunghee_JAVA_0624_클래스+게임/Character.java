package java0624;
public class Character {
	// 멤버 변수 : 체력, 공격력, 이름
	int heart;
	int power;
	String name;
	
	Character() { // 디폴트 생성자
		heart = 100;
		power = 10;
		name = "user1";
	}
	
	Character(int _heart, int _power, String _name) { // 생성자 오버로딩
		heart = _heart;
		power = _power;
		name = _name;
	}
	
	void printAll() {
		System.out.printf("체력 : %d\n공격력 : %d\n이름 : %s\n", heart, power, name);
	}
	
	int attack() { // 공격력 반환 함수
		return power;
	}
	
	void damage(int attack) {
		this.heart -= attack;
		if (this.heart < 0) this.heart = 0;
	}
	
}
