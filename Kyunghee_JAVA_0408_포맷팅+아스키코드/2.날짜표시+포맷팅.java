package ex02;

public class Ex02 {

	public static void main(String[] args) {
		//year, month, day라는 변수를 만들어 오늘의 년도, 월, 일을 할당하세요.
		// ＂YYYY-MM-DD＂ 형식으로 출력하세요.
		// %d랑 printf를 이용하세요
		int year = 2023;
		int month = 4;
		int day = 8;
		System.out.printf("%d-0%d-0%d \n", year, month, day);
		System.out.println(year + "-0" + month + "-0" + day);
		

	}

}
