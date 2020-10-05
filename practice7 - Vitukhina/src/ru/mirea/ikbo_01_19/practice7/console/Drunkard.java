package ru.mirea.ikbo_01_19.practice7.console;

import java.util.Scanner;
import java.util.Vector;
import static java.lang.Integer.parseInt;

public class Drunkard {
    protected Vector<String> array1 = new Vector<>();
    protected Vector<String> array2 = new Vector<>();;

    public void win1(String f, String s){
        array1.add(f); array1.add(s);
    }
    public void win2(String f, String s){
        array2.add(f); array2.add(s);
    }

    public Drunkard(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите карты первого игрока: "); String s1 = scan.nextLine();
        System.out.print("Введите карты второго игрока: "); String s2 = scan.nextLine();

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        for(int i = 0; i < s1.length(); i++){if(a1[i] !=  ' ') {array1.add(Character.toString(a1[i]));}}
        for(int i = 0; i < s2.length(); i++){if(a2[i] != ' ') {array2.add(Character.toString(a2[i]));}}

        int count = 1;

        while(!(array1.isEmpty() || array2.isEmpty()) && count<107){
            String f = array1.remove(0); String s = array2.remove(0);
            if(parseInt(f) == 9 && parseInt(s) == 0){win2(f, s);}
            else if(parseInt(f) == 0 && parseInt(s) == 9){win1(f, s);}
            if(parseInt(f) > parseInt(s)){win1(f, s);}
            else {win2(f, s);}
            count++;
        }

        if(count == 107){System.out.println("botva");}
        else if(array1.isEmpty()){System.out.println("Winner: Second");}
        else{System.out.println("Winner: First");}
    }
}

/*
    1 3 5 7 9
    2 4 6 8 0



*/
