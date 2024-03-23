package m.shapes;
/**
 * Represent a Circle with basic math operations
 * @author Fadi Wedyan
 * @version 1
 */

public class Circle extends Shape{
	double radius;
	/** 
	 * default Constructor of a circle object 
	 * 
	*/
	Circle() {
		radius =1;
	}
	/** 
	 * Construct a circle with a specified radius
	 *  */
	Circle(double newRadius) {
	radius = newRadius;
    }
	/** Return the area of this circle */
	public double getArea() {
		return radius * radius * Math.PI;
	}
	public static void main(String args[]) {
		Circle c1 = new Circle();
		System.out.println("The radius is: "+c1.radius);
		Circle c2 = new Circle(2);
		System.out.println(c2.radius);

		System.out.println(c2);  //c2 is a reference

		
	}
}
