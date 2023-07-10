package ex01;
public class Date {
	
	private int day;
	private int month;
	private int year;
	
	// 배열 선언 = 자료형 + "[]" 
	int[] mon = {31, 28, 31, 30 ,31, 30, 31, 31, 30, 31, 30, 31};
	// mon[2] => 31
	// mon[0] => 31
	// mon[12] => out of memory
	
	Date(int _day, int _month, int _year) {
		this.day= _day;
		this.month = _month;
		this.year = _year;
	}
	
	public int getDay() {return day;}
	public int getMonth() {return month;}
	public int getYear() {return year;}
	
	public void setDay(int day) {
		// month - 1 == "특정 월"를 가리키는 값
		// mon[month -1] == "특정 월"의 최대 일수
		if (mon[month -1] < day || day < 1) {
			System.out.println("오류 : Day 범위가 적절하지 않습니다.");
		}
		else {
			this.day = day;
		}
	}
	
	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			System.out.println("오류 : Month 범위가 적절하지 않습니다.");
		}
		else {
			this.month = month;
		}
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public boolean isVaild() {
		if (month < 1 || month > 12) {
			System.out.println("오류 : Month 범위가 적절하지 않습니다.");
			return false;
		}
		
		if (mon[month -1] < day || day < 1) {
			System.out.println("오류 : Day 범위가 적절하지 않습니다.");
			return false;
		}

		System.out.println("유효한 날짜입니다.");
		return true;
	}
}
