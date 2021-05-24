package Loop;
import java.util.Scanner;
public class FoorLoop {

	public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
    System.out.println(" enter the number "); 
      int n=sc.nextInt();
      int fac=1;
      for(int i =n;n>0;n--)
      {
    	  fac=fac*n;
    
    	  
      }
	  System.out.println("factorial is "+fac);
	
	
	}

}
