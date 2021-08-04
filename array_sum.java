package com.sank;

public class Main {

    public static void main(String[] args) {
	float[]a={1.0f,2.0f,3.0f};
	float sum=0;
	for(int i=0;i<a.length;i++)
    {
        sum = sum+a[i];
    }
	System.out.println(sum);
    }
}
