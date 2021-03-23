package ex3.array;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program3MultiArray3 {

	public static void main(String[] args) throws IOException {
		//��ü ��� + ����ȭ
		
		//���ڵ尳�� �˾ƺ���
		int count=0;
		{
			FileInputStream fis = new FileInputStream("res/jeju.csv");
			Scanner scan = new Scanner(fis);
			
			//���� ������
			scan.nextLine();
			
			String line;
			while(scan.hasNextLine()) {
				scan.nextLine();
				count++;
			}
		}
		//--------------------------------
		//2�����迭 ����
		String[][] lines = new String[count][];
		
		//��ü ���ڵ� �ε�
		{
			FileInputStream fis = new FileInputStream("res/jeju.csv");
			Scanner scan = new Scanner(fis);
			
			//���� ������
			scan.nextLine();
			
			String line;
			for(int i=0; i<count; i++) {
				line = scan.nextLine();
				lines[i] = line.split(",");
			}
		}
		//���
		{
			for(int j=0; j<count; j++) {
				for(int i=0; i<lines[j].length; i++) {
					if(i==0)
						System.out.printf("%s",lines[j][i]);
					else
						System.out.printf(",%s",lines[j][i]);
				}
				System.out.println();
			}
		}
		
		//���� �˻������ڼ� ���
		{
			int sum=0;
			for(int i=0; i<count; i++) {
				sum += Integer.parseInt(lines[i][3]);
			}
			System.out.printf("���� �˻������ڼ�:%d\n", sum);
			System.out.println("------------------");
		}
		
		//���帹�� �˻���� �� ���� ���
		{
			int max=0;
			String date="";
			int idx=0;
			for(int i=0; i<count; i++) {
				if(max<Integer.parseInt(lines[i][3])) {
					max = Integer.parseInt(lines[i][3]);
					date = lines[i][0];
				}
			}

			System.out.printf("��¥:%s\n",date);
			System.out.printf("���� ���� �˻� ��:%d\n",max);
		}
		
		//Ȯ���� ���� �þ ���ڿ� �þ �� ���
		{
			String date;
			int before = 0;
			int after;
			int dif;
			
			for(int i=0; i<count; i++) {
				after=Integer.parseInt(lines[i][1]);
				if(before!=after) {
					dif = after-before;
					
					date = lines[i][0];
					System.out.println("----------------------");
					System.out.printf("��¥:%s\n",date);
					System.out.printf("�߰� Ȯ���� ��:%d\n",dif);
					before=after;
				}
			}
		}
		
	}	
}


