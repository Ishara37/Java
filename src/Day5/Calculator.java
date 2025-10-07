package Day5;
import java.util.Scanner;

public class Calculator {
    //Method for addition

    static int add(int a, int b){
        System.out.println("[TRACE] add called with a=" + a + ", b=" + b);
        return a+b;
    }

    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }

    static double div(int a, int b){
        if(b==0){
            System.out.println("enter a valid number");
            return 0;
        }
        return(double)  a/b;
    }
public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int a= sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Addition: "+add(a,b));
    System.out.println("Subtraction: "+sub(a,b));
    System.out.println("Multiply: "+mul(a,b));
    System.out.println("Division: "+div(a,b));

    sc.close();


    }


}
