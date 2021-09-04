import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int[]ary=new int[4];
    int sum=0;
    for(int i=0;i<ary.length;i++)
    {
      ary[i]=sc.nextInt();
    }

for(int i=0;i<ary.length;i++)
    {
      sum=sum+ary[i];
      
    }
System.out.println(sum);

     

  }
}
