package ex8.�߻�ȭ.����;

public class NewExam extends Exam {
	private int com;
	
	public NewExam() { //������

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
	
	@Override //�߻�ȭ �޼ҵ� ����
	public float avg() {
		return this.total() / 4.0f;
	}

}
