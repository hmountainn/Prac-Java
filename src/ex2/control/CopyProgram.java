package ex2.control;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyProgram {

	public static void main(String[] args) throws IOException {
		//��Ʈ�� �̹��� ���� �����ϱ�(while�� ��� ����)
		
		//1. FileInputStream��ü ���� �� ���� �б�
		FileInputStream fis= new FileInputStream("res/soldier.bmp");
		
		//2. FileOutputStream��ü ���� �� ������Ʈ ���������� ����
		FileOutputStream fos = new FileOutputStream("res/soldier_copy.bmp");
		
		//3. read()�� ����Ʈ �о ����b�� ���
		//4. 3���� �� �̻� �о���� ���� ���� ������ �ݺ�
		//5. write()�� ���� ����Ʈ �ٿ��ֱ�
		int b = 0;
		while( (b=fis.read()) != -1)
			fos.write(b);
		
		//6. ��� ��Ʈ�� ��ü �ݱ�
		fis.close();
		fos.close();

		System.out.println("Copy end~~"); 
	}

}
