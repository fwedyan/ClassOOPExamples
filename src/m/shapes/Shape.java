package m.shapes;

public abstract class Shape {
	private String color;
	private boolean filled;
	public Shape(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}
	
	public Shape() {	
		color = "black";
		filled = false;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the filled
	 */
	public boolean isFilled() {
		return filled;
	}
	/**
	 * @param filled the filled to set
	 */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String toString(){
		return "Color: "+ color+ ",Filled: "+filled;
	}
	public abstract double getArea();
		//The behavior is defined, but how to implement the behavior is not known yet
		
	

}
