package ex8.추상화.재사용;

public abstract class Exam {
   private int kor;
   private int eng;
   private int math;
   
   //생성자
   public Exam() { 
	   this(1,1,1);
   }
   
   //오버로드 생성자
   public Exam(int kor, int eng, int math) { 
	   this.kor = kor;
	   this.eng = eng;
	   this.math = math;
   }
   
   //기본 total
   protected int baseTotal() {
      return this.kor + eng + math;      
   }
   
   //추상화
   public abstract int total();
   
   public abstract float avg();
   
    //getter 와 setter
	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
   
   
}