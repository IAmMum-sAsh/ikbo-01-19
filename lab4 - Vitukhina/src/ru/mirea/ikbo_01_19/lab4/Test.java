package ru.mirea.ikbo_01_19.lab4;

public class Test {

    public static void main(String[] args){
        Nameable meg = new Animals("Мегатерий", 4, true, false);
        System.out.println(meg + "Тест метода getName(): " + meg.getName());

        Nameable uran = new Planets("Уран", 7, 51118, 15);
        System.out.println(uran + "Тест метода getName(): " + uran.getName());
    }
}
