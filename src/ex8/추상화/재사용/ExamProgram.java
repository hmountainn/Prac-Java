package ex8.추상화.재사용;

public class ExamProgram {

	public static void main(String[] args) {
		
		Exam exam = new YBMExam(1,1,1,1,1);
		
		YBMExamConsole ybmConsole = new YBMExamConsole();
		ybmConsole.setExam(exam);
		
		ybmConsole.input();
		ybmConsole.print();
		
//		//생성자 종속성 주입:Constructor DI(Dependency Injection)
//		//분리형
//		//ExamConsole안에 (exam) 부품을 끼워넣는거 //조립
//		ExamConsole console = new ExamConsole(exam);
//		//Setter DI
//		console.setExam(exam);
//		
//		console.print();
		
	}
}