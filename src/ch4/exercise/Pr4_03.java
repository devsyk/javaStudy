package ch4.exercise;

public class Pr4_03 {
	public static void main(String[] args) {
		//Q. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과 계산
		int sum = 0;
		for(int i=0; i<10; i++) {
		    for(int j=0; j<=i; j++) {
		        sum += (j+1);				
		    }
		}
		System.out.println("계산결과 : " + sum);
		
		
		//다른 풀이
		//Q. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과 계산
		int sum1 = 0;
		int totalSum = 0;

		for(int i=1; i<=10; i++) {
		    sum1 += i;
		    totalSum += sum1;
		}
		System.out.println("계산결과 : " + totalSum);
		
		


		//해당 식 그대로 출력해보기		
		for(int i=0; i<10; i++) {
		    System.out.print("(");
		    for(int j=0; j<=i; j++) {
		        System.out.print(j+1);
		        if(j<i) {
		            System.out.print("+");
		        }
		    }
		    System.out.print(")");
		    if(i<9) {
		        System.out.print("+");
		    }
		}
		
	}
}
