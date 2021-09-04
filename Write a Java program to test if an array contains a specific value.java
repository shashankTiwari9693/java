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
      System.out.println("enter "+i+"no");
      ary[i]=sc.nextInt();
    }
System.out.println("enter the no you want to found");
n=sc.nextInt();
for(int i=0;i<ary.length;i++)
    {
    if(ary[i]==n)
    {
      found=1;
       key=i;
       break;
    }
    else{
     found=0;
    }
    }

if(found==1){
System.out.println("yes found "+n+" at "+ key );
}
else{
  System.out.println("not found");
}
     

  }
}
