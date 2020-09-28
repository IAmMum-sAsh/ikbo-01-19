package ru.mirea.ikbo_01_19.lab6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Test extends JFrame{
    public Test(){
        super( "Редоктор" );
        setSize( 700,500);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        JFrame f = new JFrame();

        JMenuBar menu = new JMenuBar();

            JMenu fontSection = new JMenu("Шрифт");

            JMenuItem tnr = new JMenuItem("Times New Roman");
            fontSection.add(tnr);
            JMenuItem ss = new JMenuItem("SimSun");
            fontSection.add(ss);
            JMenuItem cur = new JMenuItem("Courier New");
            fontSection.add(cur);

            menu.add(fontSection);


            JMenu colorSection = new JMenu("Цвет");

            JMenuItem black = new JMenuItem("Чёрный");
            colorSection.add(black);
            JMenuItem teal = new JMenuItem("Бирюзовый");
            colorSection.add(teal);
            JMenuItem red = new JMenuItem("Красный");
            colorSection.add(red);

            menu.add(colorSection);

        setJMenuBar(menu);

        Font fTNR = new Font("Times New Roman", Font.PLAIN, 16);
        Font fSS = new Font("SimSun", Font.PLAIN, 16);
        Font fCUR = new Font("Courier New", Font.PLAIN, 16);

        JTextArea text = new JTextArea("Текст для редактирования", 20, 60);
        text.setFont(fTNR);
        text.setLineWrap(true);
        add(text);

        tnr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                text.setFont(fTNR);
            }
        });
        ss.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                text.setFont(fSS);
            }
        });
        cur.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                text.setFont(fCUR);
            }
        });

        black.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                text.setForeground(new Color(0,0,0));
            }
        });
        teal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                text.setForeground(new Color(0,128,128));
            }
        });
        red.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                text.setForeground(new Color(205, 92, 92));
            }
        });

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        new Test();
    }
}