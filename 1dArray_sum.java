package com.sank;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int sum=0;
    int[]a=new int[4];
        int[]b=new int[4];
        System.out.println("enter number in first array");
        for(int i=0; i<a.length; i++)
        {
            System.out.print("Element"+i+": ");
            a[i]=sc.nextInt();
        }
        System.out.println("enter number in Second array");
        for(int j=0; j<b.length; j++)
        {
            System.out.print("Element"+j+": ");
            b[j]=sc.nextInt();
        }

        System.out.print("Array 1: ");
for(int element:a)
{
    System.out.print(element);
    System.out.print(" ");
}
System.out.println("");
        System.out.print("Array 2: ");
        for(int element1:b)
        {
            System.out.print(element1);
            System.out.print(" ");
        }

System.out.print("\nsum    : ");
for(int k=0;k<a.length;k++)
{
    sum=a[k]+b[k];
    System.out.print(sum+" ");
}



    }
}
