package ex5.fnc;

public class Program { //�Լ� ���� �� Ȱ��
	//�⺻ ��� �Լ�
	static int basic(int x){
		return (x+3)*(x+3);
	}
	
	//���ϱ� �Լ�
	static int add(int x,int y) {
		return x+y;
	}
	
	//��� �Լ�(���ϰ�x)
	static void print(String x) {
		System.out.println(x);
	}
	
	//x���� length��ŭ ���ϱ�
	static void printSum(int x, int length) {
		//length�� �����϶�
		if(length<=0) {
			System.out.println("length�� �߸��� ���� �Է��߽��ϴ�");
			return;
		}
		
		//sum����
		int sum=0;
		for(int i=0; i<length; i++) {
			sum +=x+i;
			System.out.printf("%d",x+i);
			if(i<length-1)
				System.out.print("+");	
		}
		System.out.print("=");
		System.out.print(sum);
		
	}


	
	
	public static void main(String[] args) {
		//basic Ȱ��
		int result = basic(2);
		System.out.printf("basic�Լ� ���ϰ�:%d\n",result);
		
		//add Ȱ��
		result = add(2,3);
		System.out.printf("add�Լ� ���ϰ�:%d\n",result);
	
		//print Ȱ��
		print("����Ʈ");
		
		//printSum Ȱ��
		printSum(2,3);
		
	}

}
