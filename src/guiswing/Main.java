package guiswing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Main extends JFrame {
	JLabel lblFirst = new JLabel("First Number");
	JLabel lblSecond = new JLabel("Second Number");
	JTextField txtNumber1 = new JTextField(8);
	JTextField txtNumber2 = new JTextField(8);
	JTextField txtResult = new JTextField();
	JButton btnCompute = new JButton("Power");
	JButton btnClear = new JButton("Clear");
	Main() {
		setLayout(new GridLayout(3,1));	
	    JPanel pnlOne = new JPanel();
	    pnlOne.setLayout(new GridLayout(1,0));
	    pnlOne.add(lblFirst);
	    pnlOne.add(txtNumber1);
	    pnlOne.add(lblSecond);
	    pnlOne.add(txtNumber2);
	    add(pnlOne);
	    JPanel pnlTwo = new JPanel();
	    pnlTwo.setLayout(new GridLayout(1,2));
	    pnlTwo.add(btnCompute);
	    pnlTwo.add(btnClear);
	    add(pnlTwo);
	    add(txtResult);
	    btnCompute.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
               int num1; int num2;
               try{
            	   num1 = Integer.parseInt(txtNumber1.getText());
                   num2 = Integer.parseInt(txtNumber2.getText());
                   int num3 =(int) Math.pow(num1,num2);
                   txtResult.setText(num3+"");
               }
               catch (Exception ex){
            	   txtResult.setText("invalid number format");
               }
               
	    	   
	    	}
	    });
	    btnClear.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		txtNumber1.setText("");
	    		txtNumber2.setText("");
	    		txtResult.setText("");
	    	}
	    });
	    
	}
	public static void main(String[] args) {
		Main app = new Main();
		app.setVisible(true);
		app.setSize(400,150);
		//app.pack();
	    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    app.setResizable(false);

	}
}

