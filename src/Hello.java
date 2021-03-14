
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
		
		//2. print()이용출력
		System.out.print("┌─────────────────┐\n");
		System.out.print("│     성적 출력      │\n");
		System.out.print("└─────────────────┘\n");
		System.out.print("국어: "+ kor+"\n");
		System.out.print("영어: "+ eng+"\n");
		System.out.print("수학: "+ math+"\n");
		System.out.print("총점: "+ total+"\n");
		System.out.print("평균: "+ avg+"\n");

	}

}
