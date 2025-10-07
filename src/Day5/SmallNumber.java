package Day5;

public class SmallNumber {
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
        public static void main (String[] args){
        System.out.println(min(9,12));

        }
    }

