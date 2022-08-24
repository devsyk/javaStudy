package ch4.exercise;

public class Pr4_05 {
	public static void main(String[] args) {
		//Q. 다음의 for문을 while문으로 변경
		for(int i = 0; i <= 10; i++) {
		    for(int j = 0; j <= i; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}

		System.out.println("==================");

		// >> while문		
		int n = 0;
		int m = 0;
		while(n < 10) {	//10번 반복			
		    n++; //10줄
		    while(m < n) {
		        m++; //* 개수	
		        System.out.print("*");
		    }
		    m = 0; //* 개수 초기화
		    System.out.println();
		}
		
		
		//다른 풀이 
		// >> while문		
		int i = 0;
		while(i <= 10) { //10번 반복			
		    int j = 0; //한줄에 있는 *개수 초기화
		    while(j < i) {
		        System.out.print("*");
		        j++; //* 개수	
		    }
		    i++; //10줄
		    System.out.println();
		}
		
	}
}
