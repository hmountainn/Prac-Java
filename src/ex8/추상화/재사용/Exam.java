package ex8.�߻�ȭ.����;

public abstract class Exam { //�߻�ȭ Ŭ����
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
	
	public int total(int ext) { //�����ε� �Լ�
		return kor+eng+math;
	}
	
	//�߻�ȭ �޼ҵ�(�ڽĵ� ������ �����ؾ���)
	public abstract float avg();

	
	//setter �� getter
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
