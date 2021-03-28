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

	
	
	public static void main(String[] args) {
		//basic 활용
		int result = basic(2);
		System.out.printf("basic함수 리턴값:%d\n",result);
		
		//add 활용
		result = add(2,3);
		System.out.printf("add함수 리턴값:%d\n",result);
	}

}
