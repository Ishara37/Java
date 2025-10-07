package Day6;
import java.util.Scanner;
public class Recursion {
        // Recursive function: n! = n * (n-1)!, with 0! = 1
        static long factorial(int n) {
            if (n < 0) throw new IllegalArgumentException("n must be non-negative");
            if (n == 0) return 1;            // base case
            return n * factorial(n - 1);     // recursive case
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            sc.close();

            System.out.println(n + "! = " + factorial(n));
        }
    }


