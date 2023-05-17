package java0513;
public class EX {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) { // i는 1로 초기화, 10까지 증가함
			System.out.printf("i : %d, \t sum : %d \n", i, sum);
			sum += i;
		}
		System.out.printf("10까지의 합은 %d입니다.", sum);
	}
}