import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) throws IOException {
		//FileInputStream�̿��ؼ� �Է¹ޱ�
		
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
		
		//3.���
		System.out.println("��������������������������������������");
		System.out.println("��     ���� ���      ��");
		System.out.println("��������������������������������������");
		System.out.printf("����:%d\n", kor);
		System.out.printf("����:%d\n", eng);
		System.out.printf("����:%d\n", math);
		System.out.printf("����:%d\n", total);
		System.out.printf("���:%.1f\n ", avg);
	}

}
