package Day1;
import java.util.Scanner;

public class GreetingProgram {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name =sc.nextLine().trim();
        System.out.println("Hello," +name +  " Welcome to java");

        System.out.println("Enter your age in years : ");
        int age = Integer.parseInt(sc.nextLine().trim());
        System.out.println("Age in month is : " +(age*12));

        System.out.println ("Enter two numbers ");
        int num1=Integer.parseInt(sc.nextLine().trim());
        int num2=Integer.parseInt(sc.nextLine().trim());
        int sum=num1+num2;
        int diff=num1-num2;
        int prod=num1*num2;
        System.out.println("Sum of two number is :" +sum);
        System.out.println("Difference of two number is :" +diff);
        System.out.println("Product of two number is :" +prod);
        if(num2 !=0){
            int intQuotient =num1/num2;//integer division
            double decQuotient = (double) num1/num2;//decimal division
            System.out.println("integerQuotient of two number is :" +intQuotient);
            System.out.println("decQuotient of two number is : " +decQuotient);
        }
        else{
            System.out.println("Quotient: undefined (division by zero).");
        }


      sc.close();



    }
}
