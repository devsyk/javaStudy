package ch4.exercise;

public class Pr4_02 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=20; i++) {
			if(!(i%2==0 || i%3==0)) {
				//System.out.println(i);
				sum =+ i;
			}
		}
		System.out.println("1���� 20������ ���� �� 2 �Ǵ� 3�� ����� �ƴ� ���� ����: " + sum);
	}
}
