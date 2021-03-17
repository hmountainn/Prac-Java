package ex3.array;

public class Program2 {

	public static void main(String[] args) {
		//배열 및 반복문 연습
		
		//1. 문자 10개를 저장하기위한 배열chs 생성
		char[] chs = new char[10];
		
		//2.chs 배열을 'A'로 채우기
		for(int i=0; i<10; i++)
			chs[i] = 'A';
		
		//3.chs 배열에 담겨진 값 모두 출력
		for(int i=0; i<10; i++)
			System.out.printf("%c ",chs[i]);
		
		System.out.println();
		
		//4.J부터 A까지 배열에 채우기
		for(int i=0; i<10; i++)
			chs[i] = (char) ('J'-i);
		
		//5.순서뒤집기
		char temp;
		for(int i=0; i<5; i++) {
			temp = chs[9-i];
			chs[9-i] = chs[i];
			chs[i] = temp;
		}
		//6.출력
		for(int i=0; i<10; i++)
			System.out.printf("%c ",chs[i]);
	}

}
