import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;

public class TwoButtons {
    JFrame frame;
    JLabel label;
    public static void main(String[] args) {
        TwoButtons twoButtons=new TwoButtons();
        twoButtons.go();
    }

    public void go(){
        frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton= new JButton("Change Label");
        labelButton.addActionListener(new LabelListener());

        JButton colorButton= new JButton("Change color");
        colorButton.addActionListener(new ColorListener());

        label= new JLabel("I am a label");
        MyDrawPanel myDrawPanel=new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.SOUTH,colorButton);
        frame.getContentPane().add(BorderLayout.CENTER,myDrawPanel);
        frame.getContentPane().add(BorderLayout.EAST,labelButton);
        frame.getContentPane().add(BorderLayout.WEST,label);

        frame.setSize(300,300);
        frame.setVisible(true);

    }

    class  LabelListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            label.setText("Ouch!");
        }
    }
    class ColorListener implements  ActionListener{
        public void actionPerformed(ActionEvent e) {
            frame.repaint();
        }
    }
}

class MyDrawPanel extends JPanel {
    public void paintComponents(Graphics g) {
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        Color color1 = new Color(red, green, blue);

        g.setColor(color1);
        g.fillOval(70, 70, 100, 100);
    }
}