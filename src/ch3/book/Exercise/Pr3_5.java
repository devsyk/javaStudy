package ch3.book.Exercise;

public class Pr3_5 {
	public static void main(String[] args) {
		// Q. ���� num�� ���� '���','����','0' ����ϴ� �ڵ�
		int num = 10;
		System.out.println(num == 0 ? 0 : (num > 0 ? "���" : "����"));
	}
}
