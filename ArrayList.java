import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;


public class sank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Integer> l2= new ArrayList<>();
        ArrayList<String> l3= new ArrayList<>();
        ArrayList<String> l4= new ArrayList<>();
        ArrayList<Integer> l5= new ArrayList<>();
        l1.add(5);
        l1.add(7);
        l1.add(6);
        l1.add(2);
        l1.add(4);
        l2.add(12);
        l2.add(32);
        l2.add(42);
        l2.add(52);
        l3.add("a");
        l3.add("b");
        l3.add("c");
        l3.add("d");
        l4.add("e");
        l4.add("f");
        l4.add("g");
        l4.add("h");
        l3.addAll(l4);
        l1.addAll(l2);
        int large=0;

        Collections.sort(l1);
        l3.set(0,"sank");
        System.out.println(l3);
        System.out.println(l1);
        large=l1.get(1);
        System.out.println(large);
      System.out.println( l1.contains(large));


    }
}
