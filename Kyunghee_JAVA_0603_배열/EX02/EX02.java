package EX02;
import java.util.Scanner;
public class EX02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		for (int i = 1; i < input; i++) {
			System.out.print(fibo(i) + " ");
		}
	}
	
	public static int fibo(int n) {
		if (n <= 1) {
			return n;
		}
		else {
			return fibo(n -2) + fibo(n - 1);
		}
	}
}
