package ch4;

public class Ex4_17 {
	public static void main(String[] args) {
		// Q. 3�� ����� �ƴ� 1~10���� ���� ��
		for(int i = 0; i <= 10; i++) {
			if(i%3==0) 
				continue; //���ǽ��� ���� �Ǿ� continue���� ����Ǹ� ���� ������ �̵� �� �ݺ�(�ݺ��� ����X)
			System.out.println(i);
		}		
	}
}
