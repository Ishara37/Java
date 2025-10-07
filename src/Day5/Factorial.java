package Day5;

public class Factorial {
    public static void factorial(int n ,int fact) {

        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        System.out.println(fact);
        return;
    }
        public static void main (String[] args){
        factorial(5,1);

        }
    }
