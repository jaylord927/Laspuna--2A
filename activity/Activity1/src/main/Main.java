package Main;

import java.util.Scanner;
import banking.bankapp;

public class Main {

    public static void main(String[] args) {
        System.out.println("Activity 1");
        Scanner scan = new Scanner(System.in);

        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");

        System.out.print("Enter choice: ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                bankapp ba = new bankapp();

                int attempts = 0;

                while (attempts < 3) {
                    System.out.print("Enter your Account No: ");
                    int accountNo = scan.nextInt();

                    System.out.print("Enter your Pin: ");
                    int pin = scan.nextInt();
                   
                    if (ba.verifyAccount(accountNo, pin)) {
                        System.out.println("LOGIN SUCCESS");
                        return; 
                    } else {
                        attempts++;
                        System.out.println("INVALID ACCOUNT! Attempts remaining: " + (3 - attempts));
                    }
                }
          
                System.out.println("Too many failed attempts. Exiting the system.");
                System.exit(0); 
                break;

            case 2:
                
                break;

            case 3:
               
                break;

            default:
                System.out.println("Invalid Selection!");
        }
    }
}
