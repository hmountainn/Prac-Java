package ex7.���.IS_A;

public class ExamProgram {

	public static void main(String[] args) {
		//NewExam��ü ���
		NewExam exam = new NewExam();
		int total = exam.total();
		float avg = exam.avg();
		
		System.out.printf("�հ�:%d, ���:%f\n",total, avg);

	}

}
