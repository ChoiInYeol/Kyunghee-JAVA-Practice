package ex01;
import java.util.Scanner;
public class EX01 {
	public static void main(String[] args) {
//		n개의 요소를 가진 정수 배열을 생성하세요.
//		n과 배열의 요소들은 입력으로 받습니다.
//		n:7, 요소: { 10, 20, 30, 50, 3, 60, -3 };
//
//		배열의 총합과 평균을 출력하세요.
//		배열에서 가장 큰 요소와 가장 작은 요소를 출력하세요.
//		인덱스 번호 두 개를 입력 받아, 배열에서 해당되는 인덱스의 두 값을 바꾸고, 배열을 출력하세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하세요 : ");
		int N = scan.nextInt();
		int[] num = new int[N]; // num은 배열
		
		System.out.println(N + "개의 배열 요소를 입력하세요.");
		for (int i = 0; i < N; i++) {
			num[i] = scan.nextInt(); // 배열의 i번째 값을 순서대로 넣어준다
		}
		
		// 평균과 총합
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum += num[i]; // sum에 배열 요소를 전부 더하기
		}
		double avg = (sum / N);
		System.out.printf("총합 : %d | 평균 : %.2f \n", sum, avg); // \n은 줄바꿈
		
		// 가장 큰 것과 작은 것을 출력
		int big = num[0];
		int small = num[0];
		
		for (int i = 1; i < N; i++) {
			if (big < num[i]) { // 현재 big값이 num[i]보다 작은 경우 -> 더 큰 것이 발견된 경우
				big = num[i];
			}
			if (small > num[i]) {  // 현재 small값이 num[i]보다 큰 경우 -> 더 작은 것이 발견된 경우
				small = num[i];
			}
		}
		System.out.printf("최대 : %d | 최소 : %d \n", big, small);
		
		// 배열을 출력하기
		for (int i = 0; i < N; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		// 배열 요소의 위치 바꾸기
		System.out.println("바꾸고 싶은 배열의 인덱스의 쌍을 입력하세요 : ");
		int first = scan.nextInt();
		int second = scan.nextInt();
		
		int temp = num[first]; // 임시 변수에 num[first] 저장
		num[first] = num[second];
		num[second] = temp;
		
		// 배열을 출력하기
		for (int i = 0; i < N; i++) {
			System.out.print(num[i] + " ");
		}
	}
}
