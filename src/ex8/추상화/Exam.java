package ex8.추상화;

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
	
	public int total() {
		return kor+eng+math;
	}
	
	public int total(int ext) { //오버로드 함수
		return kor+eng+math;
	}
	
	//추상화 메소드(자식들 무조건 구현해야함)
	public abstract float avg();
}
