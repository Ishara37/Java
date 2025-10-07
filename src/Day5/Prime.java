package Day5;

public class Prime {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return false;
        if (n % 2 == 0) return false;
        int limit = (int) Math.sqrt(n);
        for (int i = 3; i <= limit; i += 2) {
            if (n % i == 0) return false;
        }
        return true;

    }

        public static void main(String[] args){
        System.out.println(isPrime(37));
            System.out.println(isPrime(0));
            System.out.println(isPrime(1));
            System.out.println(isPrime(10));
        }

    }

