package ex5.fnc;

public class Program {
	//함수 정의하기
	static int power(int x) {
		return (x+3)*(x+3);
	}
	
	static int add(int x, int y)
	{
		return(x+y);
	}
	
	static void print(int x) {
		System.out.println(x); 
	}
	
	
	//선생님이 한거
	static void printSum(int x, int length) {

		
		if(length <= 0) {
			System.out.println("length에 잘못된 값을 입력했습니다");
			return;
		}

		int sum=0;
		
		for(int i=0; i<length; i++)
			sum+= x+i;
		
		for(int i=0; i<length; i++) {
			System.out.printf("%d", x+i);
			
			if(i<length-1)
				System.out.printf("+");
		}
		
		System.out.print("=");
		System.out.printf("%d\n", sum);
	}
	
	
//	//내가한거
//	static void printSum(int x, int length) {
//	
//		if(length <= 0) {
//			System.out.println("length에 잘못된 값을 입력했습니다");
//			return;
//		}
//	
//		int sum=0;
//		for(int i=0; i<length; i++) {
//			sum = sum+x;
//			
//			if(i==0)
//				System.out.printf("%d",x);
//			else
//				System.out.printf("+%d",x);
//			x++;
//		}
//		System.out.printf("=%d",sum);
//	}
	
	public static void main(String[] args) {
		//power(x) = (x+3)*(x+3)
		//add(x,y) = x+y
		
		int po = power(3);
		int ad = add(3,4);
		
		System.out.println(po);
		System.out.println(ad);
		
		// print(x) = output: x;
		print(30);
		
		//printSum(x,length)  //x:2, length: 3 -> 2+3+4
		printSum(2,5);
	}

}
