package ch4;

import java.util.Scanner;

public class Ex4_18 {
	public static void main(String[] args) {
		// Q. �޴� ����
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("���ϴ� �޴�(1~3)�� �����ϼ���.(����: 0) > ");
			
			String tmp = scanner.nextLine(); //�Է¹��� �� tmp�� ����
			menu = Integer.parseInt(tmp); //���ڷ� ��ȯ
			
			if(menu == 0) {
				System.out.println("���α׷��� �����մϴ�");
				break; //�ݺ��� ����
			} else if(!(1 <= menu && menu <=3)) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(����� 0)");
				continue; //�ݺ��� ó������
			}
			
			System.out.println("�����Ͻ� �޴��� " + menu + "���Դϴ�.");
			
		}

	}
}
