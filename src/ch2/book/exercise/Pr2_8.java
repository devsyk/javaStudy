package ch2.book.exercise;

public class Pr2_8 {
	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		int z = 3;
		
		int tmp = x;
		x = y;
		y = z;
		z = tmp;
		
		System.out.println("x= " + x); //2
		System.out.println("y= " + y); //3
		System.out.println("z= " + z); //1
	}
}
