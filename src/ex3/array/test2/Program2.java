package ex3.array.test2;

public class Program2 {

	public static void main(String[] args) {
		//���ڿ� ���ϱ�( equals() vs == )
		String n1 = "ȫ�浿";
		String n2 = "ȫ�浿";
		String n3 = new String("ȫ�浿");
		String n4 = new String("ȫ�浿");
		
		System.out.println(n1 == n2); //true => ������ü
		System.out.println(n1.equals(n2)); //true
		System.out.println(n3 == n4); //false => ��ü�� ���ϱ� ����(���δٸ���ü)
		System.out.println(n3.equals(n4)); //true => ���ڿ� ��ü�� ��

	}

}
