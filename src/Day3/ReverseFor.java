package Day3;
import java.util.Scanner;

public class ReverseFor {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int rev=0;
        int n=sc.nextInt();
        for(;n!=0;n/=10){
            int digit=n%10;
             rev=rev*10+digit;

        }
        System.out.println("The reverse number is "+rev);
    }
}
