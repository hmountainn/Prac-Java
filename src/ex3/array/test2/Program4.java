package ex3.array.test2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) throws IOException {
		//파일의 데이터 읽어와서 원하는 정보 얻어내기
		//누적 검사진행자 수 구하기
		
		//파일 읽어오기
		FileInputStream fis = new FileInputStream("res/jeju.csv");
		Scanner scan = new Scanner(fis);
		
		//맨윗줄 버리기
		scan.nextLine();
		
		//배열생성
		String line;
		String[][] lines = new String[76][];
		
		//데이터 레코드수 구하기
		int count=0;
		while(scan.hasNextLine()) {
			line = scan.nextLine();
			lines[count++] = line.split(","); 
		}
		
		//날짜별 누적 검사진행자수 출력
		int sum = 0;
		for(int i = 0; i<count; i++) {
			sum = sum + Integer.parseInt(lines[i][3]);
			System.out.println("------------------------");
			System.out.printf("날짜:%s\n", lines[i][0]);
			System.out.printf("누적 검사진행자수:%d\n", sum);
		}
		
		scan.close();
		fis.close();

	}

}
