package guiswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class CircleFrame extends JFrame {
	public CircleFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("First Frame Example");
		setBounds(100,100,500,500);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		JPanel panCenter = new JPanel();
		panCenter.setBackground(Color.RED);
		JPanel panSouth = new JPanel();
		panSouth.setBackground(Color.WHITE);
		JButton btnOK = new JButton("OK");
		panSouth.add(btnOK);
		c.add(panCenter, BorderLayout.CENTER);
		c.add(panSouth, BorderLayout.SOUTH);
	}
}
public class FramePractice2 {
	public static void main(String[] args) {
		CircleFrame cf = new CircleFrame();
		cf.setVisible(true);
	}
}

