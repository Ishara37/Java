package Day2;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number ");
        Double A= Double.parseDouble(sc.nextLine().trim());
        System.out.println("Enter a second number ");
        Double B= Double.parseDouble(sc.nextLine().trim());
        System.out.println("Enter operator  +,-,*,/");
        String op=sc.nextLine().trim();
        switch(op){
            case "+" :
                System.out.printf("Result: %.3f%n",(A+B));
                break;
            case "-":
                System.out.printf("Result:%.3f%n ",(A*B));
                break;
            case "*" :
                System.out.printf("Result : %.3f%n", (A-B));
                break;
            case "/":
                if(B==0){
                    System.out.println("Error:Division by zero is not allowed");
                }
                else {
                    System.out.printf("Result : %.3f%n", (A / B));
                }
                break;
            default:
                System.out.println("Invalid Input please use * / - +");
                break;
        }
        sc.close();


    }
}
