package ex7.���.IS_A;

public class Exam {
	private int kor;
	private int eng;
	private int math;
	
	public Exam() {//������
		kor = 10;
		eng = 10;
		math = 10;
	}
	
	public int total() {
		return kor+eng+math;
	}
	
	public float avg() {
		return this.total() / 3.0f;
	}
}
