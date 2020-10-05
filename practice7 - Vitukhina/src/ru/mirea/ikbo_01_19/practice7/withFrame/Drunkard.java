package ru.mirea.ikbo_01_19.practice7.withFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;

public class Drunkard extends JFrame {
    protected boolean start = true;
    protected String[] array1 = new String[10];
    protected String[] array2 = new String[10];
    protected int ar1Last = -1;
    protected int ar2Last = -1;
    protected int count = 1;

    public void printCards(JLabel firstOpen, JLabel secondOpen, JLabel firstCards, JLabel secondCards){
        firstOpen.setText(array1[0]);
        secondOpen.setText(array2[0]);
        firstCards.setText("<html>" + array1[0] + "<br>" + array1[1] + "<br>" + array1[2] + "<br>" + array1[3] + "<br>" + array1[4] + "<br>" + array1[5] + "<br>" + array1[6] + "<br>" + array1[7] + "<br>" + array1[8] + "<br>" + array1[9] + "</html>");
        secondCards.setText("<html>" + array2[0] + "<br>" + array2[1] + "<br>" + array2[2] + "<br>" + array2[3] + "<br>" + array2[4] + "<br>" + array2[5] + "<br>" + array2[6] + "<br>" + array2[7] + "<br>" + array2[8] + "<br>" + array2[9] + "</html>");
    }

    public void update(String[] arrWin, String[] arrLos, int winLast, int losLast, String f, String s){
        for(int i=0; i<winLast; i++){
            arrWin[i] = arrWin[i+1];
        }
        arrWin[winLast] = f;
        arrWin[winLast+1] = s;

        for(int i=0; i<losLast; i++){
            arrLos[i] = arrLos[i+1];
        }
        arrLos[losLast] = "x";

    }

    public Drunkard(){
        super( "Drunkard" );
        setSize( 500,500);
        setLayout(null);
        setLocationRelativeTo(null);

        Font bigF = new Font("Courier New", Font.PLAIN, 50);
        Font smallF = new Font("Courier New", Font.PLAIN, 20);

        JLabel firstCards = new JLabel();
        JLabel secondCards = new JLabel();
        JLabel firstName = new JLabel("First");
        JLabel secondName = new JLabel("Second");
        JLabel firstOpen = new JLabel();
        JLabel secondOpen = new JLabel();
        JLabel winner = new JLabel("Move: 1");

        firstCards.setSize(50, 350);
        firstCards.setLocation(20,20);
        firstCards.setOpaque(true);
        firstCards.setBackground(new Color(0,128,128));
        firstCards.setFont(smallF);
        firstCards.setHorizontalAlignment(JLabel.CENTER);
        add(firstCards);

        secondCards.setSize(50, 350);
        secondCards.setLocation(this.getWidth()-80, 20);
        secondCards.setOpaque(true);
        secondCards.setBackground(new Color(0,128,128));
        secondCards.setFont(smallF);
        secondCards.setHorizontalAlignment(JLabel.CENTER);
        add(secondCards);

        firstName.setSize(130, 20);
        firstName.setLocation(100, 25);
        firstName.setOpaque(true);
        firstName.setBackground(new Color(60, 179, 113));
        firstName.setFont(smallF);
        firstName.setHorizontalAlignment(JLabel.CENTER);
        add(firstName);

        secondName.setSize(130, 20);
        secondName.setLocation(this.getWidth()-240, 25);
        secondName.setOpaque(true);
        secondName.setBackground(new Color(60, 179, 113));
        secondName.setFont(smallF);
        secondName.setHorizontalAlignment(JLabel.CENTER);
        add(secondName);

        firstOpen.setSize(130, 200);
        firstOpen.setLocation(100, 50);
        firstOpen.setOpaque(true);
        firstOpen.setBackground(new Color(240, 128, 128));
        firstOpen.setFont(bigF);
        firstOpen.setHorizontalAlignment(JLabel.CENTER);
        add(firstOpen);

        secondOpen.setSize(130, 200);
        secondOpen.setLocation(this.getWidth()-240, 50);
        secondOpen.setOpaque(true);
        secondOpen.setBackground(new Color(240, 128, 128));
        secondOpen.setFont(bigF);
        secondOpen.setHorizontalAlignment(JLabel.CENTER);
        add(secondOpen);

        winner.setSize(200, 70);
        winner.setLocation(150, 285);
        winner.setOpaque(true);
        winner.setBackground(new Color(153, 50, 204));
        winner.setFont(smallF);
        winner.setHorizontalAlignment(JLabel.CENTER);
        winner.setVisible(false);
        add(winner);

        JTextField firstSet = new JTextField();
        JTextField secondSet = new JTextField();

        firstSet.setSize(150, 30);
        firstSet.setLocation(80, 300);
        firstSet.setOpaque(true);
        firstSet.setBackground(new Color(222, 184, 135));
        firstSet.setFont(smallF);
        firstSet.setHorizontalAlignment(JLabel.CENTER);
        add(firstSet);

        secondSet.setSize(150, 30);
        secondSet.setLocation(this.getWidth()-240, 300);
        secondSet.setOpaque(true);
        secondSet.setBackground(new Color(222, 184, 135));
        secondSet.setFont(smallF);
        secondSet.setHorizontalAlignment(JLabel.CENTER);
        add(secondSet);

        JButton b = new JButton("Press!");

        b.setSize(150, 50);
        b.setLocation(175, 400);
        b.setOpaque(true);
        b.setBackground(new Color(127, 255, 212));
        b.setFont(smallF);
        b.setHorizontalAlignment(JButton.CENTER);
        b.setVerticalTextPosition(JButton.CENTER);
        add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if(start){
                    if(firstSet.getText().length() > 0 && secondSet.getText().length() > 0){
                        char[] a1 = firstSet.getText().toCharArray();
                        char[] a2 = secondSet.getText().toCharArray();
                        for(int i = 0; i < firstSet.getText().length(); i++){if(a1[i] !=  ' ') {ar1Last++; array1[ar1Last] = Character.toString(a1[i]);}}
                        for(int i = 0; i < secondSet.getText().length(); i++){if(a2[i] != ' ') {ar2Last++; array2[ar2Last] = Character.toString(a2[i]);}}
                        for(int i = ar1Last+1; i < 10; i++){array1[i] = "x";}
                        for(int i = ar2Last+1; i < 10; i++){array2[i] = "x";}

                        firstSet.setVisible(false); secondSet.setVisible(false); winner.setVisible(true); start = false;
                        b.setSize(150, 50);
                        b.setLocation(175, 400);
                        b.setText("Press!");

                        printCards(firstOpen, secondOpen, firstCards, secondCards);
                        count++;
                    }
                    else{
                        b.setSize(300, 50);
                        b.setLocation(100, 400);
                        b.setText("<html>Repeat the input<br>and press again</html>");
                    }
                }
                else{
                    //try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
                    winner.setText("Move: " + count);
                    if((firstOpen.getText().equals("x") || secondOpen.getText().equals("x")) || count>106){
                        if(count == 107){winner.setText("botva");}
                        else if(firstOpen.getText().equals("x")){winner.setText("Winner: Second");}
                        else{winner.setText("Winner: First");}
                        b.setVisible(false);
                    }
                    else{
                        String f = firstOpen.getText(); String s = secondOpen.getText();
                        if(parseInt(f) == 9 && parseInt(s) == 0){
                            update(array2, array1, ar2Last, ar1Last, f , s);
                            ar2Last++; ar1Last--;
                        }
                        else if(parseInt(f) == 0 && parseInt(s) == 9){
                            update(array1, array2, ar1Last, ar2Last, f , s);
                            ar1Last++; ar2Last--;
                        }
                        else if(parseInt(f) > parseInt(s)){
                            update(array1, array2, ar1Last, ar2Last, f , s);
                            ar1Last++; ar2Last--;
                        }
                        else{
                            update(array2, array1, ar2Last, ar1Last, f , s);
                            ar2Last++; ar1Last--;
                        }
                        printCards(firstOpen, secondOpen, firstCards, secondCards);
                    }
                    count++;
                    //try { Thread.sleep(2000); } catch (InterruptedException q) { q.printStackTrace(); }
                    //secondOpen.setBackground(new Color(240, 128, 128));
                    //firstOpen.setBackground(new Color(240, 128, 128));
                }

            }
        });

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
