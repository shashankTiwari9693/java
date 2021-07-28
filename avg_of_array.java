//Write a Java program to calculate the average value of array elements
package com.sank;
import java.util.Arrays;

public class Main {
//Write a Java program to sort a numeric array and a string array

    public static void main(String[] args) {
    int []marks ={1,4,4,5,6};

int sum=0,avg=0;
        System.out.println(marks);
        Arrays.sort(marks);
        for(int element:marks)
        {
            System.out.println(element);
        }

        for(int i=0;i<marks.length;i++)
        {
            sum=sum+marks[i];
        }
        avg=sum/marks.length;
System.out.println(avg );
    }

    }

