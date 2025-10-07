package Day2;
import java.util.Scanner;
public class Largest {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number: ");
        int A = Integer.parseInt(sc.nextLine());
        System.out.println("Enter second number:");
        int B=Integer.parseInt(sc.nextLine());
        System.out.println("Enter third number: ");
        int C=Integer.parseInt(sc.nextLine());
        if(A>B && A>C){
            System.out.println(A+ " Is Largest");
        }
        else if(B>A && B>C){
            System.out.println(B+ " Is Largest");
        }
        else if(A==B && B==C){
            System.out.println("All are equal");
        }
        else{
            System.out.println(C+ " Is Largest");
        }
    }
}
