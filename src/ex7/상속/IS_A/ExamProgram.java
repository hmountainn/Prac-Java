package ex7.»ó¼Ó.IS_A;

public class ExamProgram {

	public static void main(String[] args) {
		//NewExam°´Ã¼ »ç¿ë
		NewExam exam = new NewExam();
		int total = exam.total();
		float avg = exam.avg();
		
		System.out.printf("ÇÕ°è:%d, Æò±Õ:%f\n",total, avg);

	}

}
