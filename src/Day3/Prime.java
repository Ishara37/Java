package Day3;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int n = sc.nextInt();
            int flag=0;
            if(n==0||n==1){
                System.out.println("Number is not a prime");
            }
            else{
                int middlenumber=n/2;
                for(int i=2;i<=middlenumber;i++){
                    if(n%i==0){
                        System.out.println("Not a prime number");
                        flag=1;
                        break;
                    }
                }
if(flag==0){
    System.out.println("Is prime Number");
}
            }




        }

    }
}