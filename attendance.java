//A student will not be allowed to sit in exam if his/her attendence is less than 75%.
// Take following input from user
// Number of classes held
// Number of classes attended.
// And print
// percentage of class attended
// Is student is allowed to sit in exam or not.

package Ifesle;
import java.util.Scanner;

public class Ifesle {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the total class held");
int c=sc.nextInt();
System.out.println("enter the total no of present");
int p=sc.nextInt();
int total=p/c*100;
if(total>=75)
{
	System.out.println("eligible for exam");
	}
else {
	System.out.println("sorry :/");
}
	}

}
