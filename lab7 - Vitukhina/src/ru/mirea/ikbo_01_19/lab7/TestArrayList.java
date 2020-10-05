package ru.mirea.ikbo_01_19.lab7;

import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("красный");
        colors.add("оранжевый");
        colors.add("жёлтый");
        colors.add("не цвет");
        colors.add("зелёный");
        colors.add("голубой");
        colors.add("цвет небес"); //6
        colors.add("сИнИй"); //станет 6
        colors.add("фиолетовый");

        System.out.println("Начало\nВ списке " + colors.size() + " цветов:");
        for(String color : colors){
            System.out.println(color);
        }

        colors.remove(6);
        colors.set(6, "синий");

        if(colors.contains("бирюзовый")){System.out.println("\nСписок содержит цвет \"бирюзовый\"");}
        else{System.out.println("\nСписок не содержит цвет \"бирюзовый\"");}

        if(colors.contains("не цвет")){
            colors.remove("не цвет");
            System.out.println("\nВ списке был \"не цвет\", и он был удалён");
        }

        System.out.println("\nКонец\nВ списке " + colors.size() + " цветов:");
        for(String color : colors){
            System.out.println(color);
        }
    }
}
