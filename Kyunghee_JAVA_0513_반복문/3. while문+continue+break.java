package java0513;

public class EX3 {

	public static void main(String[] args) {
		// while���� Continue, Break
		int i = 0;
		while (i < 10) {
			i++;
			if (i == 3) {
				System.out.println("3�Դϴ�. ��ƾ��!");
				continue;
			}
			System.out.println("������"); // �갡 ������ �ȵ�
		}
	}

}
