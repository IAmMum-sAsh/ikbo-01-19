package ru.mirea.ikbo_01_19.practice4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test extends JFrame {
    protected int golsOfDin = 0;
    protected int golsOfAv = 0;

    protected JPanel p = new JPanel();

    protected JButton av = new JButton("Vanguard");
    protected JButton din = new JButton("Dynamo");

    protected JLabel lastgol = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
    protected JLabel tablo = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
    protected JLabel winner = new JLabel("Winner: DRAW", SwingConstants.CENTER);

    protected Font fnt = new Font("Courier New",Font.BOLD,17);

    Test(){
        super("Only Maltsev! Only Dynamo!");
        setLayout(new BorderLayout());
        setSize(500,500);
        setLocationRelativeTo(null);

        JPanel pc = new JPanel();
        pc.setBackground(new Color(175, 238, 238));
        add(pc, BorderLayout.CENTER);
        pc.setLayout(new GridLayout(3,1));
        pc.add(lastgol);
        pc.add(tablo);
        pc.add(winner);
        lastgol.setFont(fnt);
        tablo.setFont(fnt);
        winner.setFont(fnt);

        add(av, BorderLayout.WEST);
        av.setFont(fnt);
        av.setBackground(new Color(70, 130, 180));
        av.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent a){}
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
            public void mouseClicked(MouseEvent a) {
                golsOfAv+=1;
                lastgol.setText("Last Scorer: Vanguard");
                tablo.setText("Result: " + golsOfAv + " X " + golsOfDin);
                if (golsOfAv > golsOfDin){winner.setText("Winner: VANGUARD");}
                else if (golsOfAv == golsOfDin){winner.setText("Winner: DRAW");}
            }
        });

        add(din, BorderLayout.EAST);
        din.setFont(fnt);
        din.setBackground(new Color(70, 130, 180));
        din.addMouseListener(new MouseListener() {
            public void mouseExited(MouseEvent a){}
            public void mouseEntered(MouseEvent a) {}
            public void mouseReleased(MouseEvent a) {}
            public void mousePressed(MouseEvent a) {}
            public void mouseClicked(MouseEvent a) {
                golsOfDin+=1;
                lastgol.setText("Last Scorer: Dynamo");
                tablo.setText("Result: " + golsOfAv + " X " + golsOfDin);
                if (golsOfDin > golsOfAv){winner.setText("Winner: DYNAMO");}
                else if (golsOfAv == golsOfDin){winner.setText("Winner: DRAW");}
            }
        });

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[]args) {
        new Test();
    }
}