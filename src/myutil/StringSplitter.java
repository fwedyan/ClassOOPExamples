package myutil;

import java.util.Arrays;
import java.util.Scanner;

public class StringSplitter {
	public static void printWords(String[] parts) {
        for (String part : parts) {
            System.out.println(part);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = sc.nextLine();
        String[] parts = phrase.split(" ");
        System.out.println("Here are the words: ");
        printWords(parts);
        System.out.println("Here are the words sorted: ");
        Arrays.sort(parts);
        printWords(parts);
    }

}
