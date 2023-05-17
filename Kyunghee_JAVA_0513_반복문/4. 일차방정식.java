package java0513;

public class EX4 {

	public static void main(String[] args) {
		// 4x + 5y = 60
		for (int x = 1; x < 11; x++) {
			for (int y = 1; y < 11; y++) {
				if (4 * x + 5 * y == 60) { // 식 세우기
					System.out.printf("(%d, %d)\n", x, y); // (x , y)의 출력 형식
				}
			}
		}
	}

}
