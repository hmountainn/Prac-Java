package ex8.추상화.재사용;

public class ExamConsole{
	
	private Exam exam;
	
	
	public ExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	public Exam getExam() {
		return exam;
	}
	
	
	public void print() {
		System.out.println("-----------------------------");
		System.out.println("           성적 출력           ");
		System.out.println("-----------------------------");
		System.out.printf("kor:%d\n", exam.getKor());
		System.out.printf("eng:%d\n", exam.getEng());
		System.out.printf("math:%d\n", exam.getMath());
		
		System.out.printf("total:%d\n", exam.total());
		System.out.printf("avg:%f\n", exam.avg());
		System.out.println("-----------------------------");
	}
	
	
	

	

}
