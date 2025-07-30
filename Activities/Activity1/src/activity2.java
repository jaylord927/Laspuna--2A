
import java.util.Scanner;

public class activity2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float gww;
        float sss;
        float nww;
        System.out.print("Enter employee name: ");
        String ename = scan.nextLine();

        System.out.print("Enter hourly rate: ");
        float hr = scan.nextFloat();

        System.out.print("Enter total hours worked this week:  ");
        float ttlhww = scan.nextFloat();
        
        System.out.println("\n");
        
        gww = hr * ttlhww;
        sss = (float) (gww * 0.1);
                        
        System.out.print("\n-----------Wage Summary----------");
        System.out.print("\n|Employee: " + ename);
        System.out.print("\n|Hourly Rate: ₱" + hr);
        System.out.print("\n|Hours Worked: " + ttlhww);        
        System.out.print("\n|Gross Weekly Wage: ₱" + gww);        
        System.out.print("\n|SSS contribution (10%): ₱" + sss);
        System.out.print("\n---------------------------------\n");
        nww = gww - sss;
        System.out.println("Net Weekly Wage: ₱" + nww);

    }
}
