package ch5;

public class Ex5_02 {
	public static void main(String[] args) {
		//Q. 배열의 총합과 평균 구하기 (for문)
		int sum = 0;
		float avg = 0f;
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		avg = sum / (float)score.length;
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
	}
}
