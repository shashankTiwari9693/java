package com.sank;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);


int a=56;
int n=1;


while(n==1) {
	System.out.println("Enter the number to check wheater its greather or not");
	int b=sc.nextInt();


	if (b > a) {
		System.out.println("Greater");
	} else {
		System.out.println("Smaller");
	}
	System.out.println("To continue press 1");
	n = sc.nextInt();
}

	}

    }

