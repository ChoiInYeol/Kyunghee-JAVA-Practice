package ex02;
public class EX02 {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 200;
		int bigger = 0; // 초기화
		// 처음 가정이 맞았으면 "뭐야 처음이 맞았잖아."를 출력
		
		// 가정 : num1이 num2보다 클 것이다.
		bigger = num1;
		
		// 판별 : num1 < num2
		if (num1 < num2) { // 처음 가정이 틀린 상황
			bigger = num2;
			System.out.println("num2가 더 크구나");
		}
		else { // 처음 가정이 맞은 상황
			System.out.println("num1이 더 크구나");
			// Run - Run configuration - common - windows-x-cp949
		}
		
	}
}
