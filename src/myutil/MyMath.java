package myutil;
/**
 * @author Fadi Wedyan
 * This is a class demo on how to use JavaDoc
 * The class contains some math functions\
 * @version 1 
 * @date February 7, 2024
 */
public class MyMath {
	
	/**
	 * 
	 * @param c - value for temperature  to Celsius 
	 * @return temperature  in Fahrenheit
	 */
	public static int CtoF(int c) {
		int  f =  (int)( c*1.8 + 32 );
		return f;
	}
	public static double FtoC(int F){
		int C = (int) ( (F-32)/1.8 );
		return C;
	}

	public static double f1(double u, double t, double a){
		double s = (u*t)+(0.5*a*t*t);
		return s;
	}
	
	public static double d(double u, double v, double t){
		double d = ((u+v)/2)*t;
		return d;
	}
	
	/**
	 * 
	 * @param r Cylinder radius 
	 * @param h Cylinder height
	 * @return area of the Cylinder
	 * both radius and height should be larger or equal to 0. 
	 *  Invalid input returns -1. 
	 */
	public static double areaOfCylinder(double r, double h){
		if ((int) r<0 && (int) h<0) {
			return -1;
		}
		double area = (2*Math.PI*Math.pow(r, 2)*r)+2*Math.PI*r*h;
		return area;
	}

}
