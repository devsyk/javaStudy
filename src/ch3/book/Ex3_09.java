package ch3.book;

public class Ex3_09 {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b;
		System.out.println(c);
		
		long d = (long)a * b;
		System.out.println(d);
	}
}
