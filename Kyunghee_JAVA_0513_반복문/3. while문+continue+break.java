package java0513;

public class EX3 {

	public static void main(String[] args) {
		// while문과 Continue, Break
		int i = 0;
		while (i < 10) {
			i++;
			if (i == 3) {
				System.out.println("3입니다. 컨틴뉴!");
				continue;
			}
			System.out.println("실행중"); // 얘가 실행이 안됨
		}
	}

}
