package ex05;
public class Ex05 {
	public static void main(String[] args) {
		int Result1 = ('6' - '1');
		int Result2 = 6-1;
		int Result3 = ('6'- '1') * ('5'+ '2');
		int Result4 = (6-1) * (5+2);
		System.out.println(Result1); // 아스키코드 상 5칸 차이가 나니깐...
		System.out.println(Result2); // 당연히 5
		System.out.println(Result3); // '5'와 '2'의 곱은 103이구나... char끼리 더했구나
		System.out.println(Result4); // 당연히 35
	}
}
