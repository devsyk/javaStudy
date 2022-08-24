package ch5;

public class Ex5_06 {
	public static void main(String[] args) {
		String[] names = {"Kim", "Park", "Yi"};		
		for(int i = 0; i < names.length; i++) {
			System.out.println("names["+i+"] : "+names[i]);
		}
		
		String tmp = names[2]; //배열의 세번째 요소를 tmp에 저장
		System.out.println("tmp: "+tmp);
		names[0] = "Yu"; //배열의 첫번째 요소를 "Yu"로 저장
		
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
