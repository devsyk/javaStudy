package ch3.book.Exercise;

public class Pr3_5 {
	public static void main(String[] args) {
		// Q. 변수 num에 따라 '양수','음수','0' 출력하는 코드
		int num = 10;
		System.out.println(num == 0 ? 0 : (num > 0 ? "양수" : "음수"));
	}
}
