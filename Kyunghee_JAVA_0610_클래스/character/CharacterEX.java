package character;
public class CharacterEX {
	public static void main(String[] args) {
		Character 가렌 = new Character(500, 20);
		Character 베인 = new Character();
		베인.printHeart();
		베인.setHeart(200);
		베인.setPower(60);
		베인.printHeart();
		베인.damage(가렌.getPower());
		베인.printHeart();
		
		int time = 0;
		while (베인.getHeart() > 0) { // 몇 번 때려야 죽는지 계산
			베인.damage(가렌.getPower());
			time++;
		}
		System.out.println(time + "번 만에 베인이 죽었습니다.");
	}
}