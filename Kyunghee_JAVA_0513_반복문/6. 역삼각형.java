package java0513;
import java.util.Scanner;
public class EX6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("N을 입력하세요 : ");
		int N = scan.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = N-i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
