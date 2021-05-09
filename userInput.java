package userInput;
import java.util.Scanner;
public class userInput {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("enter the principal");
int p = sc.nextInt();
System.out.println("enter rate");
 float r= sc.nextFloat();
 System.out.println("enter time");
 int t = sc.nextInt();
float si=p*r*t/100;
 
	System.out.println("simple intrest is"+ si);

	}

}
