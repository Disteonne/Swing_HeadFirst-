/*
import java.awt.*;
import javax.swing.*;
public class GradientPrint extends JPanel {
    public void paintComponent( Graphics g){
        Graphics2D g2d= (Graphics2D) g;
        GradientPaint gradientPaint=new GradientPaint(70,70,Color.magenta,150,150,Color.red);
        g2d.setPaint(gradientPaint);
        g2d.fillOval(70,70,100,100);
    }
 */

/*          ЗАДАЕМ ЦВЕТА ПРОИЗВОЛЬНО
    public void paintComponent( Graphics g) {
        Graphics2D g2d= (Graphics2D) g;
        int red=(int) (Math.random()*255);
        int green=(int) (Math.random()*255);
        int blue=(int) (Math.random()*255);
        Color color1= new Color(red,green,blue);

        red=(int) (Math.random()*255);
        green=(int) (Math.random()*255);
        blue=(int) (Math.random()*255);
        Color color2= new Color(red,green,blue);
        GradientPaint gradientPaint=new GradientPaint(70,70,color1,150,150,color2);
        g2d.setPaint(gradientPaint);
        g2d.fillOval(70,70,100,100);

    }

 */

//}
