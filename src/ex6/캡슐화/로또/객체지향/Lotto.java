package ex6.캡슐화.로또.객체지향;

import java.util.Random;

public class Lotto {
	//static메소드(함수지향)에서 인스턴스 메소드(객체지향)로 바꾸기
	
	//변수 선언
	private int[] num;
	private int size;
	
	
	//-------------------------------------
	//로또 객체안의 변수 초기화하기
	public void init() {
		this.size = 6;
		this.num = new int[size];
		
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
	public void gen() {
		Random rand = new Random();
		
		for(int i=0; i<6; i++) {
			this.num[i]=rand.nextInt(45)+1;
		}
	}
	
	//-------------------------------------
	// 로또번호 정렬
	public void sort() {
		int temp;
		for(int i=0; i<this.size; i++)
			for(int j=0; j<i; j++) {
				if(this.num[i]<this.num[j]) {
					temp = this.num[j];
					this.num[j] = this.num[i];
					this.num[i] = temp;
				}
			}
	}


	
	
}
