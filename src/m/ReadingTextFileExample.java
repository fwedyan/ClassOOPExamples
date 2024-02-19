package m;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/*
 * Wrapper classes: int-->Integer
 * autoboxing: converts int (primitive type in general) to it's corresponding wrapper object
 * unboxing: the way way around
 */
public class ReadingTextFileExample {

	public static void main(String[] args) {
       try {
		Scanner in = new Scanner(new File("C:\\JavaWS\\LecturesExamples\\src\\m\\mydata.txt"));
		//new Scanner("C:\\JavaWS\\LecturesExamples\\src\\m\\mydata.txt");
		Integer sum=0;
		int x=10;
		sum = x;
		while (in.hasNextLine()) {
			String str = in.nextLine();		
			sum += Integer.parseInt(str);						
		}
		System.out.println(sum);
		in.close();
	} catch (FileNotFoundException e) {
		System.out.println("Incorrect filename, please try again....");
	}
       
	}

}
