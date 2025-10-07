package Day3;
import java.util.Scanner;
public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,mul;
        while (true) {
            System.out.println("Enter a number for its multiplication Table");
            String line = sc.nextLine().trim();
            if (line.isBlank()) {
                System.out.println("Enter valid number");
                continue;
            }
            try {
                n = Integer.parseInt(line);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input");
            }
        }
        int j=1;
        do
         {
            mul = j * n;
            System.out.println(n + "*" + j + "=" + mul);
            j++;


        }
        while (j <= 10);
    }
    }


