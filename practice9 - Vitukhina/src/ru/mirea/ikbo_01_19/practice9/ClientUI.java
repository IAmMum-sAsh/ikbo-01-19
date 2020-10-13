package ru.mirea.ikbo_01_19.practice9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientUI extends JFrame {
    public ClientUI(){
        super("Оформление заказа");
        setSize( 350,500);
        setLayout(null);
        setLocationRelativeTo(null);

        Font fnt = new Font("Times New Roman", Font.PLAIN, 18);

        JLabel l1 = new JLabel("Введите ФИО пользователя:");
        l1.setLocation(40,20);
        l1.setSize(250,50);
        l1.setFont(fnt);
        add(l1);

        JTextField tf1 = new JTextField(50);
        tf1.setLocation(40, 80);
        tf1.setSize(250, 30);
        tf1.setFont(fnt);
        add(tf1);

        JLabel l2 = new JLabel("Введите ИНН:");
        l2.setLocation(40,120);
        l2.setSize(250,50);
        l2.setFont(fnt);
        add(l2);

        JTextField tf2 = new JTextField(50);
        tf2.setLocation(40, 180);
        tf2.setSize(250, 30);
        tf2.setFont(fnt);
        add(tf2);

        JLabel res = new JLabel();
        res.setLocation(50,310);
        res.setSize(250,100);
        res.setFont(fnt);
        res.setHorizontalAlignment(JLabel.CENTER);
        add(res);

        JButton b = new JButton("Оформить");
        b.setLocation(100, 250);
        b.setSize(150, 40);
        b.setFont(fnt);
        add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String mess = Test.checkClient(tf1.getText(), tf2.getText());
                res.setText(mess);
            }
        });

        JButton bLog = new JButton("Внести");
        bLog.setLocation(220, 430);
        bLog.setSize(110, 30);
        bLog.setFont(fnt);
        add(bLog);

        bLog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                Database.setClient(tf1.getText(), tf2.getText());
                tf1.setText(""); tf2.setText("");
            }
        });

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
