package ch4;

public class Ex4_11 {
	public static void main(String[] args) {
		// ���簢�������(5�� 10��)
		for(int i = 1; i <= 5; i++) { //5�� �ⷰ
			for(int j = 1; j <= 10; j++) { 
				System.out.print("*"); //���ٿ� * 10�� ���
			}
			System.out.println(); //�ٹٲ�
		}
		System.out.println();	
		
		// �ﰢ�� �����
		for(int i = 1; i <= 5; i++) { //5�� ���
			for(int j = 1; j <= i; j++) {
				System.out.print("*"); //1 ~ 5�� ���
			}
			System.out.println(); //�ٹٲ�
		}
		System.out.println();	
		for(int i = 5; i >= 1; i--) { //5�� ���
			for(int j = i; j >= 1; j--) {
				System.out.print("*"); //5 ~ 1�� ���
			}
			System.out.println(); //�ٹٲ�
		}
	}
}
