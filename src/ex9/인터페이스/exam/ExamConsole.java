package ex9.인터페이스.exam;

import java.util.Scanner;

public class ExamConsole{
	
	private Exam exam;
	private Banner banner;
	
	public ExamConsole() {
		
	}
	
	public ExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	protected Exam getExam() {
		return exam;
	}
	
	public void setBanner(Banner banner) {
		this.banner = banner;
	}
	
	protected void onPrint() {
		
	}
	
	public void print() {
//		System.out.println("-----------------------------");
//		System.out.println("           성적 출력           ");
//		System.out.println("-----------------------------");
		banner.start();
		System.out.printf("kor:%d\n", exam.getKor());
		System.out.printf("eng:%d\n", exam.getEng());
		System.out.printf("math:%d\n", exam.getMath());
		
		onPrint();
		System.out.printf("total:%d\n", exam.total());
		System.out.printf("avg:%f\n", exam.avg());
//		System.out.println("-----------------------------");
		banner.end();
	}
	
	public void input() {
		
		int kor,eng,math;
		Scanner scan = new Scanner(System.in);
		System.out.print("kor:");
		kor = scan.nextInt();
		System.out.print("eng:");
		eng = scan.nextInt();
		System.out.print("math:");
		math = scan.nextInt();
		
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
	}
	
	
	

	

}
