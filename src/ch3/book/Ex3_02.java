package ch3.book;

public class Ex3_02 {
	public static void main(String[] args) {
		int i = 5, j = 0;
		
		j = i++; //후위형 
		System.out.println("j=i++; 실행 후, i=" + i + ", j=" + j);
		
		i = 5;
		j = 0;
		
		j = ++i; //전위형
		System.out.println("j=++i; 실행 후, i=" + i + ", j=" + j);
	}
}
