package ex8.추상화.재사용;

public class ExamProgram {

	public static void main(String[] args) {
		
		YBMExam exam = new YBMExam(1,1,1,1,1);
		
		YBMExamConsole ybmconsole = new YBMExamConsole();
		ybmconsole.setExam(exam);
		
		ybmconsole.print();

	}
}
