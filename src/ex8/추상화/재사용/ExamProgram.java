package ex8.�߻�ȭ.����;

public class ExamProgram {

	public static void main(String[] args) {
		
		Exam exam = new YBMExam(1,1,1,1,1);
		
		YBMExamConsole ybmConsole = new YBMExamConsole();
		ybmConsole.setExam(exam);
		
		ybmConsole.input();
		ybmConsole.print();
		
//		//������ ���Ӽ� ����:Constructor DI(Dependency Injection)
//		//�и���
//		//ExamConsole�ȿ� (exam) ��ǰ�� �����ִ°� //����
//		ExamConsole console = new ExamConsole(exam);
//		//Setter DI
//		console.setExam(exam);
//		
//		console.print();
		
	}
}