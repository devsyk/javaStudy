package ch4.exercise;

public class Pr4_07 {
	public static void main(String[] args) {
		//Q. ���ڷ� �̷���� ���ڿ� str�� ���ڸ� ���� ���� ��� ���
		String str = "12345";
		int sum = 0;
		int num = Integer.parseInt(str); //������ ��ȯ
		while(num != 0) {
		    sum += num%10; //�ش��ڸ����� �� ����
		    num /= 10;	//���� �ڸ��� Ȯ��		
		}
		System.out.println("�� �ڸ��� ���� = " + sum); //15
		
		
		//�ٸ� Ǯ�� - ���ڿ� �״�� ���
		//Q. ���ڷ� �̷���� ���ڿ� str�� ���ڸ� ���� ���� ��� ���
		String str1 = "12345";
		int sum1 = 0;
		for(int i = 0; i < str1.length(); i++) {
		    //System.out.println(str1.charAt(i)); //�� ���� ���		
		    //System.out.println(str1.charAt(i)-'0'); // -'0' : ���ڷ� ��ȯ
		    sum1 += str1.charAt(i)-'0';
		}
		System.out.println("�� �ڸ��� ���� = " + sum1); //15
		
	}
}
