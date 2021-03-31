package ex6.캡슐화.로또.객체지향.생성자;

import java.util.Random;

public class Lotto {
	//생성자 설정(init, setSize삭제)
	
	//변수 선언
	private int[] num;
	private int size;
	
	//생성자
	public Lotto() {
		size = 6;
		num = new int[size];
	}
	
	

	//-------------------------------------
	//getSize instance함수로 변경
	public int getSize() {
		return size;
	}
	
	
	
	//-------------------------------------
	//private int[] num print()에서사용할수있도록 하기
	public int getNum(int i) {
		return this.num[i];
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
