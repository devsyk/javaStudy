package ch5.exercise;

import java.util.Scanner;

public class Pr5_06 {
	public static void main(String[] args) {
		//Q. 단어 글자위치를 섞어서 보여주고 원래의 단어를 맞추기
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray(); //String을 char[]로 변환
			
			//char배열 question에 담긴 문자의 위치를 임의로 바꾼다.			
			char tmp;
			int k;
			
			for(int j = 0; j < question.length; j++) {
				k = (int)(Math.random() * question.length);
				tmp = question[j];
				question[j] = question[k];
				question[k] = tmp;			
								
			}
			System.out.printf("Q%d. %s의 정답을 입력하세요.> ", i+1, new String(question));
			String answer = scanner.nextLine();
			
			//trim()으로 answer의 공백을 제거한 후, equals로 word[i]와 비교
			if(words[i].equals(answer.trim())) {
				System.out.println("맞았습니다.");
			} else {
				System.out.println("틀렸습니다.");
			}
		}
	}
}
