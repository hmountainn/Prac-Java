package ex9.인터페이스;

public class YBMBanner implements Banner {

	@Override
	public void start() {
		System.out.println("-----------------------------");
		System.out.println("        YBM 성적 출력           ");
		System.out.println("-----------------------------");
	}

	@Override
	public void end() {
		System.out.println("-----------------------------");
	}
	

}
