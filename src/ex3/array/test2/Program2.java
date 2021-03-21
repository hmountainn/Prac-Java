package ex3.array.test2;

import java.util.Random;

public class Program2 {

	public static void main(String[] args) {
		//문자열 배열 섞었다가 순서대로 정렬하기
		
		//1.배열생성
		String[] list = {"강호동","유재석","하하","김지호","김현준","김태희","박민정"};

		//2.섞기
		Random rand = new Random();
		int idx, idx2;
		String temp;
		
		
		//3.100번 반복
		for(int i=0; i<100; i++) {
			idx = rand.nextInt(7);
			idx2 = rand.nextInt(7);
			
			temp = list[idx2];
			list[idx2] = list[idx];
			list[idx] = temp;
		}
		
		//섞은거 출력
		for(int i=0; i<7; i++) {
			if(i < 6)
				System.out.printf("%s,", list[i]);
			else
				System.out.printf("%s", list[i]);
		}
		
		System.out.println();
		
		//4.순서대로 정렬
		for(int i=1; i<list.length; i++)
			for(int j=0; j<i; j++)
				if(list[i].compareTo(list[j])<0) {
					temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
		
		//5.출력
		for(int i=0; i<7; i++) {
			if(i < 6)
				System.out.printf("%s,", list[i]);
			else
				System.out.printf("%s", list[i]);
		}
	}

}
