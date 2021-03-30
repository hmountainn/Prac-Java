package ex5.fnc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Program3MultiArray3 {
	//함수화 하기
	
	//--------------------------------
	//레코드개수 얻기
	static int getCount() throws IOException {
		int localCount=0;
		FileInputStream fis = new FileInputStream("res/jeju.csv");
		Scanner scan = new Scanner(fis);
		
		//제목 버리기
		scan.nextLine();
		
		String line;
		while(scan.hasNextLine()) {
			scan.nextLine();
			localCount++;
		}
		return localCount;
	}
	
	//--------------------------------
	//전체 레코드 로드
	static String[][] load(String[][] lines, int count) throws IOException {
		FileInputStream fis = new FileInputStream("res/jeju.csv");
		Scanner scan = new Scanner(fis);
		
		//제목 버리기
		scan.nextLine();
		
		String line;
		for(int i=0; i<count; i++) {
			line = scan.nextLine();
			lines[i] = line.split(",");
		}
		
		return lines;
	}
	
	//--------------------------------
	//전체 레코드 출력
	static void printAll(String[][] lines, int count) {
		for(int j=0; j<count; j++) {
			for(int i=0; i<lines[j].length; i++) {
				if(i==0)
					System.out.printf("%s",lines[j][i]);
				else
					System.out.printf(",%s",lines[j][i]);
			}
			System.out.println();
		}
		System.out.println("------------------");
	}
	
	//--------------------------------
	//누적검사 진행수 얻기
	static int getCumulative(String[][] lines, int count) {
		int sum=0;
		for(int i=0; i<count; i++) {
			sum += Integer.parseInt(lines[i][3]);
		}
		return sum;
	}
	
	//--------------------------------
	//누적검사 진행수 출력
	static void printCumulative(int sum) {
		System.out.printf("누적 검사진행자수:%d\n", sum);
		System.out.println("------------------");
	}
	
	//--------------------------------
	//일별 가장많은 검사수와 그 일자 출력
	static void printMax(String[][] lines, int count) {
		int max=0;
		String date="";
		int idx=0;
		for(int i=0; i<count; i++) {
			if(max<Integer.parseInt(lines[i][3])) {
				max = Integer.parseInt(lines[i][3]);
				date = lines[i][0];
			}
		}
		System.out.printf("날짜:%s\n",date);
		System.out.printf("가장 많은 검사 수:%d\n",max);
	}

	
	public static void main(String[] args) throws IOException {
		
		//--------------------------------
		//레코드개수 알아보기
		int count;
		count=getCount();
		
		//2차원배열 생성
		String[][] lines = new String[count][];
		
		//--------------------------------
		//전체 레코드 로드
		lines = load(lines, count);
		
		//--------------------------------
		//전체 레코드 출력
		printAll(lines, count);
		
		//--------------------------------
		//누적 검사진행자수 출력
		int sum = getCumulative(lines, count);
		
		//--------------------------------
		//누적 검사진행자수 출력
		printCumulative(sum);
		
		//--------------------------------
		//일별 가장많은 검사수와 그 일자 출력
		printMax(lines, count);
		
//		//--------------------------------
//		//확진자 수가 늘어난 일자와 늘어난 수 출력
//		{
//			String date; //날짜
//			int before = 0; //이전 확진자 수
//			int after; //현재 확진자 수
//			int dif; //늘어난 확진자 수
//			
//			for(int i=0; i<count; i++) {
//				after=Integer.parseInt(lines[i][1]);
//				if(before!=after) { //확진자수 이전과 같지않으면
//			
//					dif = after-before; //늘어난 수
//					date = lines[i][0]; //날짜
//					
//					//출력
//					System.out.println("----------------------");
//					System.out.printf("날짜:%s\n",date);
//					System.out.printf("추가 확진자 수:%d\n",dif);
//					before=after;
//				}
//			}
//		}
//		
//		//--------------------------------
//		//늘어난 확진자 수와 날짜 2차원 전역배열에 담기	
//		//전역배열
//		String [][] results;
//		int resultcount=0; //확진자 수 늘어난 횟수
//		{	
//			//resultcount설정
//			int before = 0;
//			int after;
//			for(int i=0; i<count; i++) {
//				after=Integer.parseInt(lines[i][1]);
//				if(before!=after) {
//					resultcount++;
//					before=after;
//				}
//			}
//			//배열 크기 설정
//			results = new String[resultcount][];
//			
//			//임시배열 선언
//			String[] row = new String[2];
//
//			int dif;
//			String date;
//			int idx=0;
//			before = 0;
//			
//			for(int i=0; i<count; i++) {
//				after=Integer.parseInt(lines[i][1]);
//				if(before!=after) {
//					
//					dif = after-before;
//					date = lines[i][0];
//					before=after;
//					
//					//임시배열에 담기
//					row[0] = date;
//					row[1] = String.valueOf(dif);
//					
//					//전역배열에 담기
//					results[idx] = row;
//				
//					//출력
//					System.out.println(Arrays.toString(results[idx]));
//					idx++;
//				}
//			}
//			
//			
//		}

		
	}
}



