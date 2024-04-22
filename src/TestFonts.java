import java.awt.Font;

import myutil.MyUtil;

public class TestFonts {

	public static void main(String[] args) {
		
		String []fonts = MyUtil.getFontNames();
		for (int i=0;i<fonts.length;i++) {
			Font myFont = new Font(fonts[i], Font.BOLD+Font.ITALIC, 12);
			
		}

	}

}
