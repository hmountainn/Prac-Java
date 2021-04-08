package ex8.�߻�ȭ.����;

public class ExamConsole{
	
	private Exam exam;
	
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
	
	protected void onPrint() {
		
	}
	
	public void print() {
		System.out.println("-----------------------------");
		System.out.println("           ���� ���           ");
		System.out.println("-----------------------------");
		System.out.printf("kor:%d\n", exam.getKor());
		System.out.printf("eng:%d\n", exam.getEng());
		System.out.printf("math:%d\n", exam.getMath());
		
		onPrint();
		System.out.printf("total:%d\n", exam.total());
		System.out.printf("avg:%f\n", exam.avg());
		System.out.println("-----------------------------");
	}
	
	
	

	

}
