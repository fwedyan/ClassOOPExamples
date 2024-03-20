package m;
/*
 * Class Rectangle represent the geometric rectangle shape. It has a width and a height.
 * It also has the following behavior:
 * 1. Two constructors, default, width and height = 1, and a constructor that allows creating a 
 * a rectangle using passed values for width and height
 * 2. A method to compute the area, which equals width*height
 * 3. A method to print the rectangle in the format:
 *  width = widthValue, height = heightValue, area = areaValue
 * Constraints:
 * A. Class Rectangle and it's Width and height values are accessible by any class
 * B. Width and height should be in the range [1,20]  
 */
/*
 * Test cases: inputs and expected output(s)
 * Pre-conditions: conditions that should hold
 * Problem specifications
 */
public class Rectangle extends  Shape {
	private int height=1;  // explain what it means ...
	private int width=1;
	
	public Rectangle() throws Exception{
		//width=height =1;
	    this(1,1); //can only be in a constructor, has to be the first statement in the constructor
	}
	public Rectangle(int height, int width) throws Exception {
		super(); //even if we do not write this statement, it's implicity executed or called when
		//we call the subclass constructor
		setWidth(width);
		setHeight(height);
	}
	
	
	public Rectangle(String color, boolean filled, int height, int width) throws Exception {
		super(color, filled);
		setWidth(width);
		setHeight(height);
	}
	
	/**
	 * Called copy constructor, the created object will be a copy of the passed object
	 * @param rectangle
	 * @throws Exception 
	 */
	public Rectangle(Rectangle rectangle) throws Exception {
		//shallow copy
		super(rectangle.getColor(), rectangle.isFilled());
		setWidth(rectangle.getWidth());
		setHeight(rectangle.getHeight());
	}
	
	public double getArea() {
		return this.height * this.width;
	}
	
	public void print() {
		System.out.println("width = "+this.width+ " , height = "+ this.height+ " , area ="+this.getArea());		
	}
	
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	private boolean isValidWidth(int width) {
		return width >=1  &&  width<=20 ;		
	}
	private boolean isVlaidHeight(int height) {
		return height>=1 && height <= 20;
	}
	/**
	 * @return the value is set if valid [1,20], otherwise, the method does nothing
	 */
	public void setWidth(int width) {
		//if (width >=1  &&  width<=20  )
		if (isValidWidth(width))
			this.width = width;
	}
	public void setHeight(int height) throws Exception {
		if (isVlaidHeight(height))
			this.height = height;
		else
			throw new Exception(height + " is invalid height value, should be in the range [1,20]");
	}
	/*
	 * Method override: occurs when a sub-class re-implements a method it inherits from
	 * one of it's super classes
	 * 
	 */
	public String toString() {
		super.toString();
		return super.toString()+ " width = "+this.width+ " , height = "+ this.height;
	}
	/**
	 * Two rectangles are equal if they have the same width and height
	 */
	public boolean equals(Object obj) {
		if (!(obj instanceof Rectangle))
			return false;
	
		Rectangle rectangle = (Rectangle) obj; //type casting
		
		if (this.width == rectangle.width && this.height==rectangle.height) {
			return true;
		}
		return false;
	}
	
    public static void main(String s[] ){
    //   Rectangle r1;
	try {
	//	Rectangle test1 = new Rectangle(5,5);
	//	Rectangle test2 = new Rectangle(5,5);
		//Shape shape = new Shape();
		// a super class reference can have objects of any of it's sub classes
		/**
		 * method matching: performed at compile time, make sure the called method belongs to the class
		 * 	method binding: performed at run time, the compiler finds which version of the method to call
		 * 
		 */
		
	
		Shape shape = new Rectangle(10,5);
	//	shape.getWidth(10);
		
		
		System.out.println(shape.getArea());
		System.out.println(shape);
		
		shape = new Circle(2);
		System.out.println(shape.getArea());
		System.out.println(shape);
		
	//	System.out.println(test1);
		/*
		 * test1 = new Rectangle(test2); //this is a reference copy, we are copying the
		 * address of the object //test1.setHeight(9); test2.print();
		 * System.out.println("test2: "+test2); //compare objects if
		 * (test1.equals(test2)) { //it does not work as it should, why? Because it
		 * compares two memory address, not //the values in the objects
		 * System.out.println("they are equal"); } if (test1==test2) {
		 * System.out.println("they are equal according to =="); }else
		 * System.out.println("they are not equal accroding to ==");
		 */
		/*
		 * r1 = new Rectangle(-5,10); r1.print(); r1.setWidth(2000);
		 * System.out.println("r1 width ="+ r1.getWidth()); Rectangle r2 = new
		 * Rectangle(5,4); r2.print(); Rectangle r3 = new Rectangle(-1, 1000);
		 * r3.print();
		 */
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
      
    }
}
