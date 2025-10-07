package Day5;

public class NoReturn {
    public static int sum(int x, int y) {
        System.out.println(x + y);
        return x+y;
    }

    public static void main(String[] args) {
        sum(5, 6);
    }
}

