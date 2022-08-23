package ch4.exercise;

public class Pr4_09 {
	public static void main(String[] args) {
		//Q. int형 변수 num의 각 자리 합을 더한 결과 출력
		int num = 12345;
		int sum = 0;		
		while(num != 0) {
		    sum += num%10;
		    num /= 10;					
		}
		System.out.println("sum = " + sum); //15
	}
}
