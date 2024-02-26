package myutil;

import java.util.Arrays;
import java.util.Random;

public class MyArray {

	/**
	 * A method for creating an array of a given size of integeres, fill it with random numbers of a given interval
	 * @param size: >=0
	 *        a,b: a<=b
	 * @precondition: size is positive integer, a<=b
	 * @postcondition: an array of the given size filled with random values
	 * @exception: when any of the pre-conditions is not satisfied, an exception of type Exception
	 * is thrown 
	 */
	public static int [] createIntArray(int size, int a, int b) throws Exception {
		if (size<0)
			throw new Exception("Size should be >=0, operationn failed");
		if (a>b)
			throw new Exception("a < b");
		int arr[]  = new int[size];
		Random r = new Random();
		for (int i=0;i< arr.length;i++) {
			arr[i] = a+ r.nextInt(b-a+1);
			
		}
		return arr;		
	}
	/**
	 * You write the description!
	 * 
	 * @param args
	 */
	public static int [][] create2DIntArray(int rows, int cols, int a, int b) throws Exception {
		if (rows <0) {
			throw new Exception("Number of rows should be >=0, operationn failed");
		}
		if (cols<0) {
			throw new Exception("Number of columns should be >=0, operationn failed");
		}
		if (a>b)
			throw new Exception("a < b");
		int [][]arr= new int[rows][];
		for (int i=0; i<arr.length;i++) {
			arr[i] = new int[cols];
		}
		Random r = new Random();
		for (int i=0; i<arr.length;i++) {
			for (int j=0; j<arr[i].length;i++)
				arr[i][j]= a + r.nextInt(b-a+1);
		}
		return arr;
	}
	
	/** work on this for 5 min
	 * Write a function that takes 3 parameters and creates a two-dim int array where the size of
	 *  each row is larger than the size of the previous row by 1. 
	 * following:
	 *  * @param rows: number of rows
	 *  * @param firstRow: size of the first row
	 *  * @param value: the value the array is filled with
	 *  
	 */
	 public static int[][] create2DIntArray(int rows, int firstRow, int value) throws Exception {
		if (rows<0)
			throw new Exception("Number of rows should be Positive");
		if (firstRow<0)
			throw new Exception ("The size of the first row should be positive");
		int arr[][] = new int[rows][];
		arr[0] = new int[firstRow];
		for (int i=1, size=firstRow; i<arr.length; i++) {
			arr[i] = new int[++size];
		}
		for (int i=0;i<arr.length;i++) {
			Arrays.fill(arr[i], value);
			//for (int j = 0; j<arr[i].length; j++)
				//arr[i][j] = value;
		}
		return arr;
	 }
	/**
	 * Function for printing a given 2D-Array of integers, each row on a line, space seperated values
	 * @param arr:the array to be printed
	 */
	public static void print(int [][]arr) {
		for (int i=0;i<arr.length;i++) {
			for (int j = 0; j<arr[i].length; j++)
				System.out.print(arr[i][j]+" ");
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		try {
			int [][] arr = create2DIntArray(4, 3, 5);
			print(arr);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
