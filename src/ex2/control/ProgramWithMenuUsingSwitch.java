package ex2.control;

import java.util.Scanner;

public class ProgramWithMenuUsingSwitch {

	public static void main(String[] args) {
		//swich�� Ȱ��: ���� �Է����α׷� MENU����
		
		//��������
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total; 
		double avg;
		
		int choice;
		Scanner scan = new Scanner(System.in);

		//�ݺ�
		boolean again = true;
		EXIT: //����� Ż��
		while(again) {
			
			//�޴�
			System.out.println("����������������������������������������������");
			System.out.println("��       ���� �޴�        ��");
			System.out.println("����������������������������������������������");
			
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.����");
			System.out.print("����>");
			choice = scan.nextInt();
			
			switch(choice) {
				
			case 1:  //���� choice�� 1�̸�
				//���� �Է�
				System.out.println("����������������������������������������������");
				System.out.println("��       ���� �Է�        ��");
				System.out.println("����������������������������������������������");
				
				System.out.print("���� ����:");
				kor = scan.nextInt();
				System.out.print("���� ����:");
				eng = scan.nextInt();
				System.out.print("���� ����:");
				math = scan.nextInt();
				break;
			

			case 2: //���� choice�� 2�̸�
				total = kor + eng + math;
				avg = total/3.0f;
				
				//���� ���
				System.out.println("����������������������������������������������");
				System.out.println("��       ���� ���        ��");
				System.out.println("����������������������������������������������");
				
				System.out.printf("���� ����:%d\n",kor);
				System.out.printf("���� ����:%d\n",eng);
				System.out.printf("���� ����:%d\n",math);
				System.out.printf("����:%d\n",total);
				System.out.printf("���:%.1f\n",avg);
				break;
			
			
			case 3: //���� choice�� 3�̸�
				//����
				System.out.println("�ý��� ����.");
				break EXIT; //EXIT�� break
				
			}
		}
	}

}
