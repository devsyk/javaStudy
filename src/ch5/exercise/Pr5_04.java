package ch5.exercise;

public class Pr5_04 {
	public static void main(String[] args) {
		//Q. 2차원 배열의 모든 값의 총합과 평균 구하기
		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		int total = 0;
		float average = 0;
		int num = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
			}
			num += arr[i].length;
		}
		average = total / (float)num;
		// average = total / (float)(arr.length * arr[0].length);  <<다른풀이
				
		System.out.println("total = " + total);
		System.out.println("average = " + average);
	}
}
