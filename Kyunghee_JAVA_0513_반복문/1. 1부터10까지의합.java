package java0513;
public class EX {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) { // i�� 1�� �ʱ�ȭ, 10���� ������
			System.out.printf("i : %d, \t sum : %d \n", i, sum);
			sum += i;
		}
		System.out.printf("10������ ���� %d�Դϴ�.", sum);
	}
}