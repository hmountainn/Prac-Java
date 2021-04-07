package ex8.추상화.재사용;

public class NewExam extends Exam {
	private int com;
	
	public NewExam() { //생성자

		this(1,1,1,1); 
	}
	
	public NewExam(int kor, int eng,int math, int com) {
		super(kor,math,eng);
		this.com = com;
	}
	
	@Override
	public int total() {
		return baseTotal() + com;
	}
	
	@Override //추상화 메소드 구현
	public float avg() {
		return this.total() / 4.0f;
	}

}
