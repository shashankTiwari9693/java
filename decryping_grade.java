package com.sank;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
 char grade='B';
 System.out.println("enter the grade");
 grade= (char)(grade+8);
		System.out.println("fake " +grade);

		//decrypting the grade

		grade= (char)(grade-8);
		System.out.println("real grade " + grade);


    }
}
