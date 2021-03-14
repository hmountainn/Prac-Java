import java.io.IOException;

public class Hello {

	public static void main(String[] args) throws IOException {
		//read 58입력 -> 58그대로 출력하기
		
		//read는 하나만 읽어짐 (ab입력하면 a만)
		//0입력하면 아스키코드값 48입력됨
		System.out.print("국어성적을 입력하세요:");
	
		//58입력하면 5만 인식
		int code1 = System.in.read();
		System.out.printf("code is %d\n", code1); //아스키코드값  53
		System.out.printf("code is %c\n", code1); //입력값 첫번째 
		
		//8만 인식
		int code2 = System.in.read();
		System.out.printf("code is %d\n", code2); //아스키코드값 56
		System.out.printf("code is %c\n", code2); //입력값 두번째
		
		int kor = (code1-48)*10+(code2-48); //입력한 값으로 조합
		System.out.printf("국어성적 = %d", kor);
		
	}

}
