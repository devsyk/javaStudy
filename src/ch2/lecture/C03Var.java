package ch2.lecture;

public class C03Var {
	public static void main(String[] args) {
		int score = 100;
		score = 200;
		
		// ��� : ���� Ÿ�� �տ� final �߰�
		// �缱�� �Ұ�
		final int score2 = 100;
//		score2 = 200;
		
		boolean power = false;
		
		byte b = 127;	// -128 ~ 127
		
		int oct = 010; 	// 8����, 10������ 8
		int hex = 0x10;	// 16����, 10������ 16
		
		long l = 10_000_000_000L; // L�߰�
		
		float f = 3.14f;	// F�߰�
		double d = 3.14f;
		
		char ch = 'A';
		int i = 'A';
		
		String str = ""; // ���ڿ�
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		
		System.out.println(10.); //10.0
		System.out.println(.10); //0.1
		System.out.println(10f); //10.0
		System.out.println(1e3); //1000.0
	}
}
  