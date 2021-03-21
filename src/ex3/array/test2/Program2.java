package ex3.array.test2;

public class Program2 {

	public static void main(String[] args) {
		//문자열 비교하기( equals() vs == )
		String n1 = "홍길동";
		String n2 = "홍길동";
		String n3 = new String("홍길동");
		String n4 = new String("홍길동");
		
		System.out.println(n1 == n2); //true => 같은객체
		System.out.println(n1.equals(n2)); //true
		System.out.println(n3 == n4); //false => 객체를 비교하기 때문(서로다른객체)
		System.out.println(n3.equals(n4)); //true => 문자열 자체를 비교

	}

}
