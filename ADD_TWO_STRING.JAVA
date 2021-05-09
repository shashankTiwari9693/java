package userInput;
import java.util.Scanner;
public class userInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String a =sc.next();
		System.out.println("enter second string");
		String b =sc.next();
		System.out.println(a+b);
	}

}
