package ex8.추상화.재사용;

public abstract class Exam { //추상화 클래스
	private int kor;
	private int eng;
	private int math;
	
	public Exam() {
		this(10,10,10);
	}
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	protected int baseTotal() {
		return kor+eng+math;
	}
	
	//추상화 메소드(자식들 무조건 구현해야함)
	public abstract int total();
	
	public abstract float avg();
	
	
	//getter 와 setter
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
	
}
