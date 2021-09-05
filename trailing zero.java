import java.util.Scanner;
class Main {
  public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int fact=1;
int countzero=0;
for(int i=n;i>=1;i--){
  fact=fact*i;
}
System.out.println(fact);
while(fact!=0){
int rem=fact%10;
if(rem==0){
  countzero++;
}

fact=fact/10;
}
System.out.println(countzero);
  }
}
