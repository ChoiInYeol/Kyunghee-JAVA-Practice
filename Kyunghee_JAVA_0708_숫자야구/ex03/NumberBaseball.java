package ex03;

import java.util.Scanner;

public class NumberBaseball {
	private static int[] answer = new int[3];
	private static int[] prediction = new int[3];
	
	NumberBaseball() {
		for (int i = 0; i < answer.length; i++) {
			answer[i] = ( (int)(Math.random() * 9) + 1);
			// �ߺ� ��� ���� 
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
		if (strike == 3) {System.out.println("3��Ʈ����ũ �Դϴ�!"); return true;}
		else if (strike == 0 && ball == 0) {System.out.println("�ƿ��Դϴ�!");}
		else {
			System.out.println(strike + "��Ʈ����ũ, " + ball + "���Դϴ�");
		}
		return false;
	}
	
	void play() {
		Scanner scan = new Scanner(System.in);
		boolean pass = false;
		while (pass == false) {
			pass = true;
			System.out.println("1 ~ 9 ������ 3�ڸ����� �Է����ּ���.");
			for (int i = 0; i < prediction.length; i++) {
				System.out.print( (i + 1) + "��° ����: ");
				prediction[i] = scan.nextInt();
				while (prediction[i] >= 10 || prediction[i] < 1) {
					System.out.println("������ �ʰ��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
					System.out.print( (i + 1) + "��° ����: ");
					prediction[i] = scan.nextInt();
				}
			}
			if (prediction[0] == prediction[1] || prediction[0] == prediction[2] || prediction[1] == prediction[2]) {
				System.out.println("�ߺ� �Է��Ͽ����ϴ�. ó������ �ٽ� �Է����ּ���.\n");
				pass = false;
			}
		}
	}
	
	
	public static void main(String[] args) {
		int count = 1;
		boolean win = false;
		NumberBaseball game = new NumberBaseball();
		
		while (count <= 6 && win == false) {
			System.out.println("\n[" + count + "��° �õ��Դϴ�.]\n");
			game.play(); // ���� �Է�
			System.out.printf("�Է��� ���ڴ� %d, %d, %d �Դϴ�\n", prediction[0], prediction[1], prediction[2]);
			win = check(answer, prediction);
			count += 1;
		}
		if (win == true) {
			System.out.println("�̰���ϴ� !");
		}
		else {
			System.out.println("�����ϴ� �̤�");
		}
		
	}

}
