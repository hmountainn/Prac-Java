
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
		
		//2. printf()로 형식지정해서 출력
		System.out.println("┌─────────────────┐");
		System.out.println("│     성적 출력      │");
		System.out.println("└─────────────────┘");
		System.out.printf("국어:%d\n", kor);
		System.out.printf("영어:%d\n", eng);
		System.out.printf("수학:%d\n", math);
		System.out.printf("총점:%d\n", total);
		System.out.printf("평균:%.1f\n ", avg);

	}

}
