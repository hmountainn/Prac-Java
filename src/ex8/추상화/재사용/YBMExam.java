package ex8.�߻�ȭ.����;

public class YBMExam extends Exam {
	
	private int com;
	private int sci;
	
	public YBMExam() {
		
	}
	
	public YBMExam(int kor, int eng, int math, int com, int sci) {
		super(kor, eng, math);
		this.com = com;
		this.sci = sci;
	}
	
	@Override
	public int total() {
		return super.baseTotal() + com + sci;
	}
	
	//�߻�ȭ �޼ҵ� ����
	@Override
	public float avg() {
		return this.total() / 5.0f;
	}
	
	
	//getter �� setter
	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}
	
	
}
