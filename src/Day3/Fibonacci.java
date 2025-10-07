package Day3;
import java.util.Scanner;
public class Fibonacci {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int t1=0,t2=1;
        int t3=0;
        System.out.println(t1);
        System.out.println(t2);
        int i=1;
       do {
            t3=t1+t2;
            System.out.println(t3);
            t1=t2;
            t2=t3;
            i++;

        }
        while(i<=n);
    }
}
