package ru.mirea.ikbo_01_19.lab12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Pattern pat = Pattern.compile("^[a-z[A-Z][0-9][_]](?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$");

        System.out.println("Введите пароль для проверки или 1227 для завершения");
        String pass = "";
        while (!pass.equals("1227")){
            pass = scan.nextLine();
            Matcher matcher = pat.matcher(pass);
            System.out.println(matcher.matches());
        }
    }
}