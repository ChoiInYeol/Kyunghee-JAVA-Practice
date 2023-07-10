package ex01;
public class Date {
	
	private int day;
	private int month;
	private int year;
	
	// �迭 ���� = �ڷ��� + "[]" 
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
		// month - 1 == "Ư�� ��"�� ����Ű�� ��
		// mon[month -1] == "Ư�� ��"�� �ִ� �ϼ�
		if (mon[month -1] < day || day < 1) {
			System.out.println("���� : Day ������ �������� �ʽ��ϴ�.");
		}
		else {
			this.day = day;
		}
	}
	
	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			System.out.println("���� : Month ������ �������� �ʽ��ϴ�.");
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
			System.out.println("���� : Month ������ �������� �ʽ��ϴ�.");
			return false;
		}
		
		if (mon[month -1] < day || day < 1) {
			System.out.println("���� : Day ������ �������� �ʽ��ϴ�.");
			return false;
		}

		System.out.println("��ȿ�� ��¥�Դϴ�.");
		return true;
	}
}
