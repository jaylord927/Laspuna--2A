package Activities;

import java.util.Scanner;

public class AirFare {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome AirFare");
        System.out.println("\n1. Economy Class");
        System.out.println("2. Business Class\n");

        System.out.print("Enter Distance (km): ");
        double distance = scan.nextDouble();

        System.out.print("Enter Class: ");
        int Class = scan.nextInt();

        double fareperkm;
        double ttlfare;

        if (Class == 1) {
            fareperkm = 250;
        } else if (Class == 2) {
            fareperkm = 500;
        } else {
            System.out.println("Invalid class choice.");
            return;
        }

        ttlfare = fareperkm * distance;

        if (distance > 1000) {
            ttlfare = ttlfare - (ttlfare * 0.10);
        }

        System.out.printf("Fare: %.2f", ttlfare);
        System.out.println("\n");
        scan.close();
    }
}
