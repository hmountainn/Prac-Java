package ex2.control;

import java.util.Scanner;

public class ProgramWithMenu {

	public static void main(String[] args) {
		//if문과 while문 활용: 성적 입력프로그램 MENU구현
		
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
			
			
			if(choice==1) { //만약 choice가 1이면
				//성적 입력
				System.out.println("┌─────────────────────┐");
				System.out.println("│       성적 입력        │");
				System.out.println("└─────────────────────┘");
				
				System.out.print("국어 성적:");
				kor = scan.nextInt();
				System.out.print("영어 성적:");
				eng = scan.nextInt();
				System.out.print("수학 성적:");
				math = scan.nextInt();
			}
			
			
			else if(choice==2) { //만약 choice가 2이면
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
			}
			
			
			else if(choice==3) { //만약 choice가 3이면
				//종료
				System.out.println("시스템 종료.");
				again=false;
				
			}
		}
	}

}
