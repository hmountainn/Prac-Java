package ex8.�߻�ȭ.����;

import java.util.Scanner;

public class ExamConsole{
	//has a ���
	private Exam exam;
	
	//��ü��
	//���� ����� ��ü�� �׳� ���� �����
	public ExamConsole() {
	}
	
	//�и���
	//�⺻������ ���ְ� -> exam�� �Ⱦƾ߸��ϴ� ������
	public ExamConsole(Exam exam) {
		super();
		this.exam = exam;
	}
	
	//setter
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	//�ڽĿ��� exam��ü �ټ��ֵ���
	protected Exam getExam() {
		return exam;
	}
	
	protected void onPrint(){
		
	}

	public void print() {
		System.out.println("-----------------------------");
		System.out.println("           ���� ���           ");
		System.out.println("-----------------------------");
		System.out.printf("kor:%d\n", exam.getKor());
		System.out.printf("eng:%d\n", exam.getEng());
		System.out.printf("math:%d\n", exam.getMath());
		
		onPrint();
		System.out.printf("total:%d\n", exam.total());
		System.out.printf("avg:%f\n", exam.avg());
		System.out.println("-----------------------------");
	}
	
	public void input() {
		int kor;
		int eng;
		int math; 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("kor:");
		kor = scan.nextInt();
		System.out.print("eng:");
		eng = scan.nextInt();
		System.out.print("math:");
		math = scan.nextInt();
		
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
	}


}