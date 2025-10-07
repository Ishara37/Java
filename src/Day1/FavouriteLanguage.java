package Day1;
import java.util.Scanner;
public class FavouriteLanguage {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String language;
        while(true) {
            System.out.println("What's your favourite programming language?");
             language = sc.nextLine().trim();
            if (language.isBlank()) {
                System.out.println("Please type something. Try again");
                continue;
            }
            break;
            }

            if (language.equalsIgnoreCase("java")) {
                System.out.println("Great Choice!");
            } else {
                System.out.println("Nice! " + language + " is cool too");
            }
            sc.close();
        }
        }

