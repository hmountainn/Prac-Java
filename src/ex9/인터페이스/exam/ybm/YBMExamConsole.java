package ex9.�������̽�.exam.ybm;

import java.util.Scanner;

import ex9.�������̽�.exam.Banner;
import ex9.�������̽�.exam.ExamConsole;

public class YBMExamConsole extends ExamConsole implements Banner {

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

	@Override
	public void start() {
		System.out.println("-----------------------------");
		System.out.println("           YBM ���� ���        ");
		System.out.println("-----------------------------");
		
	}

	@Override
	public void end() {
		System.out.println("-----------------------------");
		
	}
}
