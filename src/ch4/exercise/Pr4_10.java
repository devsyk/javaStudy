package ch4.exercise;

import java.util.Scanner;

public class Pr4_10 {
	public static void main(String[] args) {
		//Q. 1~100������ �� ���߱� - ������� ���ڸ� ������� 
		Scanner scanner = new Scanner(System.in);
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;

		while(true) {
		    count++;
		    System.out.print("1�� 100������ ���� �Է��ϼ��� : ");			
		    input = scanner.nextInt();

		    if(answer > input) {
		        System.out.println("�� ū ���� �Է��ϼ���.");
		    } else if(answer < input) {
		        System.out.println("�� ���� ���� �Է��ϼ���.");
		    } else {
		        System.out.println("������ϴ�.");
		        break;
		    }
		}
		System.out.println("�õ�Ƚ���� " + count + "���Դϴ�.");
		
	}
}
