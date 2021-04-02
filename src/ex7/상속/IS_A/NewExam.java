package ex7.상속.IS_A;

public class NewExam extends Exam{
	//상속 받아 com과목 추가하기
	private int com;
	
	public NewExam() {
		super(20,20,20); //Exam 오버로드 생성자 호출
		com = 10;
	}
	
	//오버라이드해서 com추가
	@Override
	public int total() {
		return super.total()+com;
	}
	//오버라이드해서 평균 수정
	@Override
	public float avg() {
		return this.total()/4.0f;
	}
}
