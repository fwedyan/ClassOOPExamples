package guiswing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class FridayExample extends JFrame {
	
	//create the RadioButtons
	JRadioButton radYes = new JRadioButton("Yes");
	JRadioButton radNo = new JRadioButton("No");
	JRadioButton radCard = new JRadioButton("Credit Card");
	JRadioButton radCash = new JRadioButton("Cash");
	JRadioButton radOther = new JRadioButton("Other");
	
	//create two groups of radio buttons
	ButtonGroup buttonGroupRegistered  = new ButtonGroup();
	ButtonGroup buttonGroupPayment  = new ButtonGroup();
	
	JLabel lblFirst = new JLabel("First Name");
	JLabel lblLast = new JLabel("Last Name");
	JLabel lblPassword = new JLabel("Password");

	

	JTextField txtFirst = new JTextField(10);
	JTextField txtLast = new JTextField(15);
	JTextField txtPassword = new JPasswordField(10);

	JButton btnDisplay = new JButton("Display Info");
	JButton btnClear = new JButton("Clear");
	JButton btnLogin = new JButton("Login");
	JButton btnCreate = new JButton("Create Account");
	
	FridayExample() {	
		//add the radio buttons to the groups, yes and no in the first group, and the payment methods in
		// the second group
		buttonGroupRegistered.add(radYes);
		buttonGroupRegistered.add(radNo);
		
		buttonGroupPayment.add(radCard);
		buttonGroupPayment.add(radCash);
		buttonGroupPayment.add(radOther);
		
		setLayout(new BorderLayout(5,5));	 
		JPanel pnlInfo = new JPanel();
		pnlInfo.setLayout(new GridLayout(3,0));
		pnlInfo.add(lblFirst);
		pnlInfo.add(txtFirst);
		pnlInfo.add(lblLast);
		pnlInfo.add(txtLast);
		pnlInfo.add(lblPassword);
		pnlInfo.add(txtPassword);

		JPanel pnlRegistered = new JPanel(new GridLayout(2, 1));
		pnlRegistered.setBorder(new TitledBorder("Already registered?"));
		pnlRegistered.add(radYes);
		pnlRegistered.add(radNo);

		JPanel pnlPayment = new JPanel(new GridLayout(3, 1));
		pnlPayment.setBorder(new TitledBorder("Payment Info"));
		pnlPayment.add(radCard);
		pnlPayment.add(radCash);
		pnlPayment.add(radOther);

		JPanel pnlNorth = new JPanel(new GridLayout(0,3));
		pnlNorth.add(pnlInfo);
		pnlNorth.add(pnlRegistered);
		pnlNorth.add(pnlPayment);

		JPanel pnlCenter = new JPanel(new FlowLayout());
		pnlCenter.add(btnDisplay);
		pnlCenter.add(btnClear);
		pnlCenter.add(btnCreate);
		pnlCenter.add(btnLogin);

		add(pnlNorth, BorderLayout.NORTH);
		add(pnlCenter, BorderLayout.CENTER);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFirst.setText("");
				txtLast.setText("");
				txtPassword.setText("");
				radCard.setSelected(false);
				radCash.setSelected(false);
				radOther.setSelected(false);
				radYes.setSelected(false);
				radNo.setSelected(false);
				repaint();
			}
		});

		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("First Name:"+txtFirst.getText());
				System.out.println("Lastname: "+txtLast.getText());
				if (radYes.isSelected())
					System.out.println("Registered: Yes");
				else
					System.out.println("Registered: No");	 
				if (radCard.isSelected())
					System.out.println("Payement: Card");
				else if (radCash.isSelected())
					System.out.println("Payement: Cash");
				else
					System.out.println("Payment: Other");			  
			}
		});	    
	}
	public static void main(String[] args) {
		FridayExample app = new FridayExample();
		app.setTitle("Create an Account");
		app.setVisible(true);
		app.setSize(500,200);		//app.pack();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setLocationRelativeTo(null); // Center the frame
	}
}
