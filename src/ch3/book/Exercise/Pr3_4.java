package ch3.book.Exercise;

public class Pr3_4 {
	public static void main(String[] args) {
		// Q. 사과를 담는데 필요한 바구니 수 구하기
		int numOfAppels = 123; //사과의 개수
		int sizeOfBucket = 10; //바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = numOfAppels/sizeOfBucket + (numOfAppels%sizeOfBucket > 0 ? 1 : 0) ;
		
		System.out.println("필요한 바구니의 수 = " + numOfBucket); //13
	}
}
