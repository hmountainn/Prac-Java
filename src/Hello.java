import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) throws IOException {
		//FileInputStream이용해서 입력받기
		
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
		
		//3.출력
		System.out.println("┌─────────────────┐");
		System.out.println("│     성적 출력      │");
		System.out.println("└─────────────────┘");
		System.out.printf("국어:%d\n", kor);
		System.out.printf("영어:%d\n", eng);
		System.out.printf("수학:%d\n", math);
		System.out.printf("총점:%d\n", total);
		System.out.printf("평균:%.1f\n ", avg);
	}

}
