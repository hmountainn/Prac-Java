package ex8.�߻�ȭ.����;

public class ExamProgram {

	public static void main(String[] args) {
		
		//NewExam���(has a)
		Exam exam = new NewExam();
		
		ExamConsole console = new ExamConsole();
		console.setExam(exam);
		
		console.print();
		
		
		//YBMExam ���(is a)
		YBMExam exam1 = new YBMExam(1,1,1,1,1);
		
		YBMExamConsole ybmconsole = new YBMExamConsole();
		ybmconsole.setExam(exam1);
		
		ybmconsole.print();

	}
}
