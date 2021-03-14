package ex1.bit;

import java.io.FileInputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		//비트맵 이미지읽고 크기출력
		
		// 1.FileInputStream으로 비트맵 읽기
		FileInputStream fis = new FileInputStream("res/soldier.bmp");
		
		// 2.시그니처 코드 버리기
		fis.read();
		fis.read();
		
		// 3.FileSize코드 읽기
		int b1 = fis.read();
		int b2 = fis.read();
		int b3 = fis.read();
		int b4 = fis.read();
		
		fis.close();
		
		// 4.변수한개에 넣기 [b4][b3][b2][b1]
		
		//[?][?][?][b4] -> [ ][ ][ ][b4] 이렇게 깨끗하게 만들어줘야함
		//[0000][0000][0000][1111] &
		//[1001][1011][1000][1011] 
	    //=> [0000][0000][0000][1011]
		
		int FileSize = (b4&0x000000ff) << 8*3 | //[b4][][][]
					   (b3&0x000000ff) << 8*2 | //[][b3][][]
					   (b2&0x000000ff) << 8 |   //[][][b2][]
					   (b1&0x000000ff);			//[][][][b1]
		
		System.out.printf("파일크기:%d",FileSize);

	
	}

}
