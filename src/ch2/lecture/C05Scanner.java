package ch2.lecture;

import java.util.Scanner; // 1. import�� �߰�

public class C05Scanner {
	public static void main(String[] args) {
		// ȭ�鿡�� �Է¹��� 
		
		// 2. ScannerŬ������ ��ü ����
		Scanner scanner = new Scanner(System.in);
		
//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num);
//		System.out.println(num2);
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println(num);
	}
}
