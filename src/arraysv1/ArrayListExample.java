package arraysv1;

import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(5);
        numbers.add(3);
        numbers.add(7);
        int x =10;
        numbers.add(x);
Integer myArray[] = (Integer []) numbers.toArray();

        for (int n : numbers) {
            System.out.println(n);
        }
    }
}
