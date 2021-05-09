package userInput;
import java.util.Scanner;
public class userInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the side of square");
		int side=sc.nextInt();
		int area=side*side;
		System.out.println(" square of " + side +" are "+area );
	}

}
