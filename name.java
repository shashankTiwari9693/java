package userInput;
import java.util.Scanner;
public class userInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter roll");
		int roll=sc.nextInt();
		System.out.println("enter the name");
	    String name=sc.next();
	    System.out.println("hey,my name is "+ name +" and my roll number is "+roll);
	}

}
