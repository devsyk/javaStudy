package ch4;

public class Ex4_13 {
	public static void main(String[] args) {
		// 1���� ����� ���ؾ� 100�� ���� �ʴ���
		int sum = 0;
		int i = 0;
		
		while(sum <= 100) {
			System.out.printf("%d - %d%n", i, sum);
			sum += ++i; //i�� ��� 1�� ������Ű�鼭 sum�� �߰�
		}
	}
}
