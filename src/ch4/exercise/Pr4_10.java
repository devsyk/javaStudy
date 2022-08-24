package ch4.exercise;

import java.util.Scanner;

public class Pr4_10 {
	public static void main(String[] args) {
		//Q. 1~100사이의 수 맞추기 - 몇번만에 숫자를 맞췄는지 
		Scanner scanner = new Scanner(System.in);
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;

		while(true) {
			count++;
		    System.out.print("1과 100사이의 값을 입력하세요 : ");			
		    input = scanner.nextInt();

		    if(answer > input) {
		        System.out.println("더 큰 수를 입력하세요.");
		    } else if(answer < input) {
		        System.out.println("더 작은 수를 입력하세요.");
		    } else {
		        System.out.println("맞췄습니다.");
		        break;
		    }
		}
		System.out.println("시도횟수는 " + count + "번입니다.");
		
	}
}
