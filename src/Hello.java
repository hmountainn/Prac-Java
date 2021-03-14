import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) throws IOException {
		//FileInputStream이용해서 입력받기
		//FileOutputStream이용해서 파일에 출력하기
		
		//1.변수 설정
		int kor, eng, math, total;
		double avg;
		
		//2.FileInputStream으로 파일에서 입력받기
		FileInputStream fis = new FileInputStream("C:\\Korweb\\2021-02\\workspace\\Prac JavaPrj\\data.txt");
		Scanner scan = new Scanner(fis);
		kor = scan.nextInt();
		eng = scan.nextInt();
		math = scan.nextInt();
		
		scan.close();
		fis.close();
		
		total = kor + eng + math;
		avg = total/3.0f;
		
		//3.FileOutputStream으로 파일에 출력
		FileOutputStream fos = new FileOutputStream("C:\\Korweb\\2021-02\\workspace\\Prac JavaPrj\\data.txt");
		PrintStream fout = new PrintStream(fos);
		
		fout.printf("총점:%d\n",total);
		fout.printf("평균:%.1f", avg);
		
		fout.close();
		fos.close();
	}

}
