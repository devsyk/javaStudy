package ch4;

public class Ex4_16 {
	public static void main(String[] args) {
		// Q. ���ڸ� 1���� ��� ���� ����� ���ϸ� ���� 100�� �Ѵ���
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100)
				break; //while�� ����
			++i;
			sum += i;
		}
		
		System.out.println("i = " + i);
		System.out.println("sum = " + sum);
	}
}
