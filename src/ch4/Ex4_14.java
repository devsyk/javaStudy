package ch4;

import java.util.Scanner;

public class Ex4_14 {
	public static void main(String[] args) {
		// Q. ���ڸ� �Է¹޾Ƽ� �� �ڸ��� ������ �� ���ϱ�
		int num = 0, sum = 0;
		System.out.print("���ڸ� �Է��ϼ���.(��:12345) > ");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); //ȭ���� ���� �Է¹��� ������ tmp�� ����
		num = Integer.parseInt(tmp); //�Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
			
		//10���� ������ ������ �ϸ� ������ �ڸ��� ��´�.
//		System.out.println(12345%10);
		
//		for(num = 12345; num > 0; num = num / 10) {
//			System.out.println(num + " > " + num%10);
//			sum += num%10;
//		}
		
		while(num!=0) {
			sum += num%10; //10���� ���� �������� sum�� ����
			//System.out.println("sum = " + sum + " / num = " + num);
			num /= 10; //10���� ���� ���� �ٽ� num�� ���� - �� �ڸ��� Ȯ������
		}
		
		System.out.println("�� �ڸ����� �� : " + sum);
	}
}
