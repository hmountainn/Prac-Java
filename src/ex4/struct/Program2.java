package ex4.struct;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws IOException {
		//���Ͽ��� �����͸� Covid192��ü�� ���� �� �ε��ؼ� ��� + ����ü�� ����
		
		//���ڵ� ���� �˾Ƴ���
		int count = 0;
		{
			FileInputStream fis = new FileInputStream("res/jeju.csv");
			Scanner scan = new Scanner(fis);
			
			//���� ������
			scan.nextLine();
			
			while(scan.hasNextLine()) {
				scan.nextLine();
				count++;
			}
			
			scan.close();
			fis.close();
		}

		//----------------------------
		//Covid192��ü list�迭�� �ε�
		Covid192[] list = new Covid192[count];
		{
			FileInputStream fis = new FileInputStream("res/jeju.csv");
			Scanner scan = new Scanner(fis);
			
			//���� ������
			scan.nextLine();
			
			//�ӽù迭
			String[] lines;
			String line;
			
			for(int i=0; i<count; i++) {
				line = scan.nextLine();
				lines = line.split(",");
				
				//Covid192�� ������ �ε��ϱ�
				Covid192 covid = new Covid192();
				covid.date = lines[0]; //��������
				covid.cases = Integer.parseInt(lines[1]); //Ȯ����
				covid.deaths = Integer.parseInt(lines[2]); //�����
				covid.tests = Integer.parseInt(lines[3]); //�˻������ڼ�
				covid.selfIsolation = Integer.parseInt(lines[4]); //�ڰ��ݸ���
				covid.release = Integer.parseInt(lines[5]); //�ڰ��ݸ� ����
				covid.recover = Integer.parseInt(lines[6]); //����(�ݸ�����)
				covid.selfQuarantineDomestic = Integer.parseInt(lines[7]); //�ڰ��ݸ�(Ȯ���� ����)
				covid.selfQuarantineImported = Integer.parseInt(lines[8]); //�ڰ��ݸ�(�ؿ��Ա�)
				covid.pubDate = lines[9]; //������ ��������
				
				//�迭�� ���
				list[i] = covid;
			
			}
			scan.close();
			fis.close();
		}
		//----------------------------
		//���
		//Covid192��ü�� �ٽ� �־ ���
		for(int i=0; i<count; i++) {
		Covid192 covid = list[i];
		
			System.out.printf("%s,%d,%d,%d,%d,%d,%d,%d,%d,%s\n",
								covid.date,
								covid.cases,
								covid.deaths,
								covid.tests,
								covid.selfIsolation,
								covid.release,
								covid.recover,
								covid.selfQuarantineDomestic,
								covid.selfQuarantineImported,
								covid.pubDate
								);
		}
	}

}
