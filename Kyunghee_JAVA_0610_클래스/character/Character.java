package character;
//Character 클래스는 int 타입의 체력(heart), 공격력(power)를 멤버변수로 갖습니다.
// 각 멤버변수의 초기값은 100, 100입니다.
//Character 클래스는 체력과 공격력을 입력으로 받아 지정하는 set 함수를 갖습니다.
//Character 클래스는 체력을 출력하는 print 함수를 갖습니다.
//Character 클래스는 공격을 입력으로 받아 체력을 업데이트하는 damage 함수를 갖습니다.
public class Character {
	int heart; // 멤버 변수 : 체력
	int power; // 멤버 변수 : 공격력
	Character() { // 디폴트 생성자
		heart = 100; 
		power = 100;
	}
	Character(int _heart, int _power) {  // 직접 인수를 입력했을 때
		heart = _heart;
		power = _power;
	}
	
	int getHeart() {return this.heart;} // 현재 내 체력을 정수로 반환
	int getPower() {return this.power;} // 현재 내 공격력을 정수로 반환
	void setHeart(int _heart) {this.heart = _heart;} // 내 체력을 수정하는 함수
	void setPower(int _power) {this.power = _power;} // 내 공격력을 수정하는 함수
	void printHeart() { // 현재 체력을 출력하는 함수
		System.out.println("현재 체력 : " + heart);
	}
	void damage(int _power) { // 현재 체력을 업데이트하는 함수
		heart -= _power; // 상대방의 공격력만큼 내 체력을 차감하는 함수
	}
}