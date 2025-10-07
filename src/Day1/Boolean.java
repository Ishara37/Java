package Day1;
import java.util.Scanner;
public class Boolean {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you like coding yes/no :");
        String ans = sc.nextLine().trim().toLowerCase();

        boolean likesCoding =ans.equals("yes")|| ans.equals("y");

        System.out.println("Likes Coding " +likesCoding);

sc.close();

    }
}


