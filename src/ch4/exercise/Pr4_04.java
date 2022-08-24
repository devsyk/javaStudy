package ch4.exercise;

public class Pr4_04 {
	public static void main(String[] args) {
		//Q. 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갈 때, 몇까지 더해야 총합이 100 이상 되는지
		int sum = 0;
		int n = 1;
		while(sum < 100) {
		    int a = 0;
		    if(n%2 == 0) { //짝수이면 음수로 변경
		        a = n*(-1);		
		        sum += a;
		    } else {
		        sum += n;
		    }
		    //System.out.println("n = " + n + "    sum = " + sum);
		    n++;
		}
		System.out.println("총합이 100이상 되는 수: " + (n-1)); //199


		//다른 풀이 *****
		//Q. 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갈 때, 몇까지 더해야 총합이 100 이상 되는지
		// 1*(1) + 2*(-1) + 3*(1) + 4*(-1) + ...
		int num = 0; // 1 -2 3 -4 5 -6 ...
		int a = 1; // 1 -1 1 -1 1 -1 ...
		int sum1 = 0;

		for(int i = 1; sum1 < 100; i++, a=-a) {
			num = i * a; //부호결정
		    sum1 += num;
		    System.out.println("num = " + num + " / a = " + a + " / sum = " + sum1);
		}

		System.out.println("총합이 100이상 되는 수: " + num); //199

	}
}
