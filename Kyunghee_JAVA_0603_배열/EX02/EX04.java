package EX02;

public class EX04 {

	public static void main(String[] args) {
		System.out.println(myMethod(150));
		int temp = myMethod(50) * 100; // method를 연산할 수 있냐?
		// 반환값이 int이기 때문에 int 자료형과 동일한 역할을 함 
		System.out.println(temp);
	}
	
	public static int myMethod(int num) {
		int num2 = 3;
		int sum = num + num2;
		// ㅁㄴㅇ랜모잳ㄹㄴㄻ나ㅔㄹ멜ㅇ
		return 30; // 그냥 얘임
	}

}
