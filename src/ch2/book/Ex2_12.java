package ch2.book;

public class Ex2_12 {
	public static void main(String[] args) {
		String str = "3";
		
		//문자열 > 문자 > 숫자
		System.out.println(str.charAt(0) - '0'); // 3
		//문자 > 숫자
		System.out.println('3' - '0' + 1); // 4
		//문자열 > 숫자
		System.out.println(Integer.parseInt("3") + 1); //4
		//문자열
		System.out.println("3" + 1); // 31
		//숫자 > 문자
		System.out.println((char)(3 + '0')); //'3'
		
		
		
	}
}
