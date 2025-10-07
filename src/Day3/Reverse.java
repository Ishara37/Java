package Day3;
import java.util.Scanner;
public class Reverse {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number that you want to reverse");
        int n=sc.nextInt();
        int rev=0;
        do{
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;

        }
        while(n!=0);
        System.out.println("Reverse number is "+rev);
        sc.close();

    }
}
