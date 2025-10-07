package Day1;
import java.util.Scanner;

public class SwapVariables {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int temp;

        System.out.println("Enter first number : ");
        int num1 = Integer.parseInt(sc.nextLine().trim());
        System.out.println("first number is : "+num1);

        System.out.println("Enter Second number : ");
        int num2 = Integer.parseInt(sc.nextLine().trim());
        System.out.println("second number is : "+num2);

        temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("Swap number is : "+num1 + " "+num2);
        sc.close();
    }

}
