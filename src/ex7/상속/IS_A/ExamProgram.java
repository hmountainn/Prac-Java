package ex7.상속.IS_A;

public class ExamProgram {

	public static void main(String[] args) {
		Exam exam = new Exam();
		int total = exam.total();
		float avg = exam.avg();
		
		System.out.printf("합계:%d, 평균:%f\n",total, avg);

	}

}
