package Day1;

import java.util.Scanner;

public class IOPractise {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name=sc.nextLine();

        System.out.println("Enter your age : ");
        int age =Integer.parseInt(sc.nextLine());

        System.out.println("Enter your favourite language : " );
        String favouriteLanguage=sc.nextLine();

        System.out.println("Do you like coding (yes/no) :");
        String ans =sc.nextLine().trim().toUpperCase();
        boolean likesToCode= ans.equals("YES") || ans.equals("Y");

        System.out.println(name);
        System.out.println(age);
        System.out.println(favouriteLanguage);
     System.out.println("Likes Coding " +likesToCode);
     sc.close();






    }
}
