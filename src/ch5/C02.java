package ch5;

import java.util.Arrays;

public class C02 {
	public static void main(String[] args) {
		String[] strArr = { "가위", "바위", "보"};
		System.out.println(Arrays.toString(strArr));
		
		for(int i=0; i<10; i++) {
			int tmp = (int)(Math.random()*3);
			//System.out.println(tmp); //0~2
			System.out.println(strArr[tmp]);
		}
		
		
		String str = "ABCDE";
		char ch = str.charAt(4);
		String str2 = str.substring(1,4);
		String str3 = str.substring(1);
		String str4 = str.substring(1, str.length());
		System.out.println(str2); //BCD
		System.out.println(str3); //BCDE
	}
}
