package ch4.exercise;

public class Pr4_09 {
	public static void main(String[] args) {
		//Q. int�� ���� num�� �� �ڸ� ���� ���� ��� ���
		int num = 12345;
		int sum = 0;		
		while(num != 0) {
		    sum += num%10;
		    num /= 10;					
		}
		System.out.println("sum = " + sum); //15
	}
}
