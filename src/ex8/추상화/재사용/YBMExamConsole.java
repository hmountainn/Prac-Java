package ex8.�߻�ȭ.����;

import java.util.Scanner;

public class YBMExamConsole extends ExamConsole {
	
	@Override
	protected void onPrint(){
		YBMExam exam = (YBMExam)getExam();
		//YBMExam���� �޼ҵ� ������
		System.out.printf("toeic:%d\n",exam.getToeic());
		System.out.printf("aa:%d\n", exam.getAa());
	}
	
	@Override
	public void input() {
		super.input();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("toeic:");
		int toeic = scan.nextInt();
		System.out.print("aa:");
		int aa = scan.nextInt();
		
		YBMExam exam = (YBMExam)getExam();
		exam.setToeic(toeic);
		exam.setAa(aa);
		
	}
}
