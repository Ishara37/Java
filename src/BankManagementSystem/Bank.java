package BankManagementSystem;
import java.util.Scanner;

public class Bank {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double balance=0;
        int choice;
        boolean isRunning=true;
        while(isRunning) {
            System.out.println("*******************");
            System.out.println("BANKING PROGRAM");
            System.out.println("*******************");
            System.out.println("1. SHOW BALANCE");
            System.out.println("2. DEPOSIT");
            System.out.println("3. WITHDRAW");
            System.out.println("4. EXIT");
            System.out.println("*******************");

            System.out.println("ENTER YOUR CHOICE (1-4): ");
            choice=sc.nextInt();
            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance+= deposit();
                case 3 -> balance-=withdraw(balance);
                case 4 -> isRunning=false;
                default -> System.out.println("INVALID CHOICE");
            }
        }
System.out.println("Thank you for using Bank");
        System.out.println("*******************");
sc.close();
    }
      static void showBalance(double balance){
        System.out.println("*******************");
        System.out.printf("$%.2f\n" , balance);

    }

static double deposit() {
    double amount;
    System.out.println("Enter an amount to be deposited : ");
    amount = sc.nextDouble();

    if (amount<0){
        System.out.println("Amount cannot be negative");
        return 0;

    }
    else {
        return amount;
    }


}

static double withdraw(double balance ){
        double amount;
        System.out.print("Enter an amount to be withdrawn : ");
        amount = sc.nextDouble();
        if (amount>balance){
            System.out.println("Insufficient Balance");
            return 0;

        }
        else if(amount<0){
            System.out.println("Amount cannot be negative");
            return 0;

        }
        else{
            return amount;
        }

    }

}


