package m.shapes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Shapes {

	public static void main(String[] args) throws Exception {
		/**
		 * Comparable versus Comparator 
		 * Comparable: allows one way of sorting, Comparator allows implementing different sorters
		 */
		/*
		 * 
		 */
		ArrayList <Shape> shapes = new ArrayList <Shape>();
		shapes.add(new Rectangle(4,5));
		shapes.add(new Circle(5));
		doSomething(shapes);
		
		part1OfLecture();
	}
	
	public static void doSomething(ArrayList <Shape> shapes) {
		Shape s = shapes.get(0);
		/** how can I know the type of s?
		 * Two options
		 * 1. instanceof 
		 * 2. getClass
		 */
		if (!(s instanceof Shape))
			return;
		
		if (s.getClass()==m.shapes.Rectangle.class) {
			System.out.println("s is a rectangle");	
			System.out.println( ( (Rectangle)s).getHeight());			
		}
		if (s.getClass()==Circle.class) {
			Circle circle = (Circle)s;
			
			System.out.println("s is a Circle");			
		}	
		
	}
    public static void part1OfLecture() throws Exception {
    	ArrayList <Rectangle> arr = new ArrayList<Rectangle>(20);
		//fill the array list with random rectangle objects
		for (int i = 1;i<=20;i++) {
			Random r  = new Random();
			int height = 1+ r.nextInt(20);
			int width = 1+ r.nextInt(20);
			arr.add(new Rectangle(height, width));	
			
		}
		Collections.sort(arr);
		
		for (Rectangle rec: arr) {
			System.out.println(rec.getArea());
		}
		Collections.sort(arr, new SortUsingArea());
		for (Rectangle rec: arr) {
			System.out.println(rec.getArea());
		}
		Collections.sort(arr, new sortUsingHeight());
		for (Rectangle rec: arr) {
			System.out.println(rec.getHeight());
		}

    }
}
