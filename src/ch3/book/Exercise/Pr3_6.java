package ch3.book.Exercise;

public class Pr3_6 {
	public static void main(String[] args) {
		// Q. 화씨를 섭씨로 변환 (공식: C = 5/9 * (F - 32))
		// - 소수점 셋째자리에서 반올림(Math.round()사용X)
		int fahrenheit = 100;	
		// A.
		float celcius = (int)((5/9f * (fahrenheit-32))*100 + 0.5) / 100f;
		
		System.out.println("Fahrenheit: " + fahrenheit);
		System.out.println("Celcius: " + celcius);
	}
}
