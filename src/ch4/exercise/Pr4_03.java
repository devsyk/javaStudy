package ch4.exercise;

public class Pr4_03 {
	public static void main(String[] args) {
		//Q. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)�� ��� ���
		for(int i=0; i<10; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(j+1);
			}
			System.out.print("+");
		}
		
		
		//�ش� �� �״�� ����غ���!
		
	}
}
