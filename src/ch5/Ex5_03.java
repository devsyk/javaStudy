package ch5;

public class Ex5_03 {
	public static void main(String[] args) {
		//Q. 배열의 최대값과 최소값 구하기
		int[] score = {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0];
		int min = score[0];
		
		for(int i = 1; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			} else if(score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}
}
