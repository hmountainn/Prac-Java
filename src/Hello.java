import java.io.IOException;

public class Hello {

	public static void main(String[] args) throws IOException {
		//read 58�Է� -> 58�״�� ����ϱ�
		
		//read�� �ϳ��� �о��� (ab�Է��ϸ� a��)
		//0�Է��ϸ� �ƽ�Ű�ڵ尪 48�Էµ�
		System.out.print("������� �Է��ϼ���:");
	
		//58�Է��ϸ� 5�� �ν�
		int code1 = System.in.read();
		System.out.printf("code is %d\n", code1); //�ƽ�Ű�ڵ尪  53
		System.out.printf("code is %c\n", code1); //�Է°� ù��° 
		
		//8�� �ν�
		int code2 = System.in.read();
		System.out.printf("code is %d\n", code2); //�ƽ�Ű�ڵ尪 56
		System.out.printf("code is %c\n", code2); //�Է°� �ι�°
		
		int kor = (code1-48)*10+(code2-48); //�Է��� ������ ����
		System.out.printf("����� = %d", kor);
		
	}

}
