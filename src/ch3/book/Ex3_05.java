package ch3.book;

public class Ex3_05 {
	public static void main(String[] args) {
		double d = 85.4;
		int score = (int)d;
		System.out.println("score= "+score);
		System.out.println("d= "+d); //형변환 후에도 피연산자에는 변화없음
	}
}
