package Day5;

public class EvenOdd {
    public static void evenOdd(int a) {
        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("odd");

        }
        return;
    }
    public static void main(String[] args){
        evenOdd(8);
    }

}

