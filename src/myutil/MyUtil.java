package myutil;

import java.awt.GraphicsEnvironment;

public class MyUtil {
	
	/**
	 * Finding All Available Font Names
	 * @return Array of strings, holding fonts defined on your machine
	 */
	
	public static String[] getFontNames() {
		GraphicsEnvironment e = 
				GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] fontnames =   e.getAvailableFontFamilyNames();
		for (int i = 0; i < fontnames.length; i++)
			System.out.println(fontnames[i]);
		return fontnames;
	}
	

}
