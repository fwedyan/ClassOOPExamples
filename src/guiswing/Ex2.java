package guiswing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyFrame extends JFrame{
	JLabel label = new JLabel("Add Number");
	JLabel label2 = new JLabel("Result");
	JButton b1 = new JButton("Add number");
	JButton b2 = new JButton("find average");
	JTextField txt1 = new JTextField();
	JTextField txt2 = new JTextField();
	double sum=0;
	int counter=0;
	MyFrame(){
		setTitle("Average of numbers");
		setLayout(new GridLayout(3,2));

		add(label); add(txt1);
		add(b1); add(b2);
		add(label2); add(txt2);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sum+=Integer.parseInt(txt1.getText());
				txt1.setText("");
				++counter;
			}
		});

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt2.setText((sum/counter)+"");
			}});
	}
}
public class Ex2 {
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 250);
		frame.setVisible(true);    } }

