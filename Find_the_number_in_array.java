import javax.sound.midi.SysexMessage;
import java.util.*;
public class Q2_Even_or_Odd_number {
    public static void main(String[] args) {
        int marks[]=new int[5];
        int count=0;
        int no=4;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i< marks.length;i++){
            System.out.println("enter a no" + i);
             marks[i]=sc.nextInt();
        }
        for(int i=0;i< marks.length;i++){
            System.out.println(marks[i]);

        }

        for(int i=0;i< marks.length;i++){
            if(marks[i]==no){
                count++;
            }
        }
        if(count!=0){
            System.out.println("number found"+ "" +count+"times");
        }
    }

}
