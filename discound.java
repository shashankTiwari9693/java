//A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
// Ask user for quantity
// Suppose, one unit will cost 100.
// Judge and print total cost for user.


package Ifesle;
import java.util.Scanner;

public class Ifesle {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the unit u want");
int a = sc.nextInt();
int cost=100;
int totalcost = a*cost;
if(a>=1000)
{
totalcost=totalcost-(totalcost*10)/100;
	System.out.println(totalcost);
}
else {
	System.out.println(totalcost);
}


	}

}
