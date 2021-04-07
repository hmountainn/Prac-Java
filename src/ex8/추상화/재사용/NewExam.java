package ex8.추상화.재사용;

public class NewExam extends Exam{
	//상속 받아 com과목 추가하기
	private int com;
	
	public NewExam() {
		this(10,10,10,10); //중복제거
	}
	
	//오버로드 생성자
	public NewExam(int kor, int eng, int math, int com) {
		super(kor, eng, math); //Exam오버로드 생성자 호출
		this.com = com;
	}
	
	//오버라이드해서 com추가
	@Override
	public int total() {
		return super.total()+com;
	}
	//오버라이드해서 평균 수정
	//추상화 메소드
	@Override
	public float avg() {
		return this.total()/4.0f;
	}
}
