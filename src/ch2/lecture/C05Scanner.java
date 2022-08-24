package ch2.lecture;

import java.util.Scanner; // 1. import문 추가

public class C05Scanner {
	public static void main(String[] args) {
		// 화면에서 입력받은 

		// 2. Scanner클래스의 객체 생성
		Scanner scanner = new Scanner(System.in);

//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num);
//		System.out.println(num2);

		String input = scanner.nextLine();
		int num = Integer.parseInt(input);

		System.out.println(num);
	}
}
