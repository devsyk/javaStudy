package ch3.book.Exercise;

public class Pr3_6 {
	public static void main(String[] args) {
		// Q. ȭ���� ������ ��ȯ (����: C = 5/9 * (F - 32))
		// - �Ҽ��� ��°�ڸ����� �ݿø�(Math.round()���X)
		int fahrenheit = 100;	
		// A.
		float celcius = (int)((5/9f * (fahrenheit-32))*100 + 0.5) / 100f;
		
		System.out.println("Fahrenheit: " + fahrenheit);
		System.out.println("Celcius: " + celcius);
	}
}
