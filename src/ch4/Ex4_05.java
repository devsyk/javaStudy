package ch4;

import java.util.Scanner;

public class Ex4_05 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = 0;
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); //ȭ���� ���� �Է¹��� ������ score�� ����
		
		System.out.println("����� ������ %�Դϴ�.%n" + score);
		
		if(score>=90) {
			grade = 'A';
			if(score>=98) {
				opt = '+';
			}
		}
	}
}
