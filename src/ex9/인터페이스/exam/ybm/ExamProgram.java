package ex9.�������̽�.exam.ybm;

import ex9.�������̽�.exam.Banner;

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
		
		YBMExamConsole ybmconsole = new YBMExamConsole();
		ybmconsole.setExam(exam);
		ybmconsole.setBanner(ybmconsole);

		
		ybmconsole.input();
		ybmconsole.print();

	}
}
