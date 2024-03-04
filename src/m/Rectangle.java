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
public class Rectangle {
	private int height=1;  // explain what it means ...
	private int width=1;
	public Rectangle() throws Exception{
		//width=height =1;
		this(1,1); //can only be in a constructor, has to be the first statement in the constructor
	}
	public Rectangle(int height, int width) throws Exception {
		setWidth(width);
		setHeight(height);
	}
	
	public void print() {
		System.out.println("width = "+this.width+ " , height = "+ this.height+ " , area ="+this.area());		
	}
	public int area() {
		return this.height * this.width;
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
	 * @return the value is set if valid [1,20], othewise, the method does nothing
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
	
	
    public static void main(String s[] ){
       Rectangle r1;
	try {
		Rectangle test1 = new Rectangle(5,10);
		Rectangle test2 = new Rectangle(20,30);
		test1 = test2;
		
				
		r1 = new Rectangle(-5,10);
		 r1.print();
	       r1.setWidth(2000);
	       System.out.println("r1 width ="+ r1.getWidth());
	       Rectangle r2 = new Rectangle(5,4);
	       r2.print();
	       Rectangle r3 = new Rectangle(-1, 1000);
	       r3.print();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
      
    }
}
