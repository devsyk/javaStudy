package ch4;

public class Ex4_17 {
	public static void main(String[] args) {
		// Q. 3의 배수가 아닌 1~10사이 수의 합
		for(int i = 0; i <= 10; i++) {
			if(i%3==0) 
				continue; //조건식이 참이 되어 continue문이 수행되면 블럭의 끝으로 이동 후 반복(반복문 종료X)
			System.out.println(i);
		}		
	}
}
