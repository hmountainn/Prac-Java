package ex1.bit;

import java.io.FileInputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		//��Ʈ�� �̹����а� ũ�����
		
		// 1.FileInputStream���� ��Ʈ�� �б�
		FileInputStream fis = new FileInputStream("res/soldier.bmp");
		
		// 2.�ñ״�ó �ڵ� ������
		fis.read();
		fis.read();
		
		// 3.FileSize�ڵ� �б�
		int b1 = fis.read();
		int b2 = fis.read();
		int b3 = fis.read();
		int b4 = fis.read();
		
		fis.close();
		
		// 4.�����Ѱ��� �ֱ� [b4][b3][b2][b1]
		
		//[?][?][?][b4] -> [ ][ ][ ][b4] �̷��� �����ϰ� ����������
		//[0000][0000][0000][1111] &
		//[1001][1011][1000][1011] 
	    //=> [0000][0000][0000][1011]
		
		int FileSize = (b4&0x000000ff) << 8*3 | //[b4][][][]
					   (b3&0x000000ff) << 8*2 | //[][b3][][]
					   (b2&0x000000ff) << 8 |   //[][][b2][]
					   (b1&0x000000ff);			//[][][][b1]
		
		System.out.printf("����ũ��:%d",FileSize);

	
	}

}
