import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) throws IOException {
		//FileInputStream�̿��ؼ� �Է¹ޱ�
		//FileOutputStream�̿��ؼ� ���Ͽ� ����ϱ�
		
		//1.���� ����
		int kor, eng, math, total;
		double avg;
		
		//2.FileInputStream���� ���Ͽ��� �Է¹ޱ�
		FileInputStream fis = new FileInputStream("C:\\Korweb\\2021-02\\workspace\\Prac JavaPrj\\data.txt");
		Scanner scan = new Scanner(fis);
		kor = scan.nextInt();
		eng = scan.nextInt();
		math = scan.nextInt();
		
		scan.close();
		fis.close();
		
		total = kor + eng + math;
		avg = total/3.0f;
		
		//3.FileOutputStream���� ���Ͽ� ���
		FileOutputStream fos = new FileOutputStream("C:\\Korweb\\2021-02\\workspace\\Prac JavaPrj\\data.txt");
		PrintStream fout = new PrintStream(fos);
		
		fout.printf("����:%d\n",total);
		fout.printf("���:%.1f", avg);
		
		fout.close();
		fos.close();
	}

}
