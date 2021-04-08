package ex8.추상화.재사용;

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
	
	//추상화 메소드 구현
	@Override
	public float avg() {
		return this.total() / 5.0f;
	}
	
	
	//getter 와 setter
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
