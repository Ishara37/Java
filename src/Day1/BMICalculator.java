package Day1;
import java.util.Scanner;
public class BMICalculator {

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your weight in Kg :");
        double weight=sc.nextDouble();
        System.out.println("Enter your height in m :");
        double height=sc.nextDouble();
        double bmi = (weight/(height*height));
        System.out.printf("Your BMI is  %.3f%n ",bmi);


    }
}
