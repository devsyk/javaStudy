package ch4.exercise;

public class Pr4_04 {
	public static void main(String[] args) {
		//Q. 1+(-2)+3+(-4)+...�� ���� ������ ��� ���س��� ��, ����� ���ؾ� ������ 100 �̻� �Ǵ���
		int sum = 0;
		int n = 1;
		while(sum < 100) {
		    int a = 0;
		    if(n%2 == 0) { //¦���̸� ������ ����
		        a = n*(-1);		
		        sum += a;
		    } else {
		        sum += n;
		    }
		    //System.out.println("n = " + n + "    sum = " + sum);
		    n++;
		}
		System.out.println("������ 100�̻� �Ǵ� ��: " + (n-1)); //199
		
		
		//�ٸ� Ǯ�� *****
		//Q. 1+(-2)+3+(-4)+...�� ���� ������ ��� ���س��� ��, ����� ���ؾ� ������ 100 �̻� �Ǵ���
		// 1*(1) + 2*(-1) + 3*(1) + 4*(-1) + ...
		int num = 0; // 1 -2 3 -4 5 -6 ...
		int a = 1; // 1 -1 1 -1 1 -1 ...
		int sum1 = 0;

		for(int i = 1; sum1 < 100; i++, a=-a) {
			num = i * a; //��ȣ����
		    sum1 += num;
		    System.out.println("num = " + num + " / a = " + a + " / sum = " + sum1);
		}

		System.out.println("������ 100�̻� �Ǵ� ��: " + num); //199
		
		
		
	}
}
