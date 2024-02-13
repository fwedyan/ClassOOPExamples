package myutil;

import java.util.Scanner;

public class MyReader {

	/**
	 * Write a function to read an integer within a given range
	 * @param a, int, range lower edge
	 * @param b, int, range higher edge
	 * @precondition a and b are integer, a<=b
	 * @postcondition: the function "always" returns an integer within [a,b] 
	 */
	public static int readInt(int a, int b) throws Exception {
		if (a>b) {
			throw new Exception("a should be less than or equal to b");
		}
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a value in ["+a+","+b+"]:");
		int value=0;
		//what if input is out of range
		do {
			value = in.nextInt();
			if (value<a || value >b) {
				System.out.print("Please enter a value in ["+a+","+b+"]:");				
			}
			else
				break;		
		}while (true);
		
		return value;
	}
	public static void main(String[] args) {
         try {
			readInt(1,5);
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
         //you can continue here...
         
	}

}
