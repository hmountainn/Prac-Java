import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		//�ܼ��Է°� ���
		
		//1.���� ����
		int kor, eng, math, total;
		double avg;
		
		
		//2. Scanner�̿��ؼ� �Է¹ޱ�
		Scanner scan = new Scanner(System.in);
		System.out.println("��������������������������������������");
		System.out.println("��     ���� �Է�      ��");
		System.out.println("��������������������������������������");
		
		System.out.print("����� �Է�:");
		kor = scan.nextInt();
		
		System.out.print("����� �Է�:");
		eng = scan.nextInt();
		
		System.out.print("���м��� �Է�:");
		math = scan.nextInt();
		
		total = kor + eng + math;
		avg = total/3.0f;
		
		//3.���
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
