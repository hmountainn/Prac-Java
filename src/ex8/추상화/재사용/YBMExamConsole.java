package ex8.�߻�ȭ.����;

import java.util.Scanner;

public class YBMExamConsole extends ExamConsole {

	@Override
	protected void onPrint() {
		YBMExam exam =(YBMExam)getExam(); //YBMExam��ü ������
		System.out.printf("com:%d\n", exam.getCom());
		System.out.printf("sci:%d\n", exam.getSci());
	}
	
	@Override
	public void input() {
		super.input();
		YBMExam exam = (YBMExam)getExam();
		
		int com,sci;
		Scanner scan = new Scanner(System.in);
		System.out.print("com:");
		com = scan.nextInt();
		System.out.print("sci:");
		sci = scan.nextInt();
		
		exam.setCom(com);
		exam.setSci(sci);
	}
}
