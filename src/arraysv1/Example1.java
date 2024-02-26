package arraysv1;

import java.util.Random;
import java.util.Scanner;

import myutil.MyArray;
import myutil.MyReader;

public class Example1 { 

	public static int showMenuAndGetChoice(Scanner sc) { 
		System.out.println("Here are your options: "); 
		System.out.println("1. Min"); 
		System.out.println("2. Max"); 
		System.out.println("3. Mean"); 
		System.out.println("4. Quit"); 
		System.out.print("Enter number of your choice: ");
		int result = sc.nextInt();
		return result;
	} 
	/*
	 * Passing parameters to methods
	 * call by value: Java supports only this type
	 * call by reference
	 */
	public static int findMin(int[] nums) throws Exception{
		try {
			int result = nums[0];
			for (int i = 1; i < nums.length; i++) {
				if (nums[i] < result) {
					result = nums[i];
				}
			}
			return result;
		} catch (Exception e) {
			throw new Exception("Array is empty, or does not exist");
		}
		
	}
	
	public static int findMax(int[] nums) {
		int result = nums[nums.length-1];
		for (int i = nums.length-2; i >=0; i--) {
			if (nums[i] > result) {
				result = nums[i];
			}
		}
		return result;
	}
	public static double findMean(int[] nums) {
		double total = 0;
		for (int num : nums) {
			total = total + num;
		}
		double result = total / nums.length;
		return result;
	}
	public static void print(int[] nums) {
		for (int num : nums) {
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		int[] numbers= {};
		
		Scanner sc = new Scanner(System.in);
		/*System.out.print("Please enter array size");
		int size = sc.nextInt();
		numbers =  new int[size];
		Random rnd = new Random();
		/*for (int i = 0; i < 10; i++) {
			numbers[i] = rnd.nextInt(100);
		}
		*/
		try {
			int size = MyReader.readInt(0, Integer.MAX_VALUE, "Please enter array size");
			numbers = MyArray.createIntArray(size, 5, 10);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		System.out.println("The numbers are:");
		print(numbers);
		int theMin = 0, theMax, choice;
		double theMean;
		do {
			choice = showMenuAndGetChoice(sc);
			if (choice == 1) {
				try {
					theMin = findMin(numbers);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.printf("The min is %d.\n",theMin);
			} else if (choice == 2) {
				theMax = findMax(numbers);
				System.out.printf("The max is %d.\n",theMax);
			} else if (choice == 3) {
				theMean = findMean(numbers);
				System.out.printf("The mean is %.2f.\n", theMean);
			}
		} while (choice != 4);
	}

} 

