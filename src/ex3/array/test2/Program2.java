package ex3.array.test2;

public class Program2 {

	public static void main(String[] args) {
		//문자열 조작
		String fileName = "photo.jpg";
		System.out.println(fileName.length());  //9
		System.out.println(fileName.indexOf(".")); //5
		System.out.println(fileName.substring(3)); //to.jpg
		System.out.println(fileName.substring(3,5));// to
		System.out.println(fileName.substring(0,fileName.indexOf(".")));// photo

	}

}
