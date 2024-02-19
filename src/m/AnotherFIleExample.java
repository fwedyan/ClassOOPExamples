package m;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class AnotherFIleExample {
	/*
	 * Generate 100 random numbers, save them to a file, 10 numbers per line!
	 */

	public static void main(String[] args) {
		try {
            String filename = "C:\\temp\\numbers.txt";
           // PrintWriter w = new PrintWriter
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(filename))));
            Random r  = new Random();
          //10 lines
            for (int i = 1; i<= 10;i++) {
            	// 10 numbers per line
            	for (int j = 1; j<=10; j++) {
            		int num = r.nextInt(100);
            		pw.print(num+ " ");      
            		}
            	pw.println();
            		
            }
          
            pw.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

	}

}
