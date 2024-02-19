package m;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FunWithFiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fname, line;
        System.out.print("Enter name of input file: ");
        fname = sc.nextLine();
        try {
            Scanner fsc = new Scanner(new File(fname));
            String filename = "C:\\temp\\ontheroot.txt";
           // PrintWriter w = new PrintWriter
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(filename))));
            while (fsc.hasNextLine()) {
                line = fsc.nextLine();
                pw.println(line.toUpperCase());
            }
            fsc.close();
            pw.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
