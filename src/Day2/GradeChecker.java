package Day2;
import java.util.Scanner;

public class GradeChecker {
    public static void main(String[]args){
        System.out.println("Enter Marks (0-100)");
        Scanner sc= new Scanner(System.in);
        int marks= Integer.parseInt(sc.nextLine());
        if (marks >=90)
        {
        System.out.println("Grade A");
        }
        else if(marks>=80){
            System.out.println("Grade B");

        }
        else if(marks>=70){
            System.out.println("Grade C");
        } else if (marks>=60) {
            System.out.println("Grade C");

        } else {
            System.out.println("Grade F");
        }
    }
}
