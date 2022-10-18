import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Shapes
{
  private JFrame frame;
  private JButton line;
  private JButton rectangle;
  private JButton circle;
  private JButton oval;
  private JPanel drawingPanel;
  public String choice = "";

  public Shapes()
  {
    ButtonPress buttonPress = new ButtonPress();

    GridLayout grid = new GridLayout(2, 2);
    JPanel buttonPad = new JPanel(grid);
    this.drawingPanel = new DrawingPanel();
    this.drawingPanel.setPreferredSize(new Dimension(400, 400));

    frame = new JFrame("Shapes");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = frame.getContentPane();
    frame.getRootPane().setBorder(BorderFactory.createLineBorder(Color.blue));
    frame.getRootPane().setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    contentPane.setLayout(new BorderLayout());

    contentPane.add(buttonPad, BorderLayout.WEST);
    contentPane.add(drawingPanel, BorderLayout.CENTER);
    drawingPanel.setBorder(BorderFactory.createLineBorder(Color.pink));

    this.line = new JButton("Line");
    this.rectangle = new JButton("Rectangle");
    this.circle = new JButton("Circle");
    this.oval = new JButton("Oval");

    buttonPad.add(this.line);
    buttonPad.add(this.rectangle);
    buttonPad.add(this.circle);
    buttonPad.add(this.oval);

    this.line.addActionListener(buttonPress);
    this.rectangle.addActionListener(buttonPress);
    this.circle.addActionListener(buttonPress);
    this.oval.addActionListener(buttonPress);

  }

  private void display()
  {
    frame.pack();
    frame.setVisible(true);
  }

  private class ButtonPress implements ActionListener
  {
    @Override
    public void actionPerformed(ActionEvent e)
    {
      if (e.getActionCommand().equals("Line"))
      {
        System.out.println("line");
        choice = "Line";
      }
      else if (e.getActionCommand().equals("Rectangle"))
      {
        choice = "Rectangle";
        System.out.println("rectangle");
      }
      else if (e.getActionCommand().equals("Circle"))
      {
        System.out.println("circle");
        choice = "Circle";
      }
      else if (e.getActionCommand().equals("Oval"))
      {
        System.out.println("oval");
        choice = "Oval";
      }

      drawingPanel.repaint();
            
        }
        
    }
    
   
    private class DrawingPanel extends JPanel {
        /**
         * 
         */
        private static final long serialVersionUID = -2737129014253510573L;
        
        
        
        
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Random random = new Random();
            
            switch(choice) {
                case "Line": 
                    g.drawLine(random.nextInt(400), random.nextInt(400), random.nextInt(400), random.nextInt(400));
                    break;
                case "Rectangle":
                    g.drawRect(random.nextInt(400), random.nextInt(400), random.nextInt(400), random.nextInt(400));
                    break;
                case "Circle":
                    g.drawOval(random.nextInt(400), random.nextInt(400), 30, 30);
                    break;
                case "Oval":
                    g.drawOval(random.nextInt(400), random.nextInt(400), 30, 40);
                    break;
            }
            
        }
    }

    public static void main(String[] args) {
        new Shapes().display();
    }



}
