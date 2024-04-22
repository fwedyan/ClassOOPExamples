package guiswing;

import javax.swing.*;
import java.awt.*;

public class TestImageIcon extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//use forward slash (even for windows)
	private ImageIcon usIcon = new ImageIcon("C:/Users/fwedyan/Pictures/usflag.jpg");
	

	public TestImageIcon() {
		setLayout(new GridLayout(1, 2, 5, 5));
		add(new JLabel(usIcon));
		JButton jbt = new JButton( usIcon);
		add(jbt);
		
	
	}

	/** Main method */
	public static void main(String[] args) {
		TestImageIcon frame = new TestImageIcon();
		frame.setTitle("TestImageIcon");
		frame.setSize(500, 125);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
