package ex3.array;

public class Program2 {

	public static void main(String[] args) {
		//�迭 �� �ݺ��� ����
		
		//1. ���� 10���� �����ϱ����� �迭chs ����
		char[] chs = new char[10];
		
		//2.chs �迭�� 'A'�� ä���
		for(int i=0; i<10; i++)
			chs[i] = 'A';
		
		//3.chs �迭�� ����� �� ��� ���
		for(int i=0; i<10; i++)
			System.out.printf("%c ",chs[i]);
		
		System.out.println();
		
		//4.J���� A���� �迭�� ä���
		for(int i=0; i<10; i++)
			chs[i] = (char) ('J'-i);
		
		//5.����������
		char temp;
		for(int i=0; i<5; i++) {
			temp = chs[9-i];
			chs[9-i] = chs[i];
			chs[i] = temp;
		}
		//6.���
		for(int i=0; i<10; i++)
			System.out.printf("%c ",chs[i]);
	}

}
