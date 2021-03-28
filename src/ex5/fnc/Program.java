package ex5.fnc;

public class Program { //함수 정의 및 활용
	//기본 계산 함수
	static int basic(int x){
		return (x+3)*(x+3);
	}

	public static void main(String[] args) {
		//basic 활용
		int result = basic(2);
		System.out.printf("basic함수 리턴값:%d",result);

	}

}
