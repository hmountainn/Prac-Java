import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		//콘솔입력과 출력
		
		//1.변수 설정
		int kor, eng, math, total;
		double avg;
		
		
		//2. Scanner이용해서 입력받기
		Scanner scan = new Scanner(System.in);
		System.out.println("┌─────────────────┐");
		System.out.println("│     성적 입력      │");
		System.out.println("└─────────────────┘");
		
		System.out.print("국어성적 입력:");
		kor = scan.nextInt();
		
		System.out.print("영어성적 입력:");
		eng = scan.nextInt();
		
		System.out.print("수학성적 입력:");
		math = scan.nextInt();
		
		total = kor + eng + math;
		avg = total/3.0f;
		
		//3.출력
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
