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
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int total() {
		return kor+eng+math;
	}
	
	public int total(int ext) { //�����ε� �Լ�
		return kor+eng+math;
	}
	
	public float avg() {
		return this.total() / 3.0f;
	}
}
