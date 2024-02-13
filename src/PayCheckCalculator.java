
import java.util.Scanner;
public class PayCheckCalculator {
    public static void main(String[] args) {
        String more = "y";
        double hours, rate, gross;
        Scanner sc = new Scanner(System.in);
        while (more.equalsIgnoreCase("y")) {
            System.out.print("Enter hours and rate: ");
            hours = sc.nextDouble();
            rate = sc.nextDouble();
            gross = hours * rate;
            System.out.println(gross);
            System.out.print("Enter y/Y to try again, press any key to stop ");
            more = sc.next().trim();
        }
        //lets do it with for
        for (;more.equalsIgnoreCase("y");) {
            System.out.print("Enter hours and rate: ");
            hours = sc.nextDouble();
            rate = sc.nextDouble();
            gross = hours * rate;
            System.out.println(gross);
            System.out.print("Enter y/Y to try again, press any key to stop ");
            more = sc.next().trim();
        }
    }
}
