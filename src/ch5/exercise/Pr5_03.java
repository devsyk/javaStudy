package ch5.exercise;

public class Pr5_03 {
	public static void main(String[] args) {
		//Q. 모든 배열의 값의 총합 구하기
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("sum = " + sum);
	}
}
