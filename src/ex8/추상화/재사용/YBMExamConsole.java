package ex8.�߻�ȭ.����;

public class YBMExamConsole extends ExamConsole {

	@Override
	protected void onPrint() {
		YBMExam exam =(YBMExam)getExam(); //YBMExam��ü ������
		System.out.printf("com:%d\n", exam.getCom());
		System.out.printf("sci:%d\n", exam.getSci());
	}
}
