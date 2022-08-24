package ch4.exercise;

public class Pr4_07 {
	public static void main(String[] args) {
		//Q. 숫자로 이루어진 문자열 str의 각자리 합을 더한 결과 출력
		String str = "12345";
		int sum = 0;
		int num = Integer.parseInt(str); //정수로 변환
		while(num != 0) {
		    sum += num%10; //해당자리수의 값 저장
		    num /= 10;	//다음 자리수 확인		
		}
		System.out.println("각 자리의 총합 = " + sum); //15
		
		
		//다른 풀이 - 문자열 그대로 사용
		//Q. 숫자로 이루어진 문자열 str의 각자리 합을 더한 결과 출력
		String str1 = "12345";
		int sum1 = 0;
		for(int i = 0; i < str1.length(); i++) {
		    //System.out.println(str1.charAt(i)); //각 문자 출력		
		    //System.out.println(str1.charAt(i)-'0'); // -'0' : 숫자로 변환
		    sum1 += str1.charAt(i)-'0';
		}
		System.out.println("각 자리의 총합 = " + sum1); //15
		
	}
}
