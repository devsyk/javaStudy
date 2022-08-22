package ch4;

import java.util.Scanner;

public class Ex4_05 {
	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = 0;
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); //화면을 통해 입력받은 점수를 score에 저장
		
		System.out.println("당신의 점수는 %입니다.%n" + score);
		
		if(score>=90) {
			grade = 'A';
			if(score>=98) {
				opt = '+';
			}
		}
	}
}
