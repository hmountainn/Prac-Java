package ex7.상속.IS_A;

public class ExamProgram {

	public static void main(String[] args) {
		//참조형식 부모형식으로 변경
		Exam exam = new NewExam();
		int total = exam.total();
		float avg = exam.avg();
		
		System.out.printf("합계:%d, 평균:%f\n",total, avg);

	}

}
