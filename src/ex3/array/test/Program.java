package ex3.array.test;

public class Program {

	public static void main(String[] args) {
		//�迭�� ��ȯ�� (1,2,3,1,2,3,1,2,3,1) �ְ� ���
		
		//1.���� 10��¥�� nums �迭 ����
		int[] nums = new int[10];
		
		//2.nums�� ��ȯ�� ä���
		for(int i = 0; i<10; i++)
			nums[i] = i%3 + 1;
		
		//3.nums ���
		//��¸�� 1,2,3, ... 1
		for(int i=0; i<10; i++)
			if(i<9)
				System.out.printf("%d,", nums[i]);
			else
				System.out.printf("%d", nums[i]);
	}

}
