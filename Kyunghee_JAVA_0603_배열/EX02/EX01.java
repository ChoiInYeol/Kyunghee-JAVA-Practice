package EX02;
import java.util.Scanner;
public class EX01 {
	public static void main(String[] args) {
//		n���� ��Ҹ� ���� ���� �迭�� �����ϼ���.
//		n�� �迭�� ��ҵ��� �Է����� �޽��ϴ�.
//		n:7, ���: { 10, 20, 30, 50, 3, 60, -3 };
//
//		�迭�� ���հ� ����� ����ϼ���.
//		�迭���� ���� ū ��ҿ� ���� ���� ��Ҹ� ����ϼ���.
//		�ε��� ��ȣ �� ���� �Է� �޾�, �迭���� �ش�Ǵ� �ε����� �� ���� �ٲٰ�, �迭�� ����ϼ���.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int N = scan.nextInt();
		int[] num = new int[N]; // num�� �迭
		
		System.out.println(N + "���� �迭 ��Ҹ� �Է��ϼ���.");
		for (int i = 0; i < N; i++) {
			num[i] = scan.nextInt(); // �迭�� i��° ���� ������� �־��ش�
		}
		
		// ��հ� ����
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += num[i]; // sum�� �迭 ��Ҹ� ���� ���ϱ�
		}
		double avg = (sum / N);
		System.out.printf("���� : %d | ��� : %.2f \n", sum, avg); // \n�� �ٹٲ�
		
		// ���� ū �Ͱ� ���� ���� ���
		int big = num[0];
		int small = num[0];
		
		for (int i = 1; i < N; i++) {
			if (big < num[i]) { // ���� big���� num[i]���� ���� ��� -> �� ū ���� �߰ߵ� ���
				big = num[i];
			}
			if (small > num[i]) {  // ���� small���� num[i]���� ū ��� -> �� ���� ���� �߰ߵ� ���
				small = num[i];
			}
		}
		System.out.printf("�ִ� : %d | �ּ� : %d \n", big, small);
		
		// �迭�� ����ϱ�
		for (int i = 0; i < N; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		// �迭 ����� ��ġ �ٲٱ�
		System.out.println("�ٲٰ� ���� �迭�� �ε����� ���� �Է��ϼ��� : ");
		int first = scan.nextInt();
		int second = scan.nextInt();
		
		int temp = num[first]; // �ӽ� ������ num[first] ����
		num[first] = num[second];
		num[second] = temp;
		
		// �迭�� ����ϱ�
		for (int i = 0; i < N; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
