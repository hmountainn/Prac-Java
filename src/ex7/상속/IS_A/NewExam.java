package ex7.���.IS_A;

public class NewExam extends Exam{
	//��� �޾� com���� �߰��ϱ�
	private int com;
	
	public NewExam() {
		super(20,20,20); //Exam �����ε� ������ ȣ��
		com = 10;
	}
	
	//�������̵��ؼ� com�߰�
	@Override
	public int total() {
		return super.total()+com;
	}
	//�������̵��ؼ� ��� ����
	@Override
	public float avg() {
		return this.total()/4.0f;
	}
}
