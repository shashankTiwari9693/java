package Loop;
import java.util.Scanner;
public class Series {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the number");
	int n = sc.nextInt();
	float result=1;
	float rel=0;
	float fact=1;
for(int i=1;i<=n;i++)
{
System.out.print(i +"/"+i+"!");
if(i!=n)
System.out.print("+");
fact=fact*i;
rel=rel+(i/fact);        
}
System.out.print("\n sum of the seires are = "+rel);
	 
 }
  
}


//enter the number
//5
//1/1!+2/2!+3/3!+4/4!+5/5!
 //sum of the seires are = 2.7083335
