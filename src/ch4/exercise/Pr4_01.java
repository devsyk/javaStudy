package ch4.exercise;

public class Pr4_01 {
	public static void main(String[] args) {
		//int�� ���� x�� 10���� ũ�� 20���� ���� �� true�� ���ǽ�
		int x = 0;
		if(x>10 && x<20) {
			System.out.println("true");
		}
		
		//char�� ���� ch�� �����̳� ���� �ƴ� �� true�� ���ǽ�
		char ch = ' ';
		if(ch!=' ' || ch!='\t') {
			System.out.println("true");
		}
		
		//char�� ���� ch�� 'x' �Ǵ� 'X'�� �� true�� ���ǽ�
		ch = ' ';
		if(ch == 'x' || ch == 'X') {
			System.out.println("true");
		}
		
		//char�� ���� ch�� ����('0'~'9')�� �� true�� ���ǽ�
		ch = ' ';
		if(ch >= '0' && ch <= '9') {
			System.out.println("true");
		}
		
		//int�� ���� year�� 400���� �����������ų� �Ǵ� 4�� ������������ 100���� ���� �������� ������ true�� ���ǽ�
		int year = 0;
		if((year%400 == 0 || year%4 == 0) && year%100 != 0) {
			System.out.println("true");
		}
		
		//boolean�� ���� powerOn�� false�� �� true�� ���ǽ�
		boolean powerOn = true;
		if(!powerOn) {
			System.out.println("true");
		}
		
		//���ڿ� �������� str�� "yes"�� �� true�� ���ǽ�
		String str = "";
		if(str.equals("yes")) {
			System.out.println("true");
		}
		
	}
}
