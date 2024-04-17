package guiswing;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;

public class FramePractice {
    public static void main(String[] args) {
        JFrame frm = new JFrame();
        frm.setTitle("My first UI");
        Container c = frm.getContentPane();
        c.setLayout(new BorderLayout());
        JButton btnPressMe = new JButton("Press me");
        c.add(btnPressMe,BorderLayout.CENTER);
        JPanel panSouth = new JPanel();
        JLabel label = new JLabel("Hello");
        panSouth.add(label);
        c.add(panSouth,BorderLayout.SOUTH);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setBounds(100,100,400,400);
        frm.setVisible(true);
    }
}

