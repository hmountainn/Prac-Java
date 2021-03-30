package ex5.fnc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Program3MultiArray3 {
	//�Լ�ȭ �ϱ�
	
	//--------------------------------
	//���ڵ尳�� ���
	static int getCount() throws IOException {
		int localCount=0;
		FileInputStream fis = new FileInputStream("res/jeju.csv");
		Scanner scan = new Scanner(fis);
		
		//���� ������
		scan.nextLine();
		
		String line;
		while(scan.hasNextLine()) {
			scan.nextLine();
			localCount++;
		}
		return localCount;
	}
	
	//--------------------------------
	//��ü ���ڵ� �ε�
	static String[][] load(String[][] lines, int count) throws IOException {
		FileInputStream fis = new FileInputStream("res/jeju.csv");
		Scanner scan = new Scanner(fis);
		
		//���� ������
		scan.nextLine();
		
		String line;
		for(int i=0; i<count; i++) {
			line = scan.nextLine();
			lines[i] = line.split(",");
		}
		
		return lines;
	}
	
	//--------------------------------
	//��ü ���ڵ� ���
	static void printAll(String[][] lines, int count) {
		for(int j=0; j<count; j++) {
			for(int i=0; i<lines[j].length; i++) {
				if(i==0)
					System.out.printf("%s",lines[j][i]);
				else
					System.out.printf(",%s",lines[j][i]);
			}
			System.out.println();
		}
		System.out.println("------------------");
	}
	
	//--------------------------------
	//�����˻� ����� ���
	static int getCumulative(String[][] lines, int count) {
		int sum=0;
		for(int i=0; i<count; i++) {
			sum += Integer.parseInt(lines[i][3]);
		}
		return sum;
	}
	
	//--------------------------------
	//�����˻� ����� ���
	static void printCumulative(int sum) {
		System.out.printf("���� �˻������ڼ�:%d\n", sum);
		System.out.println("------------------");
	}
	
	//--------------------------------
	//�Ϻ� ���帹�� �˻���� �� ���� ���
	static void printMax(String[][] lines, int count) {
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

	
	public static void main(String[] args) throws IOException {
		
		//--------------------------------
		//���ڵ尳�� �˾ƺ���
		int count;
		count=getCount();
		
		//2�����迭 ����
		String[][] lines = new String[count][];
		
		//--------------------------------
		//��ü ���ڵ� �ε�
		lines = load(lines, count);
		
		//--------------------------------
		//��ü ���ڵ� ���
		printAll(lines, count);
		
		//--------------------------------
		//���� �˻������ڼ� ���
		int sum = getCumulative(lines, count);
		
		//--------------------------------
		//���� �˻������ڼ� ���
		printCumulative(sum);
		
		//--------------------------------
		//�Ϻ� ���帹�� �˻���� �� ���� ���
		printMax(lines, count);
		
//		//--------------------------------
//		//Ȯ���� ���� �þ ���ڿ� �þ �� ���
//		{
//			String date; //��¥
//			int before = 0; //���� Ȯ���� ��
//			int after; //���� Ȯ���� ��
//			int dif; //�þ Ȯ���� ��
//			
//			for(int i=0; i<count; i++) {
//				after=Integer.parseInt(lines[i][1]);
//				if(before!=after) { //Ȯ���ڼ� ������ ����������
//			
//					dif = after-before; //�þ ��
//					date = lines[i][0]; //��¥
//					
//					//���
//					System.out.println("----------------------");
//					System.out.printf("��¥:%s\n",date);
//					System.out.printf("�߰� Ȯ���� ��:%d\n",dif);
//					before=after;
//				}
//			}
//		}
//		
//		//--------------------------------
//		//�þ Ȯ���� ���� ��¥ 2���� �����迭�� ���	
//		//�����迭
//		String [][] results;
//		int resultcount=0; //Ȯ���� �� �þ Ƚ��
//		{	
//			//resultcount����
//			int before = 0;
//			int after;
//			for(int i=0; i<count; i++) {
//				after=Integer.parseInt(lines[i][1]);
//				if(before!=after) {
//					resultcount++;
//					before=after;
//				}
//			}
//			//�迭 ũ�� ����
//			results = new String[resultcount][];
//			
//			//�ӽù迭 ����
//			String[] row = new String[2];
//
//			int dif;
//			String date;
//			int idx=0;
//			before = 0;
//			
//			for(int i=0; i<count; i++) {
//				after=Integer.parseInt(lines[i][1]);
//				if(before!=after) {
//					
//					dif = after-before;
//					date = lines[i][0];
//					before=after;
//					
//					//�ӽù迭�� ���
//					row[0] = date;
//					row[1] = String.valueOf(dif);
//					
//					//�����迭�� ���
//					results[idx] = row;
//				
//					//���
//					System.out.println(Arrays.toString(results[idx]));
//					idx++;
//				}
//			}
//			
//			
//		}

		
	}
}



