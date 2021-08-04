package com.sank;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	float[]a={1.0f,2.0f,3.0f};
	System.out.println("enter the number which you want to find");
    Scanner sc=new Scanner(System.in);
	float c=sc.nextFloat();
	boolean b=false;
	for(int i=0;i<a.length;i++)
    {
        if(a[i]==c)
        {
            b=true;
        }

    }
	if(b==true)
    {
        System.out.println("found");
    }
	else{
	    System.out.println("not found");

    }
    }
}
