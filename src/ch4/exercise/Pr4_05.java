package ch4.exercise;

public class Pr4_05 {
	public static void main(String[] args) {
		//Q. ������ for���� while������ ����
		for(int i = 0; i <= 10; i++) {
		    for(int j = 0; j <= i; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}

		System.out.println("==================");

		// >> while��		
		int n = 0;
		int m = 0;
		while(n < 10) {	//10�� �ݺ�			
		    n++; //10��
		    while(m < n) {
		        m++; //* ����	
		        System.out.print("*");
		    }
		    m = 0; //* ���� �ʱ�ȭ
		    System.out.println();
		}
		
		
		//�ٸ� Ǯ�� 
		// >> while��		
		int i = 0;
		while(i <= 10) { //10�� �ݺ�			
		    int j = 0; //���ٿ� �ִ� *���� �ʱ�ȭ
		    while(j < i) {
		        System.out.print("*");
		        j++; //* ����	
		    }
		    i++; //10��
		    System.out.println();
		}
		
	}
}
