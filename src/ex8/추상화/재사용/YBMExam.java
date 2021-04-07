package ex8.추상화.재사용;

public class YBMExam extends Exam {

	private int toeic;
	private int aa;
	
	public YBMExam() {
		
	}
	
	public YBMExam(int kor, int eng, int math, int toeic, int aa) {
		super(kor,eng,math);
		this.toeic = toeic;
		this.aa = aa;
	}
	
	@Override
	public int total() {
		return baseTotal() + toeic + aa;
	}
	
	@Override //추상화 메소드 구현
	public float avg() {
		return this.total() / 5.0f;
	}

	
	//getter setter
	public int getToeic() {
		return toeic;
	}

	public void setToeic(int toeic) {
		this.toeic = toeic;
	}

	public int getAa() {
		return aa;
	}

	public void setAa(int aa) {
		this.aa = aa;
	}
	
	
}
