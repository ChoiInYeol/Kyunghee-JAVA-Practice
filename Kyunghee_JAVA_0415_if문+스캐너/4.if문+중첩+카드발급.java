package ex04;
import java.util.Scanner;
public class EX04 {
	public static void main(String[] args) {
		// 발급조건1 (둘중하나 만족) 연소득 5,000만 원 이상 또는 신용등급 B 이상
		// 발급조건2 기존 고객
		Scanner scan = new Scanner(System.in);
		int income, oc;
		String trust;
		System.out.println("안녕하세요? 00카드입니다.");
		System.out.print("연소득이 어떻게 되시나요? : ");
		income = scan.nextInt();
		
		System.out.print("신용등급은 어떻게 되시나요? : ");
		trust = scan.next();
		
		System.out.print("기존 고객이시면 1, 아니면 2를 입력해주세요. :");
		oc = scan.nextInt();
		
		if ( income > 5000 || trust.equals("B") || trust.equals("A") ) {
			// 연봉이 5천 이상 or 신용등급 B or 신용등급 A인 경우
			// 조건문의 중첩
			if (oc == 1) {
				System.out.println("카드를 발급해드리겠습니다.");
			}
			else {
				System.out.println("기존 고객이 아니셔서 발급이 불가능합니다.");
			}
		}
		else {System.out.println("연봉 5천 미만 혹은 신용등급 C는 불가합니다.");}
	}

}
