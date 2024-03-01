package arraysv1;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class ListOfNames {
    public static void printNames(ArrayList<String> names) {
        for (String name: names) {
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
    	//a generic type
        ArrayList<String> names = new ArrayList<String>();
        
        names.add("Ray");
        names.add("Karen");
        names.add("Conor");
        names.add("Lauren");
        names.add("Evan");
        names.add("Brody");
        printNames(names);
        Collections.sort(names);
        printNames(names);
        Random rnd = new Random();
        int index = rnd.nextInt(names.size());
        String randomName = names.get(index);
        System.out.println("Here's the chosen name: " + randomName);
    }
}


