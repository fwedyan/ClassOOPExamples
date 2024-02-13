package m;
/*
 * 
 * Write the necessary code to count how many objects are defined of type Point
 */
public class Point {
	public static int counter;
    public Point() {
    	counter++;
    }
	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point();
		System.out.println("Number of Points we have = "+ Point.counter);
		

	}

}
