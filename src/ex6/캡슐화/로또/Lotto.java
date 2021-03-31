package ex6.캡슐화.로또;

import java.util.Random;

public class Lotto {
	//캡슐화3 (Lotto객체 쓰는함수들 가져오기)
	
	//변수 선언
	private int[] num;
	private int size;
	
	
	//-------------------------------------
	//로또 객체안의 변수 초기화하기
	public static void init(Lotto x) {
		x.size = 6;
		x.num = new int[x.size];
		
	}
	
	//-------------------------------------
	//private int size print()에서 사용할수있도록 하기
	public static int getSize(Lotto lotto) {
		return lotto.size;
	}
	
	//-------------------------------------
	//private int[] num print()에서사용할수있도록 하기
	public static int getNum(Lotto lotto, int i) {
		return lotto.num[i];
	}
	
	
	//-------------------------------------
	// 로또번호 만들기
	public static Lotto gen(Lotto lotto) {
		Random rand = new Random();
		
		for(int i=0; i<6; i++) {
			lotto.num[i]=rand.nextInt(45)+1;
		}
		
		return lotto;	
	}
	
	//-------------------------------------
	// 로또번호 정렬
	public static void sort(Lotto x) {
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
