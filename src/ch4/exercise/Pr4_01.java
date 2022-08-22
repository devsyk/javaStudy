package ch4.exercise;

public class Pr4_01 {
	public static void main(String[] args) {
		//int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		int x = 0;
		if(x>10 && x<20) {
			System.out.println("true");
		}
		
		//char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
		char ch = ' ';
		if(ch!=' ' || ch!='\t') {
			System.out.println("true");
		}
		
		//char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
		ch = ' ';
		if(ch == 'x' || ch == 'X') {
			System.out.println("true");
		}
		
		//char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식
		ch = ' ';
		if(ch >= '0' && ch <= '9') {
			System.out.println("true");
		}
		
		//int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠 떨어지지 않을때 true이 조건식
		int year = 0;
		if((year%400 == 0 || year%4 == 0) && year%100 != 0) {
			System.out.println("true");
		}
		
		//boolean형 변수 powerOn이 false일 때 true인 조건식
		boolean powerOn = true;
		if(!powerOn) {
			System.out.println("true");
		}
		
		//문자열 참조변수 str이 "yes"일 때 true인 조건식
		String str = "";
		if(str.equals("yes")) {
			System.out.println("true");
		}
		
	}
}
