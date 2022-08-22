package ch4;

import java.util.Scanner;

public class Ex4_15 {
	public static void main(String[] args) {
		// Q. 1~100까지 임의의 정수 맞추기
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()*100)+1; //1~100 임의의 수
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1과 100 사이의 정수를 입력하세요.>");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			} else if(input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		} while(input != answer); //input == answer 까지 반복 
		
		System.out.println("정답입니다.");
	}
}
