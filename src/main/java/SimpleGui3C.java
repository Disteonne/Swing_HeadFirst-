/*
import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleGui3C implements ActionListener {
    JFrame frame;
    public static void main(String[] args) {
        SimpleGui3C simpleGui3C= new SimpleGui3C();
        simpleGui3C.go();
    }

    public void go(){
        frame= new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button= new JButton("Change color");
        button.addActionListener(this);

        frame.getContentPane().add(BorderLayout.SOUTH,button);

        MyDrawPanel mp= new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.CENTER,mp);
        frame.setSize(300,300);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        frame.repaint();
    }


}
class MyDrawPanel extends JPanel{
    public void paintComponents(Graphics g){
        g.fillRect(0,0,this.getWidth(),this.getHeight());

        int red= (int) (Math.random()*255);
        int green=(int) (Math.random()*255);
        int blue=(int) (Math.random()*255);
        Color color1=new Color(red,green,blue);

        g.setColor(color1);
        g.fillOval(70,70,100,100);


 */
        /*
        Graphics2D graphics2D=(Graphics2D) g;
        int red= (int) Math.random()*255;
        int green=(int) Math.random()*255;
        int blue=(int) Math.random()*255;
        Color color1=new Color(red,green,blue);

        red= (int) Math.random()*255;
        green=(int) Math.random()*255;
        blue=(int) Math.random()*255;
        Color color2=new Color(red,green,blue);

        GradientPaint gradientPaint= new GradientPaint(70,70,color1,150,150,color2);
        graphics2D.setPaint(gradientPaint);
        graphics2D.fillOval(70,70,100,100);
         */

  //  }
//}


