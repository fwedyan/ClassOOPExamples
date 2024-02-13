
import java.util.Scanner;
public class Arithmetic {
    public static int printMenuAndGetChoice(Scanner sc) {
        System.out.println("Here are your options:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Quit");
        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }
    /*
     * write a function to compute the following series
     * s = 1/-n + 1/-(n+1) +... + 1/n
     * for example if n= 5
     * s = 1/-5 +1/-4 + .... +1/5 
     */
    public static double s(int n) {
    	double sum = 0;
    	for (int i=-n; i<=n; i++) {
    		if (i==0) continue;
    		sum+=1.0/i;
    	}
    	return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(s(5));
  
   // 	while (true) {
	/*
	 * for (;;) { //is this valid?
	 * System.out.print("enter s/S to break out of the loop "); String s =
	 * sc.next(); if (s.equals("s")) break; }
	 * 
	 * // Scanner sc = new Scanner(System.in); int num1, num2, choice;
	 * System.out.print("Enter two numbers: "); num1 = sc.nextInt(); num2 =
	 * sc.nextInt(); do { choice = printMenuAndGetChoice(sc); if (choice == 1) {
	 * System.out.printf("%d + %d = %d\n", num1,num2,(num1+num2)); } else if (choice
	 * == 2) { System.out.printf("%d - %d = %d\n", num1,num2,(num1-num2)); } else if
	 * (choice == 3) { System.out.printf("%d * %d = %d\n", num1,num2,(num1*num2)); }
	 * else if (choice == 4) { System.out.printf("%d / %d = %.2f\n",
	 * num1,num2,((double)num1/num2)); } else if (choice !=5)
	 * System.out.printf("\nIncorrect input\n"); } while (choice != 5);
	 */
    }
}
