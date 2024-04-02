package arraysv1;

import m.shapes.Rectangle;

public class MyArray {
  private int arr[]= new int[20];
  public MyArray() {
	   
   }
public MyArray(int[] arr) {
	super();
	this.arr = arr;
}
   
//we need to use deep copy here!
public MyArray(MyArray myarr) {
	super();
	//this needs to be fixed.
	//this.arr = myarr.arr;
	arr = new int[myarr.arr.length];
	 for (int i=0;i<arr.length;i++)	
		 arr[i] = myarr.arr[i];
	 
}

public void increment() {
		for (int i=0;i<20;i++)
			arr[i]++;
		
}
public String toString() {
	String str="";
	for (int i=0;i<20;i++)
		str+=arr[i]+ " ";
	return str;
}

public int [] getArray() {
	//return a copy of the array
	//check how to use the copy functions from the arrays class
	int output[] = new int[arr.length];
	for (int i=0;i<20;i++)
		output[i]= arr[i];
	//return arr;
	return arr;
}



public MyArray get() {
	return new MyArray(this);
	
}

public static void main(String args[]) {
	MyArray r1 = new MyArray();
	r1.increment();
	System.out.println(r1);
	MyArray r2 = new MyArray(r1);	
	System.out.println(r2);
	r2.increment();
	System.out.println(r1);
	int someArray [] = r2.getArray();
	
}
}

class MyException extends Exception {

	public MyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

