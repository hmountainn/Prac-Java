
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
		
		//2. printf()�� ���������ؼ� ���
		System.out.println("��������������������������������������");
		System.out.println("��     ���� ���      ��");
		System.out.println("��������������������������������������");
		System.out.printf("����:%d\n", kor);
		System.out.printf("����:%d\n", eng);
		System.out.printf("����:%d\n", math);
		System.out.printf("����:%d\n", total);
		System.out.printf("���:%.1f\n ", avg);

	}

}
