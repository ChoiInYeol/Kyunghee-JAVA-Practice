package java0513;
import java.util.Scanner;
public class EX5 {

	public static void main(String[] args) {
//		아래의 방식으로 사칙연산 계산기 프로그램을 작성하세요
//		1. String 변수를 입력 받고 입력 값에 따라 다음을 수행하세요.
//		“+”: 두 실수를 입력 받아 더한 값을 출력하세요.
//		“-”: 두 실수를 입력 받아 뺀 값을 출력하세요.
//		“*”: 두 실수를 입력 받아 곱한 값을 출력하세요.
//		“/”: 두 실수를 입력 받아 나눈 값을 출력하세요.
//		“q”: 프로그램 종료
//		이외의 다른 값: “다시 입력하세요”를 출력
//		2. “q”를 입력 받을 때 까지 1을 반복하세요.
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("연산자를 입력하세요 : ");
			String input = scan.next(); // 입력 값을 input 변수에 넣음
			if (input.equals("q")) break;
			
			System.out.print("두 실수를 입력하세요 : ");
			double x1 = scan.nextDouble();
			double x2 = scan.nextDouble();
	
			switch (input) {
			case "+": System.out.printf("%.2f + %.2f = %.2f\n", x1, x2, x1+x2); continue;
			case "-": System.out.printf("%.2f - %.2f = %.2f\n", x1, x2, x1-x2); continue;
			case "*": System.out.printf("%.2f * %.2f = %.2f\n", x1, x2, x1*x2); continue;
			case "/": System.out.printf("%.2f / %.2f = %.2f\n", x1, x2, x1/x2); continue;
			default : System.out.println("다시 연산자를 입력하세요.");
			}
		}
	}

}
