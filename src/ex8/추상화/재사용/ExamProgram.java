package ex8.추상화.재사용;

public class ExamProgram {

	public static void main(String[] args) {
		
		Exam exam = new NewExam(1,1,1,1);
		
		ExamConsole console = new ExamConsole(exam);
		console.setExam(exam);
		
		console.print();

	}
}
