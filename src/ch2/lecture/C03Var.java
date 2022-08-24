package ch2.lecture;

public class C03Var {
	public static void main(String[] args) {
		int score = 100;
		score = 200;

		// 상수 : 변수 타입 앞에 final 추가
		// 재선언 불가
		final int score2 = 100;
//		score2 = 200;

		boolean power = false;

		byte b = 127;	// -128 ~ 127

		int oct = 010; 	// 8진수, 10진수로 8
		int hex = 0x10;	// 16진수, 10진수로 16

		long l = 10_000_000_000L; // L추가

		float f = 3.14f;	// F추가
		double d = 3.14f;

		char ch = 'A';
		int i = 'A';

		String str = ""; // 빈문자열
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;

		System.out.println(10.); //10.0
		System.out.println(.10); //0.1
		System.out.println(10f); //10.0
		System.out.println(1e3); //1000.0
	}
}
  