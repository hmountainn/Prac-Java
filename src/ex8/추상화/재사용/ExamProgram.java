package ex8.�߻�ȭ.����;

public class ExamProgram {

	public static void main(String[] args) {
		
		YBMExam exam = new YBMExam(1,1,1,1,1);
		
		YBMExamConsole ybmconsole = new YBMExamConsole();
		ybmconsole.setExam(exam);
		
		ybmconsole.print();

	}
}
