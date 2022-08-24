package ch5;

public class Ex5_05 {
	public static void main(String[] args) {
		/*
		 * Q. 로또번호 생성 - 1~45번호 섞은 후 맨앞 6개 출력
		 */
		//1. 45개 정수 저장 위한 배열을 생성한다.
		int[] ball = new int[45]; 
		
		//2. 배열의 각 요소에 1~45 값 저장한다.
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i+1; //ball[0]에 1이 저장된다.
		}
		
		//3. 변수를 만든다.
		int tmp = 0; //두 값을 바꾸는데 사용할 임의 변수
		int j = 0; //임의의 값을 얻어서 저장할 변수
		
		//4. 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다.
		//   0번째부터 5번째 요소까지 모두 6개만 바꾼다.
		for(int i = 0; i < 6; i++) {
			j = (int)(Math.random()*45); //0~44 임의의 값 얻는다.
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;		//ball[i]와 ball[j]를 서로 바꾼다.
		}
		
		//5. 배열 ball의 앞에서부터 6개의 요소를 출력한다.
		for(int i = 0; i < 6; i++) {
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		}
		
	}
}
