package java0610;
public class Calc {
	public static int add(int num1, int num2) {return num1 + num2;}
	public static int sub(int num1, int num2) {return num1 - num2;} // ÁÖÀÇ
	public static int mult(int num1, int num2) {return num1 * num2;}
	public static int div(int num1, int num2) {return num1 / num2;} // ÁÖÀÇ

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 8;
		System.out.println( add(num1, num2) );
		System.out.println( mult(num1, num2) );
		
		int add3 = add(add(num1, num2), num2); // ¼¼ ¼öÀÇ µ¡¼À
		System.out.println(add3);
	}
}
