package ch5;

import java.util.Arrays;

public class C01 {
	public static void main(String[] args) {
//		int[] score; 		// 1. �迭 score ���� (��������)
//		score = new int[5]; // 2. �迭�� ���� (int ������� x5)
		
		int[] score = new int[5]; //�迭�� ����� ���� ���ÿ�
		score[3] = 100;
		
		System.out.println("score[0]=" + score[0]);
		System.out.println("score[1]=" + score[1]);
		System.out.println("score[2]=" + score[2]);
		System.out.println("score[3]=" + score[3]);
		System.out.println("score[4]=" + score[4]);
		
		int value = score[3];
		System.out.println("value = " + value);
		

		int[] arr = new int[10]; // ���̰� 10�� �迭 arr
		System.out.println("arr.length = " + arr.length); //�迭�� ����
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] = " + arr[i]);
		}
		
		int[] iArr = {100, 95, 80, 70, 60};
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		System.out.println(Arrays.toString(iArr));
		
	}
}
