import java.awt.Color;
import java.awt.Container;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JustALabel {
    private JFrame frame;

    public JustALabel() {
        frame = new JFrame("Just A Label");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();      
        contentPane.add(new JLabel("Top Text"));
        frame.getRootPane().setBorder(BorderFactory.createLineBorder(Color.pink));
    }

    private void display() {
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new JustALabel().display();
    }
}
