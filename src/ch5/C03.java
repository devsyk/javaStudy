package ch5;

import java.util.Arrays;

public class C03 {
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4}; //1차원 배열 arr
		int[][] arr2D = {{11,12},{21,22}}; //2차원 배열	
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr2D));
		
		String[][] str2D  = {{"ccc","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = {{"aaa","bbb"},{"AAA","BBB"}};		
		System.out.println(Arrays.deepEquals(str2D, str2D2)); //비교
		
		int[] arr2  = Arrays.copyOf(arr, 7);
		int[] arr22 = Arrays.copyOfRange(arr, 2, 4);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr22));
		
		int[] arr1 = {3,4,1,0,2};
		System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr1); //배열 arr을 오름차순으로 정렬
		System.out.println(Arrays.toString(arr1));
	}
}
