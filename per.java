package com.sank;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter marks1");
     int marks1 = sc.nextInt();
        System.out.println("enter marks1");
        int marks2 = sc.nextInt();
        System.out.println("enter marks1");
        int marks3 = sc.nextInt();
        int total=marks1+marks2+marks3;
        float per=total/3;
        System.out.println("Total marks is " + total);
        System.out.println("Percentage is " + per);
        if(per>33)
        {
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }
    }

    }

