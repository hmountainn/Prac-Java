package ex5.fnc;

public class Program { //함수 정의 및 활용
	//기본 계산 함수
	static int basic(int x){
		return (x+3)*(x+3);
	}
	
	//더하기 함수
	static int add(int x,int y) {
		return x+y;
	}
	
	//출력 함수(리턴값x)
	static void print(String x) {
		System.out.println(x);
	}
	
	//x부터 length만큼 더하기
	static void printSum(int x, int length) {
		//length가 음수일때
		if(length<=0) {
			System.out.println("length에 잘못된 값을 입력했습니다");
			return;
		}
		
		//sum연산
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
		//basic 활용
		int result = basic(2);
		System.out.printf("basic함수 리턴값:%d\n",result);
		
		//add 활용
		result = add(2,3);
		System.out.printf("add함수 리턴값:%d\n",result);
	
		//print 활용
		print("프린트");
		
		//printSum 활용
		printSum(2,3);
		
	}

}
