package ru.mirea.ikbo_01_19.lab3;

import javax.swing.*;

public class FurnitureShop {
    public static void main(String[] args){
        Chair c1 = new Chair(50, 50, 100,"wood", "brown", 1500, 0, false);
        System.out.println(c1);

        Bed b1 = new Bed(90, 200, 200,"wood", "brown&orange", 1500, true, 2);
        System.out.println(b1);
    }
}
