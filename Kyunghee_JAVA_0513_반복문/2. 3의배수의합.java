package java0513;

public class EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0) sum += i; // 3의 배수만 합
		}
		System.out.println(sum);
	}

}
