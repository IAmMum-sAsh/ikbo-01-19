package ru.mirea.ikbo_01_19.lab5;

import java.awt.*;
import javax.swing.*;

public class PaintTest extends JFrame {
    public PaintTest() {
        super( "Фигурки" );
        setSize( 1000,700);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint( Graphics g ) {
        for(int i = 0; i<20; i++){
            int sh = (int) (Math.random() * 3);
            switch(sh) {
                case 0:
                    Rectangle a = new Rectangle(this.getWidth(), this.getHeight());
                    g.setColor(new Color(a.getR(), a.getG(), a.getB()));
                    g.fillRect(a.getX(), a.getY(), a.getWidth(), a.getHeight());
                    break;
                case 1:
                    RoundRectangle b = new RoundRectangle(this.getWidth(), this.getHeight());
                    g.setColor(new Color(b.getR(), b.getG(), b.getB()));
                    g.fillRoundRect(b.getX(), b.getY(), b.getWidth(), b.getHeight(), b.getArcWidth(), b.getArcHeight());
                    break;
                case 2:
                    Oval c = new Oval(this.getWidth(), this.getHeight());
                    g.setColor(new Color(c.getR(), c.getG(), c.getB()));
                    g.fillOval(c.getX(), c.getY(), c.getWidth(), c.getHeight());
                    break;
                default:
                    break;
            }
        }
    }

    public static void main( String[] args ) {
        new PaintTest();
    }
}