package java0513;
import java.util.Scanner;
public class EX5 {

	public static void main(String[] args) {
//		�Ʒ��� ������� ��Ģ���� ���� ���α׷��� �ۼ��ϼ���
//		1. String ������ �Է� �ް� �Է� ���� ���� ������ �����ϼ���.
//		��+��: �� �Ǽ��� �Է� �޾� ���� ���� ����ϼ���.
//		��-��: �� �Ǽ��� �Է� �޾� �� ���� ����ϼ���.
//		��*��: �� �Ǽ��� �Է� �޾� ���� ���� ����ϼ���.
//		��/��: �� �Ǽ��� �Է� �޾� ���� ���� ����ϼ���.
//		��q��: ���α׷� ����
//		�̿��� �ٸ� ��: ���ٽ� �Է��ϼ��䡱�� ���
//		2. ��q���� �Է� ���� �� ���� 1�� �ݺ��ϼ���.
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("�����ڸ� �Է��ϼ��� : ");
			String input = scan.next(); // �Է� ���� input ������ ����
			if (input.equals("q")) break;
			
			System.out.print("�� �Ǽ��� �Է��ϼ��� : ");
			double x1 = scan.nextDouble();
			double x2 = scan.nextDouble();
	
			switch (input) {
			case "+": System.out.printf("%.2f + %.2f = %.2f\n", x1, x2, x1+x2); continue;
			case "-": System.out.printf("%.2f - %.2f = %.2f\n", x1, x2, x1-x2); continue;
			case "*": System.out.printf("%.2f * %.2f = %.2f\n", x1, x2, x1*x2); continue;
			case "/": System.out.printf("%.2f / %.2f = %.2f\n", x1, x2, x1/x2); continue;
			default : System.out.println("�ٽ� �����ڸ� �Է��ϼ���.");
			}
		}
	}

}
