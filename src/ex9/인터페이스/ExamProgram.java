package ex9.�������̽�;

public class ExamProgram {

	public static void main(String[] args) {
		
//		//NewExam���(has a)
//		Exam exam = new NewExam();
//		
//		ExamConsole console = new ExamConsole();
//		console.setExam(exam);
//		
//		console.input();
//		console.print();

		
		
		//YBMExam ���(is a)
		YBMExam exam = new YBMExam(1,1,1,1,1);
		Banner banner = new YBMBanner();
		
		YBMExamConsole ybmconsole = new YBMExamConsole();
		ybmconsole.setExam(exam);
		ybmconsole.setBanner(banner);

		
		ybmconsole.input();
		ybmconsole.print();

	}
}
