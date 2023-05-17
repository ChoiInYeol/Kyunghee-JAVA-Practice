package ex03;
import java.util.Scanner;
public class EX03 {
	public static void main(String[] args) {
		// 변수 및 스캐너 객체 선언
		int amount = 10000;
		int cost;
		Scanner scan = new Scanner(System.in);
		
		// 사용자로부터 요금을 입력받음
		System.out.print("요금을 입력하세요. : ");
		cost = scan.nextInt();
		
		if (amount - cost < 0) { // 만약 음수라면
			System.out.println("잔액이 부족합니다.");
		}
		else { // 아니면
			System.out.printf("잔액은 %d원입니다", amount - cost);
		}
	}
}
