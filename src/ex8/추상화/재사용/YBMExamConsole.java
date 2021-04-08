package ex8.추상화.재사용;

public class YBMExamConsole extends ExamConsole {

	@Override
	protected void onPrint() {
		YBMExam exam =(YBMExam)getExam(); //YBMExam객체 들고오기
		System.out.printf("com:%d\n", exam.getCom());
		System.out.printf("sci:%d\n", exam.getSci());
	}
}
