package ex4.struct;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws IOException {
		//파일에서 데이터를 Covid192객체에 넣은 후 로드해서 출력 + 구조체별 구분
		
		//레코드 개수 알아내기
		int count = 0;
		{
			FileInputStream fis = new FileInputStream("res/jeju.csv");
			Scanner scan = new Scanner(fis);
			
			//제목 버리기
			scan.nextLine();
			
			while(scan.hasNextLine()) {
				scan.nextLine();
				count++;
			}
			
			scan.close();
			fis.close();
		}

		//----------------------------
		//Covid192객체 list배열에 로드
		Covid192[] list = new Covid192[count];
		{
			FileInputStream fis = new FileInputStream("res/jeju.csv");
			Scanner scan = new Scanner(fis);
			
			//제목 버리기
			scan.nextLine();
			
			//임시배열
			String[] lines;
			String line;
			
			for(int i=0; i<count; i++) {
				line = scan.nextLine();
				lines = line.split(",");
				
				//Covid192에 데이터 로드하기
				Covid192 covid = new Covid192();
				covid.date = lines[0]; //기준일자
				covid.cases = Integer.parseInt(lines[1]); //확진자
				covid.deaths = Integer.parseInt(lines[2]); //사망자
				covid.tests = Integer.parseInt(lines[3]); //검사진행자수
				covid.selfIsolation = Integer.parseInt(lines[4]); //자가격리중
				covid.release = Integer.parseInt(lines[5]); //자가격리 해제
				covid.recover = Integer.parseInt(lines[6]); //완지(격리해제)
				covid.selfQuarantineDomestic = Integer.parseInt(lines[7]); //자가격리(확진자 접촉)
				covid.selfQuarantineImported = Integer.parseInt(lines[8]); //자가격리(해외입국)
				covid.pubDate = lines[9]; //데이터 기준일자
				
				//배열에 담기
				list[i] = covid;
			
			}
			scan.close();
			fis.close();
		}
		//----------------------------
		//출력
		//Covid192객체에 다시 넣어서 출력
		for(int i=0; i<count; i++) {
		Covid192 covid = list[i];
		
			System.out.printf("%s,%d,%d,%d,%d,%d,%d,%d,%d,%s\n",
								covid.date,
								covid.cases,
								covid.deaths,
								covid.tests,
								covid.selfIsolation,
								covid.release,
								covid.recover,
								covid.selfQuarantineDomestic,
								covid.selfQuarantineImported,
								covid.pubDate
								);
		}
	}

}
