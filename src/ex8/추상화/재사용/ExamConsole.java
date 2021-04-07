package ex8.추상화.재사용;

import java.util.Scanner;

public class ExamConsole{
	//has a 상속
	private Exam exam;
	
	//일체형
	//내가 사용할 객체는 그냥 내가 만들게
	public ExamConsole() {
	}
	
	//분리형
	//기본생성자 없애고 -> exam를 꽂아야만하는 생성자
	public ExamConsole(Exam exam) {
		super();
		this.exam = exam;
	}
	
	//setter
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	//자식에게 exam객체 줄수있도록
	protected Exam getExam() {
		return exam;
	}
	
	protected void onPrint(){
		
	}

	public void print() {
		System.out.println("-----------------------------");
		System.out.println("           성적 출력           ");
		System.out.println("-----------------------------");
		System.out.printf("kor:%d\n", exam.getKor());
		System.out.printf("eng:%d\n", exam.getEng());
		System.out.printf("math:%d\n", exam.getMath());
		
		onPrint();
		System.out.printf("total:%d\n", exam.total());
		System.out.printf("avg:%f\n", exam.avg());
		System.out.println("-----------------------------");
	}
	
	public void input() {
		int kor;
		int eng;
		int math; 
		
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