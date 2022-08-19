package ch3.book.Exercise;

public class Pr3_3 {
	public static void main(String[] args) {
		// Q. 백의 자리를 버리는 코드
		int num = 456;
		System.out.println(num-(num%100)); //400
		System.out.println(num/100*100);
	}
}
