package ch3.book;

public class Ex3_11 {
	public static void main(String[] args) {
		// Math.round() : �ݿø�
		double pi = 3.141592;
		
		System.out.println(pi);
		System.out.println(pi*1000);
		System.out.println(Math.round(pi*1000));
		System.out.println(Math.round(pi*1000)/1000);
		System.out.println((double)Math.round(pi*1000)/1000);
		System.out.println("=============");
		
		double shortPi = Math.round(pi * 1000)/1000.0;
		//Math.round(3141.592)/1000.0 = 3142/1000.0 = 3.142
		System.out.println(shortPi);
		System.out.println("=============");
		
		// 3.141을 얻으려면?
		System.out.println((int)(pi*1000)/1000);
		System.out.println((int)(pi*1000)/1000.0); //실수로 나눠야 소수점까지 나옴
	}
}
