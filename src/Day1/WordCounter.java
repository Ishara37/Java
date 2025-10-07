package Day1;
import java.util.Scanner;
public class WordCounter {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String sentence;
        System.out.println("Enter a sentence");

        while (true){
             sentence=sc.nextLine().trim();
             if(sentence.isBlank()){
                 System.out.println("Blank Enter a sentence");
                 continue;
             }
             break;

        }

        System.out.println("you have entered :" +sentence);
        String[] words =sentence.trim().split(" ");
        System.out.println("Number of Words Enter is :" + words.length);


    }
}
