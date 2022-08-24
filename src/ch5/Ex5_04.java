package ch5;

import java.util.Arrays;

public class Ex5_04 {
	public static void main(String[] args) {
		//Q. 0~9 숫자를 100번 섞어 배열의 요소를 섞이게
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr)); //배열을 문자열로 출력
		
		for(int i = 0; i < 100; i++) {
			int n = (int)(Math.random()*10); //0~9 임의의 수 얻는다.
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp; 		//numArr[0]과 numArr[n]을 100번 서로 바꾼다.
		}
		System.out.println(Arrays.toString(numArr));
	}
}
