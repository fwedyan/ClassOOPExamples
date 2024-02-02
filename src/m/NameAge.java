package m;

import java.util.Scanner;
public class NameAge {
    public static void main(String[] args) {
    	//robust! 
    	Scanner sc = new Scanner(System.in);
    	
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (age<=0) {
        	System.out.println("Invalid input, age should be >0, program is existing...");
        	System.exit(0);         	
        }
        sc.nextLine();
        System.out.print("Enter full name: ");
        String name = sc.nextLine();
        System.out.println("Age = " + age + " and name = " + name);

    }
}
