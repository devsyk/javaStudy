package ch3.book.Exercise;

public class Pr3_4 {
	public static void main(String[] args) {
		// Q. ����� ��µ� �ʿ��� �ٱ��� �� ���ϱ�
		int numOfAppels = 123; //����� ����
		int sizeOfBucket = 10; //�ٱ����� ũ��(�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		int numOfBucket = numOfAppels/sizeOfBucket + (numOfAppels%sizeOfBucket > 0 ? 1 : 0) ;
		
		System.out.println("�ʿ��� �ٱ����� �� = " + numOfBucket); //13
	}
}
