package ex4.struct;

public class Program {

	public static void main(String[] args) {
		//Covid19Ŭ���� ��ü Ȱ��
		
		//�Ϲ� �迭
		String[] row1 = new String[3];
		row1[0] = "2020-10-01";
		row1[1] = "30";
		row1[2] = "30";
		row1[3] = "23";
		
		//Covid19��ü
		Covid19 row2 = new Covid19();
		row2.date = "2020-10-01";
		row2.death = 30;
		row2.positive = 30;
		row2.tests = 23;
		
		//Covid19��ü�� ������ �迭
		Covid19[] list = new Covid19[10];
		list[0] = new Covid19(); // list[0]�� Covid19��ü �ּ� ����
		list[0].date = "";
		list[0].death = 12;
		
		list[1] = new Covid19(); //��ü ���������� null
		
		
		//Covid19��ü�� ������ ���� �� �迭�� ����
		//Covid19��ü ���� ����
		Covid19 row;
		row = new Covid19();
		row.date = "2020";
		row.death = 20;
		
		list[0] = row; //list[0] Covid19��ü �ּ� ���� 
	}	

}
