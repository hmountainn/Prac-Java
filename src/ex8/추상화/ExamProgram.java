package ex8.�߻�ȭ;

public class ExamProgram {

	public static void main(String[] args) {
		//YBMExam��ü ���
		Exam exam = new YBMExam();
		System.out.println(exam.avg());
		
		//�迭���� �ϰ����
		Exam[] exams = new Exam[2];
		exams[0] = new NewExam();
		exams[1] = new YBMExam();
		
		for(int i=0; i<2; i++) {
			System.out.println(exams[i].avg());
		}
	}

}
