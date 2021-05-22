package Ifesle;
import java.util.Scanner;
public class Ifesle {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("enter the a\n");
a=sc.nextInt();
System.out.println("enter the b\n");
b=sc.nextInt();
System.out.println("enter what u want");
sc.nextLine();
char c= sc.nextLine().charAt(0);
switch(c){
case '+' :
int add=a+b;
System.out.println("add\n"+ add);
break;
case '-':
	int sub=a-b;
	System.out.println("sub\n"+ sub);
break;	
case '*':
	int mul=a*b;
	System.out.println("mul\n"+ mul);
break;	
case '/':
	int div=a/b;
	System.out.println("div\n"+ div);
break;	
}



	}

}
