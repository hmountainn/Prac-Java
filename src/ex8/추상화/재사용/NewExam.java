package ex8.�߻�ȭ.����;

public class NewExam extends Exam{
	//��� �޾� com���� �߰��ϱ�
	private int com;
	
	public NewExam() {
		this(10,10,10,10); //�ߺ�����
	}
	
	//�����ε� ������
	public NewExam(int kor, int eng, int math, int com) {
		super(kor, eng, math); //Exam�����ε� ������ ȣ��
		this.com = com;
	}
	
	//�������̵��ؼ� com�߰�
	@Override
	public int total() {
		return super.total()+com;
	}
	//�������̵��ؼ� ��� ����
	//�߻�ȭ �޼ҵ�
	@Override
	public float avg() {
		return this.total()/4.0f;
	}
}
