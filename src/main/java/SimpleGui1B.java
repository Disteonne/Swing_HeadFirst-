/*
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class SimpleGui1B implements  ActionListener{
    JButton button;

    public static void main(String[] args) {
        SimpleGui1B simpleGui1B= new SimpleGui1B();
        simpleGui1B.go();


    }

    public void go(){
        JFrame jFrame= new JFrame();
        //button= new JButton("click me");

        //button.addActionListener(this);


        //jFrame.getContentPane().add(button);

        MyDrawPanel myDrawPanel= new MyDrawPanel();
        jFrame.getContentPane().add(BorderLayout.CENTER,myDrawPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300,300);
        jFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        button.setText("I`ve been clicked!");
    }


}
class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        g.setColor(Color.PINK);
        g.fillRect(100, 50, 100, 100);
    }
}
 */