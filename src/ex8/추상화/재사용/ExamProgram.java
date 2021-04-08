package ex8.추상화.재사용;

public class ExamProgram {

	public static void main(String[] args) {
		
		//NewExam사용(has a)
		Exam exam = new NewExam();
		
		ExamConsole console = new ExamConsole();
		console.setExam(exam);
		
		console.print();
		
		
		//YBMExam 사용(is a)
		YBMExam exam1 = new YBMExam(1,1,1,1,1);
		
		YBMExamConsole ybmconsole = new YBMExamConsole();
		ybmconsole.setExam(exam1);
		
		ybmconsole.print();

	}
}
