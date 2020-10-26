package ru.mirea.ikbo_01_19.lab12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Pattern pat = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?!.*[\\x{0020}-\\x{002F}\\x{003A}-\\x{0040}\\x{005B}-\\x{005E}\\x{0060}\\x{007B}-\\x{007E}]).{8,}$");

        System.out.println("Введите пароль для проверки или 1227 для завершения");
        String pass = "";
        while (!pass.equals("1227")){
            pass = scan.nextLine();
            Matcher matcher = pat.matcher(pass);
            System.out.println(matcher.matches());
        }
    }
}
/*
Kot1k1SpasutM1r
kot1k1spasutm1r
KotikiSpasutMir
KOT1K1SPASUTM1R
33!Korovi
33_Korovi
K0r0tk

 */