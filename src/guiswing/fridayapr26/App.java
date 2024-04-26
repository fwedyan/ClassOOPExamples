package guiswing.fridayapr26;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
class TextFrame extends JFrame {
    private JTextArea tarMessage;
    private JTextField txtToAdd;
    public TextFrame() {
        setTitle("Text Component Fun");
        setBounds(100,100,500,500);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        JPanel panSouth = new JPanel();
        panSouth.setLayout(new FlowLayout());
        JLabel lblText = new JLabel("Enter text:");
        panSouth.add(lblText);
        txtToAdd = new JTextField(30);
        panSouth.add(txtToAdd);
        JButton btnAdd = new JButton("Add");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String message = tarMessage.getText();
                tarMessage.setText(message + "\n" + txtToAdd.getText());
            }
        });
        panSouth.add(btnAdd);
        tarMessage = new JTextArea();
        c.add(tarMessage,BorderLayout.CENTER);
        c.add(panSouth,BorderLayout.SOUTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

//Here is the main class, which simply creates the TextFrame and shows it.
public class App {
    public static void main(String[] args) throws Exception {
        TextFrame textFrame = new TextFrame();
        textFrame.setVisible(true);
    }
}
