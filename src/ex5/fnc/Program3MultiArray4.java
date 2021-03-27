package ex5.fnc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program3MultiArray4 {
	static void PrintCovid19List(String[][] rows, int count) {
	  //���ڵ� ���
	  System.out.println("// ���ڵ带 ����ϴ� �ڵ�------------------------");
      for(int j=0; j<count; j++) {
         for(int i=0; i<10; i++) {
            System.out.printf("%s", rows[j][i]);
            
            if(i < count-1)
               System.out.printf(",");
         }
         
         System.out.println();
      }
	}
	
	//���� �˻������ڼ�
	static int getTotal(String[][] rows,int count) {
      int total = 0;
    
      for(int i=0; i<count; i++)
    	  total += Integer.parseInt(rows[i][3]);

      return total;
	}
	
	// �Ϻ� ���� ���� �˻������ ���
	static int getMax(String[][] rows,int count) {
	  int max = 0;
      int current;
      
      for(int i=0; i<count; i++) {
     	 current = Integer.parseInt(rows[i][3]);
     	 if(current>max)
     		 max = current;
      }
      return max;
	}
	
	//�Ϻ� ���� ���� �˻������ ���
	static void printMax(String[][]row, int count)
	{
      int max = getMax(row,count);
		
      System.out.printf("max: %d\n",max);
	}
	
	//Ȯ���� ���� �þ ���ڿ� ���� ���
	static void PrintA(String[][] rows, int count)
	{
        String date = "";
        int diff = 0;
        
        int old = 0; // ���� Ȯ���� ��
        int index = 0;
        for(int i=0; i<count; i++) {
           int current = Integer.parseInt(rows[i][1]);
           
           if(old != current) {
              
              diff = current - old;
              date = rows[i][0];
              
              old = current;
              System.out.printf("%d : %s, %d\n", index+++1, date, diff);
              
           }
        }

     }
	//���ڵ带 �ε�
	static String[][] load(String[][] rows,int count) throws IOException
	{
        rows = new String[count][];
        FileInputStream fis = new FileInputStream("res/jeju.csv");
        Scanner fscan = new Scanner(fis);
        
        String line;
        
        fscan.nextLine();
  
        for(int i=0; i<count; i++) {
           line = fscan.nextLine();
           rows[i] = line.split(",");
        }
        
        fscan.close();
        fis.close();
        return rows;
     }
	
	//�˻�������� ���� ���� ��¥ ���
    static String getDate(String[][] rows, int count)
	{
        //2�� ������ ���� ����
        String date = "";
        int idx = 0;
        int max = getMax(rows, count);
        
        for(int i=0; i<count; i++)
           if(max == Integer.parseInt(rows[i][3])) {
              idx = i;
              break;
           }
        date = rows[idx][0];
        return date;
	}
    
	static void printB(String[][] rows, int count)
    {  
    	String date = getDate(rows, count);
    	
        System.out.println();
        
        System.out.printf("%s", date);
        System.out.println();
     }  
	
	static int getCount(int count) throws IOException {
		
		    FileInputStream fis = new FileInputStream("res/jeju.csv");
		    Scanner fscan = new Scanner(fis);
		         
		    
		    // while �ݺ��� �ϸ鼭 count++ ������ �Ѵ�. ������ ���� ���� ������
		    while(fscan.hasNextLine()) {
		        fscan.nextLine();
		        count++;
		        }
		         
		    fscan.close();
		    fis.close();
		         
		    count--;
	      
		    return count;
	}
		
   public static void main(String[] args) throws IOException {
	  int count = 0;
      String[][] rows=null;
      //---------------------------------------------------------
      // ���ڵ� ������ �˾Ƴ��� �ڵ�
      count = getCount(count);
      
      //--------------------------------------------------------
      
      // ���ڵ带 �ε��ϴ� �ڵ�
      rows = load(rows, count);
      
      //---------------------------------------------------------      
      // ���ڵ带 ����ϴ� �ڵ�
      PrintCovid19List(rows, count);

      
      //---------------------------------------------------------
      // �˻������� �������� ��� �ڵ�      
      int total = getTotal(rows, count);
      
      System.out.println(total);
      System.out.println();
      
      
      // 1.�Ϻ� ���� ���� �˻������ ���
      printMax(rows,count);
      
      // 2.�˻�������� ���� ���Ҵ� ��¥��?
      printB(rows, count);
 
         
      
      // Ȯ���� ���� �þ ���ڿ� ���� ����Ͻÿ�.
      PrintA(rows, count);
      
      
      // Ȯ���� ���� �þ ���ڿ� ���� ���� �迭�� ����ֽÿ�.
      String[][] results;   
      int resultCount = 0;
      
      {
         // Ȯ���� ���� �޶��� ������ resultCount�� ������Ŵ���ν� �����Ǵ� ���� ���� ���ϴ� �ڵ�
         int old = 0; // ���� Ȯ���� ��
                  
         for(int i=0; i<count; i++) {
            
            // i ��° ���� Ȯ���� ��
            int current = Integer.parseInt(rows[i][1]);
            
            // i ���� Ȯ����(current)�� ���� Ȯ���ڼ�(old)�� �ٸ��ٸ�
            if(old != current) {
               // Ȯ���� ���� �޶����� ������ ���� ����
               resultCount++;
               
               old = current;   
            }
         }
         
         System.out.println(resultCount);
         
         results = new String[resultCount][];
         
         String date = "";
         int diff = 0;
         
         old = 0; // ���� Ȯ���� ��
         
         int index = 0;
         for(int i=0; i<count; i++) {
            int current = Integer.parseInt(rows[i][1]);
            
            if(old != current) {               
               diff = current - old;
               date = rows[i][0];
               // �ڷγ�19 ������ ���� �����ϱ� ���� �迭
               String[] row = new String[2];
               row[0] = date;       // date
               row[1] = String.valueOf(diff);   // diff
               
               results[index++] = row;
               
               old = current;
            }
         }
         
         System.out.println("�۾��Ϸ�");
         
      }
      
      
      
   }

}