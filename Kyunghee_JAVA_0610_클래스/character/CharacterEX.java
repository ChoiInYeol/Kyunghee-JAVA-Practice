package character;
public class CharacterEX {
	public static void main(String[] args) {
		Character ���� = new Character(500, 20);
		Character ���� = new Character();
		����.printHeart();
		����.setHeart(200);
		����.setPower(60);
		����.printHeart();
		����.damage(����.getPower());
		����.printHeart();
		
		int time = 0;
		while (����.getHeart() > 0) { // �� �� ������ �״��� ���
			����.damage(����.getPower());
			time++;
		}
		System.out.println(time + "�� ���� ������ �׾����ϴ�.");
	}
}