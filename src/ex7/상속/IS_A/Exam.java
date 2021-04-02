package ex7.»ó¼Ó.IS_A;

public class Exam {
	private int kor;
	private int eng;
	private int math;
	
	
	public int total() {
		return kor+eng+math;
	}
	
	public float avg() {
		return this.total() / 3.0f;
	}
}
