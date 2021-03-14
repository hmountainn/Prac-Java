package ex2.control;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyProgram {

	public static void main(String[] args) throws IOException {
		//비트맵 이미지 파일 복사하기(while문 사용 예제)
		
		//1. FileInputStream객체 생성 후 파일 읽기
		FileInputStream fis= new FileInputStream("res/soldier.bmp");
		
		//2. FileOutputStream객체 생성 후 읽은비트 복사할파일 선택
		FileOutputStream fos = new FileOutputStream("res/soldier_copy.bmp");
		
		//3. read()로 바이트 읽어서 변수b에 담기
		//4. 3번을 더 이상 읽어들일 값이 없을 때까지 반복
		//5. write()로 읽은 바이트 붙여넣기
		int b = 0;
		while( (b=fis.read()) != -1)
			fos.write(b);
		
		//6. 모든 스트림 객체 닫기
		fis.close();
		fos.close();

		System.out.println("Copy end~~"); 
	}

}
