
public class Hello {

	public static void main(String[] args) {
		//�ܼ� ����ϱ�
		//1.���� ����
		int kor, eng, math, total;
		double avg;
		
		kor = 60;
		eng = 40;
		math = 50;
		
		total = kor + eng + math;
		avg = total/3;
		
		//2. print()�̿����
		System.out.print("��������������������������������������\n");
		System.out.print("��     ���� ���      ��\n");
		System.out.print("��������������������������������������\n");
		System.out.print("����: "+ kor+"\n");
		System.out.print("����: "+ eng+"\n");
		System.out.print("����: "+ math+"\n");
		System.out.print("����: "+ total+"\n");
		System.out.print("���: "+ avg+"\n");

	}

}
