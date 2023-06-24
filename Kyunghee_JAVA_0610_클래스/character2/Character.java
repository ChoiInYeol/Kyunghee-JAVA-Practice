package character2;
public class Character {
	int heart; // 멤버 변수 : 체력
	int power; // 멤버 변수 : 공격력
	String name;
	Character() { // 디폴트 생성자
		heart = 100; 
		power = 100;
		name = "";
	}
	Character(int _heart, int _power, String _name) {  // 직접 인수를 입력했을 때
		heart = _heart;
		power = _power;
		name = _name;
	}
	
	int getHeart() {return this.heart;} // 현재 내 체력을 정수로 반환
	int getPower() {return this.power;} // 현재 내 공격력을 정수로 반환
	String getName() {return this.name;} // 내 이름 반환
	void setHeart(int _heart) {this.heart = _heart;} // 내 체력을 수정하는 함수
	void setPower(int _power) {this.power = _power;} // 내 공격력을 수정하는 함수
	void setName(String _name) {this.name = _name;} // 내 이름 수정
	void printHeart() { // 현재 체력을 출력하는 함수
		System.out.println(name + "의 현재 체력 : " + heart);
	}
	void damage(int _power) { // 현재 체력을 업데이트하는 함수
		heart -= _power; // 상대방의 공격력만큼 내 체력을 차감하는 함수
	}
	
	void fight(Character A) {
		this.heart -= A.power; // 나 A한테 맞았다
		A.setHeart(A.heart - this.power); // 나 A 때렸다
		System.out.printf("%s가 %s에게 %d만큼 피해를 입었습니다. | %s의 남은 체력 : %d\n"
				, this.name, A.name, A.power, this.name, this.heart);
		System.out.printf("%s가 %s에게 %d만큼 피해를 입었습니다. | %s의 남은 체력 : %d\n"
				, A.name , this.name, this.power, A.name, A.heart);
	}
}