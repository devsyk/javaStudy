package ch4;

public class Ex4_16 {
	public static void main(String[] args) {
		// Q. 숫자를 1부터 계속 더해 몇까지 더하면 합이 100을 넘는지
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100)
				break; //while문 종료
			++i;
			sum += i;
		}
		
		System.out.println("i = " + i);
		System.out.println("sum = " + sum);
	}
}
