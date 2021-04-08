package ex9.인터페이스.exam.ybm;

import ex9.인터페이스.exam.Banner;

public class ExamProgram {

	public static void main(String[] args) {
		
//		//NewExam사용(has a)
//		Exam exam = new NewExam();
//		
//		ExamConsole console = new ExamConsole();
//		console.setExam(exam);
//		
//		console.input();
//		console.print();

		
		
		//YBMExam 사용(is a)
		YBMExam exam = new YBMExam(1,1,1,1,1);
		
		YBMExamConsole ybmconsole = new YBMExamConsole();
		ybmconsole.setExam(exam);
		ybmconsole.setBanner(ybmconsole);

		
		ybmconsole.input();
		ybmconsole.print();

	}
}
