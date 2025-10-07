package Day2;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        while(true){
            System.out.println("Enter a year");
           String line =sc.nextLine().trim();
            if(line.isBlank()){
                System.out.println("Please type Something.Try again");
                continue;
            }
            try{
                year=Integer.parseInt(line);
                break;
            }catch (NumberFormatException e){
                System.out.println("Invalid Input");

            }
        }

        int r = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)? 1:0;
        switch (r) {
            case 1:
                System.out.println("The year is leap year");
                break;
            case 0:
                System.out.println("Not a leap year");
                break;

            default:
                System.out.println("Not a leap year");
        }


    } }

