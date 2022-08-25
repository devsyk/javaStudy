package ch5.exercise;

public class Pr5_05 {
	public static void main(String[] args) {
		//Q. 1~9 사이의 중복되지 않은 수로 이루어진 3자리 숫자 만들기
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		//배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for(int i = 0; i < ballArr.length; i++) {
			int j = (int)(Math.random() * ballArr.length); //1~9 임의의 수
			int tmp = 0;
			
			//ballArr[i]와 ballArr[j]를 서로 바꾼다.
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		
		//ballArr의 앞에서 3개 수를 ball3로 복사 후, 3자리수로 출력한다.
		for(int i = 0; i < 3; i++) {
			ball3[i] = ballArr[i];
			System.out.print(ball3[i]);
		}
		
		//ballArr의 앞에서 3개 수를 ball3로 복사 후, 3자리수로 출력한다. <<다른풀이
//		System.arraycopy(ballArr, 0, ball3, 0, 3); //ballArr[0]에서 ball3[0]으로 3개의 데이터 복사
//		for(int i = 0; i < ball3.length; i++) {
//			System.out.print(ball3[i]);
//		}
		
	}
}
