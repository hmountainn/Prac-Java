package ex8.�߻�ȭ;

public class YBMExam extends Exam {
	private int com;
	private int sci;
	
	public YBMExam() {
		
	}
	
	@Override
	public int total() {
		return super.total() + com + sci;
	}
	
	//�߻�ȭ �޼ҵ� ����
	@Override
	public float avg() {
		return this.total() / 5.0f;
	}
	
	
}
