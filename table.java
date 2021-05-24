package Loop;
import java.util.Scanner;
public class FoorLoop {

	public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
    System.out.println(" enter the number "); 
      int n=sc.nextInt();
  
      for(int i =1;i<=10;i++)
      {
   System.out.println(n+"x"+i+"="+n*i);
    
    	  
      }
	  
	
	
	}

}


// output
//  enter the number 
// 100
// 100x1=100
// 100x2=200
// 100x3=300
// 100x4=400
// 100x5=500
// 100x6=600
// 100x7=700
// 100x8=800
// 100x9=900
// 100x10=1000
