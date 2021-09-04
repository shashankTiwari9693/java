import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int[]ary=new int[4];
    int n=0;
    int found=0;
    int key=0;
   
    for(int i=0;i<ary.length;i++)
    {
      
      ary[i]=sc.nextInt();
    }
     System.out.print("enter the no you want to delete");
     n=sc.nextInt();
for(int i=0;i<ary.length;i++)
    {
      if(ary[i]==n){
        found=1;
        key=i;
      }

      
    }
   for(int i=0;i<ary.length;i++)
    {
      
      System.out.print(ary[i]);
    }
     for(int i=key;i<ary.length-1;i++)
    {
      
    ary[i]=ary[i+1];
    } 
    System.out.println("");
for(int i=0;i<ary.length-1;i++)
    {
      
      System.out.println(ary[i]);
    }

  }
}
