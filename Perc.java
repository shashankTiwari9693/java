package com.sank;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int total=0;
int per=0;
        System.out.println("Enter the marks of sub1");
        int a=sc.nextInt();
        System.out.println("Enter the marks of sub2");
        int b=sc.nextInt();
        System.out.println("Enter the marks of sub3");
        int c=sc.nextInt();
        System.out.println("Enter the marks of sub4");
        int d=sc.nextInt();
        System.out.println("Enter the marks of sub5");
        int e=sc.nextInt();
        System.out.println("Enter the marks of sub6");
        int f=sc.nextInt();

        System.out.println("Total marks");
        total=a+b+c+d+e+f;
        System.out.println("total " + total +"marks");
        System.out.println("Percentage");
        per=total/6;
        System.out.println(per+ " %");


        if(per>=65)
        {
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }


    }
}
