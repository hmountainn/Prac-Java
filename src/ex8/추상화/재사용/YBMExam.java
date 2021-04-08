package ex8.추상화.재사용;

public class YBMExam extends Exam {
	private int com;
	private int sci;
	
	public YBMExam() {
		
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
	
	
}
