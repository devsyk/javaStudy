package ch4;

public class Ex4_11 {
	public static void main(String[] args) {
		// 정사각형만들기(5행 10열)
		for(int i = 1; i <= 5; i++) { //5번 출럭
			for(int j = 1; j <= 10; j++) { 
				System.out.print("*"); //한줄에 * 10개 출력
			}
			System.out.println(); //줄바꿈
		}
		System.out.println();	

		// 삼각형 만들기
		for(int i = 1; i <= 5; i++) { //5번 출력
			for(int j = 1; j <= i; j++) {
				System.out.print("*"); //1 ~ 5개 출력
			}
			System.out.println(); //줄바꿈
		}
		System.out.println();	
		for(int i = 5; i >= 1; i--) { //5번 출력
			for(int j = i; j >= 1; j--) {
				System.out.print("*"); //5 ~ 1개 출력
			}
			System.out.println(); //줄바꿈
		}
	}
}
