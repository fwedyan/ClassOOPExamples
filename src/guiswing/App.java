package guiswing;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.JButton;
    import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        DrawingFrame frm = new DrawingFrame();
         frm.setVisible(true);
    

}}

    
 class DrawingFrame extends JFrame {
        private void setupGUI() {
            setTitle("Drawing Frame");
            Container c = getContentPane();
            c.setLayout(new BorderLayout());
            JButton btnSouth = new JButton("Press Me");
            c.add(btnSouth,BorderLayout.SOUTH);
            DrawingPanel pan = new DrawingPanel();
            c.add(pan,BorderLayout.CENTER);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100,100,500,500);
        }
        public DrawingFrame() {
            setupGUI();
        }
    }
    class DrawingPanel extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawOval(10,10,100,50);
            g.setColor(Color.RED);
            g.fillRect(50,100,75,100);
            g.setFont(new Font("Arial",Font.BOLD,16));
            g.drawString("Hello. How are you?",150,300);
            try {
                BufferedImage img = ImageIO.read(new File("C:\\Users\\fwedyan\\Pictures\\usflag.jpg"));
                g.drawImage(img,150,60,null);
            } catch (Exception ex) {
                
            }
        }
    }
