package ex2.control;

import java.util.Scanner;

public class ProgramWithMenuUsingSwitch2 {

	public static void main(String[] args) {
		//do-while문 활용: 성적 입력프로그램 MENU구현 + 입력가능범위 설정
		
		//변수설정
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total; 
		double avg;
		
		int choice;
		Scanner scan = new Scanner(System.in);

		//반복
		boolean again = true;
		EXIT: //여기로 탈출
		while(again) {
			
			//메뉴
			System.out.println("┌─────────────────────┐");
			System.out.println("│       메인 메뉴        │");
			System.out.println("└─────────────────────┘");
			
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.종료");
			System.out.print("선택>");
			choice = scan.nextInt();
			
			switch(choice) {
				
			case 1:  //만약 choice가 1이면
				//성적 입력
				System.out.println("┌─────────────────────┐");
				System.out.println("│       성적 입력        │");
				System.out.println("└─────────────────────┘");
				
				do { //범위 검사
					System.out.print("국어 성적:");
					kor = scan.nextInt();
					if(kor<0 || kor>100)
						System.out.println("0~100의 범위만 입력가능합니다");
				}
				while(kor<0 || kor>100);
				
				do {
					System.out.print("영어 성적:");
					eng = scan.nextInt();
					if(eng<0 || eng>100)
						System.out.println("0~100의 범위만 입력가능합니다");
				}
				while(eng<0 || eng>100);
				
				do { //범위 검사
					System.out.print("수학 성적:");
					math = scan.nextInt();
					if(math<0 || math>100)
						System.out.println("0~100의 범위만 입력가능합니다");
				}
				while(math<0 || math>100);
				
				break;
			

			case 2: //만약 choice가 2이면
				total = kor + eng + math;
				avg = total/3.0f;
				
				//성적 출력
				System.out.println("┌─────────────────────┐");
				System.out.println("│       성적 출력        │");
				System.out.println("└─────────────────────┘");
				
				System.out.printf("국어 성적:%d\n",kor);
				System.out.printf("영어 성적:%d\n",eng);
				System.out.printf("수학 성적:%d\n",math);
				System.out.printf("총점:%d\n",total);
				System.out.printf("평균:%.1f\n",avg);
				break;
			
			
			case 3: //만약 choice가 3이면
				//종료
				System.out.println("시스템 종료.");
				break EXIT; //EXIT로 break
				
			}
		}
	}

}
