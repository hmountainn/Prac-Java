package ex6.캡슐화.로또;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		
		//로또 객체안의 자료형 사용하기
		Lotto lotto;
		
		// 로또번호 만들기
		lotto = gen();
		// 로또번호 출력
		print(lotto);
		// 로또번호 정렬
		sort(lotto);
		// 정렬된 번호 출력
		print(lotto);

	}
	
	//-------------------------------------
	// 로또번호 만들기
	private static Lotto gen() {
		Random rand = new Random();
		
		Lotto list = new Lotto(); //로또객체 list라는 이름으로 사용할게
		list.num = new int[6]; //로또객체안에 num배열 사용
		
		for(int i=0; i<6; i++) {
			list.num[i]=rand.nextInt(45)+1;
		}
		
		return list;	
	}
	
	//-------------------------------------
	// 로또번호 출력
	private static void print(Lotto x) {
		for(int i=0; i<x.num.length; i++) {
			System.out.printf("["+"%d"+"] ",x.num[i]);
		}
		System.out.println();
	}
	
	//-------------------------------------
	// 로또번호 정렬
	private static void sort(Lotto x) {
		int temp;
		for(int i=0; i<x.num.length; i++)
			for(int j=0; j<i; j++) {
				if(x.num[i]<x.num[j]) {
					temp = x.num[j];
					x.num[j] = x.num[i];
					x.num[i] = temp;
				}
			}
	}

}
