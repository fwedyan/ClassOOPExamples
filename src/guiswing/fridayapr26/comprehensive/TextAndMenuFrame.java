package guiswing.fridayapr26.comprehensive;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAndMenuFrame extends JFrame {
    private Story story;
    private JTextArea tarStory;
    public void setupMenu() {
        JMenuBar mbar = new JMenuBar();
        setJMenuBar(mbar);
        JMenu mnuFile = new JMenu("File");
        mbar.add(mnuFile);
        JMenuItem miLoad = new JMenuItem("Load story");
        miLoad.addActionListener( 
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFileChooser chooser = new JFileChooser();
                        File f;
                        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                            f = chooser.getSelectedFile();
                            StoryReader.readFromText(f, story);
                            //tarStory.setText(story.toString());
                            repaint();
                        }
                    }
                }
        );
        JMenuItem miSave = new JMenuItem("Save story");
        miSave.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        File f;
                        JFileChooser chooser = new JFileChooser();
                        if (chooser.showSaveDialog(null)==JFileChooser.APPROVE_OPTION) {
                            f = chooser.getSelectedFile();
                            StoryWriter.writeToFile(story, f);
                        }
                    }
                }
        );
        JMenuItem miExit = new JMenuItem("Exit");
        miExit.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                }
        );
        mnuFile.add(miLoad);
        mnuFile.add(miSave);
        mnuFile.add(miExit);
        JMenu mnuTools = new JMenu("Tools");
        mbar.add(mnuTools);
        JMenuItem miClear = new JMenuItem("Clear");
        miClear.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        story.clearSentences();
                       // tarStory.setText(story.toString());
                        repaint();
                    }
                }
        );
        mnuTools.add(miClear);
    }
    public void setupGUI() {
        setTitle("Story Board");
        setBounds(100,100,500,500);
        setupMenu();
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        tarStory = new JTextArea();
        c.add(tarStory,BorderLayout.CENTER);
        JPanel panSouth = new JPanel();
        panSouth.setLayout(new FlowLayout());
        c.add(panSouth,BorderLayout.SOUTH);
        JLabel lblEnter = new JLabel("Enter sentence: ");
        JTextField txtSentence = new JTextField(20);
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String text = txtSentence.getText().trim();
                        if (!text.isBlank()) {
                            story.addSentence(text);
                         //   tarStory.setText(story.toString());
                            txtSentence.setText("");
                            repaint();
                        }
                    }
                }
        );
        panSouth.add(lblEnter);
        panSouth.add(txtSentence);
        panSouth.add(btnSubmit);
    }
    public TextAndMenuFrame(Story story) {
        this.story = story;
        setupGUI();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void paint(Graphics g) {
        tarStory.setText(story.toString());
        super.paint(g);
    }
}


