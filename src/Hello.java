
public class Hello {

	public static void main(String[] args) {
		//콘솔 출력하기
		//1.변수 설정
		int kor, eng, math, total;
		double avg;
		
		kor = 60;
		eng = 40;
		math = 50;
		
		total = kor + eng + math;
		avg = total/3;
		
		//2. printlnln()이용출력
		System.out.println("┌─────────────────┐");
		System.out.println("│     성적 출력      │");
		System.out.println("└─────────────────┘");
		System.out.println("국어: "+ kor);
		System.out.println("영어: "+ eng);
		System.out.println("수학: "+ math);
		System.out.println("총점: "+ total);
		System.out.println("평균: "+ avg);

	}

}
