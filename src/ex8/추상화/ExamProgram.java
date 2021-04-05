package ex8.추상화;

public class ExamProgram {

	public static void main(String[] args) {
		//YBMExam객체 사용
		Exam exam = new YBMExam();
		System.out.println(exam.avg());
		
		//배열통해 일괄사용
		Exam[] exams = new Exam[2];
		exams[0] = new NewExam();
		exams[1] = new YBMExam();
		
		for(int i=0; i<2; i++) {
			System.out.println(exams[i].avg());
		}
	}

}
