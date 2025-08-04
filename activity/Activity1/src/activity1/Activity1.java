
package activity1;

import java.util.Scanner;

public class Activity1 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        double totalgrades = 0;

        double average;
        
        System.out.print("Enter student name: ");
        name = scan.nextLine();
        
        System.out.print("Enter number of subjects: ");
        int subject = scan.nextInt();

              
        for (int j = 1; j<= subject; j++) {
            System.out.print("Enter grade sub" + j + ": ");
            double grade = scan.nextDouble();
            totalgrades += grade;  
        }

       
        average = totalgrades / subject;
       
        System.out.println("\nAverage: " + String.format("%.2f", average));

        String remarks;
        if (average >= 75) {
            remarks = "PASSED";
        } else {
            remarks = "FAILED";
        }

        System.out.println("Remarks: " + remarks);

        
    }
    
}
