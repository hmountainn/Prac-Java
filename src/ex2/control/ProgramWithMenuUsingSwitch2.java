package ex2.control;

import java.util.Scanner;

public class ProgramWithMenuUsingSwitch2 {

	public static void main(String[] args) {
		//do-while�� Ȱ��: ���� �Է����α׷� MENU���� + �Է°��ɹ��� ����
		
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
				
				do { //���� �˻�
					System.out.print("���� ����:");
					kor = scan.nextInt();
					if(kor<0 || kor>100)
						System.out.println("0~100�� ������ �Է°����մϴ�");
				}
				while(kor<0 || kor>100);
				
				do {
					System.out.print("���� ����:");
					eng = scan.nextInt();
					if(eng<0 || eng>100)
						System.out.println("0~100�� ������ �Է°����մϴ�");
				}
				while(eng<0 || eng>100);
				
				do { //���� �˻�
					System.out.print("���� ����:");
					math = scan.nextInt();
					if(math<0 || math>100)
						System.out.println("0~100�� ������ �Է°����մϴ�");
				}
				while(math<0 || math>100);
				
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
