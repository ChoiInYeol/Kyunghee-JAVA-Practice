package character2;
public class CharacterEX {
	public static void main(String[] args) {
		Tanker 오른 = new Tanker(500, 20, "오른");
		Character 베인 = new Character(200, 60, "베인");
		Monster 바론 = new Monster(10000, 100, "바론");
		
		오른.fight(베인);
		베인.fight(바론);
	}
}