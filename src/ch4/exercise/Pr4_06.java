package ch4.exercise;

public class Pr4_06 {
	public static void main(String[] args) {
		//Q. �ΰ��� �ֻ����� ������ ��, ���� ���� 6�� �Ǵ� ��� ����� �� ���		
		for(int i = 1; i <= 6; i++) {
		    for(int j = 1; j <= 6; j++) {
		        if(i + j == 6) {
		            System.out.println("(" + i + ", " + j + ")");
		        }
		    }
		}
		
	}
}
