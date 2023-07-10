package ex03;

import java.util.Scanner;

public class NumberBaseball {
	private static int[] answer = new int[3];
	private static int[] prediction = new int[3];
	
	NumberBaseball() {
		for (int i = 0; i < answer.length; i++) {
			answer[i] = ( (int)(Math.random() * 9) + 1);
			// 중복 허용 금지 
			for (int j = 0; j < i; j++) {
				if (answer[i] == answer[j]) {
					i--;
				}
			}
		}
	}
	
	static boolean check(int[] ans, int[] pred) {
		int strike = 0;
		int ball = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (ans[i] == pred[j]) { // 153 | 237
					if (i == j) {strike++;}
					else {ball++;}
				}
			}
		}
		if (strike == 3) {System.out.println("3스트라이크 입니다!"); return true;}
		else if (strike == 0 && ball == 0) {System.out.println("아웃입니다!");}
		else {
			System.out.println(strike + "스트라이크, " + ball + "볼입니다");
		}
		return false;
	}
	
	void play() {
		Scanner scan = new Scanner(System.in);
		boolean pass = false;
		while (pass == false) {
			pass = true;
			System.out.println("1 ~ 9 사이의 3자리수를 입력해주세요.");
			for (int i = 0; i < prediction.length; i++) {
				System.out.print( (i + 1) + "번째 숫자: ");
				prediction[i] = scan.nextInt();
				while (prediction[i] >= 10 || prediction[i] < 1) {
					System.out.println("범위를 초과하였습니다. 다시 입력해주세요.");
					System.out.print( (i + 1) + "번째 숫자: ");
					prediction[i] = scan.nextInt();
				}
			}
			if (prediction[0] == prediction[1] || prediction[0] == prediction[2] || prediction[1] == prediction[2]) {
				System.out.println("중복 입력하였습니다. 처음부터 다시 입력해주세요.\n");
				pass = false;
			}
		}
	}
	
	
	public static void main(String[] args) {
		int count = 1;
		boolean win = false;
		NumberBaseball game = new NumberBaseball();
		
		while (count <= 6 && win == false) {
			System.out.println("\n[" + count + "번째 시도입니다.]\n");
			game.play(); // 유저 입력
			System.out.printf("입력한 숫자는 %d, %d, %d 입니다\n", prediction[0], prediction[1], prediction[2]);
			win = check(answer, prediction);
			count += 1;
		}
		if (win == true) {
			System.out.println("이겼습니다 !");
		}
		else {
			System.out.println("졌습니다 ㅜㅜ");
		}
		
	}

}
