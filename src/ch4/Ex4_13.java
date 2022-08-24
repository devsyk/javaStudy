package ch4;

public class Ex4_13 {
	public static void main(String[] args) {
		// 1부터 몇까지 더해야 100을 넘지 않는지
		int sum = 0;
		int i = 0;

		while(sum <= 100) {
			System.out.printf("%d - %d%n", i, sum);
			sum += ++i; //i를 계속 1씩 증가시키면서 sum에 추가
		}
	}
}
