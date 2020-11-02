package ru.mirea.ikbo_01_19.practice12;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "";
        while(!str.equals("1227")){
            System.out.print("Введите номер телефона для проверки: ");
            str = scan.nextLine();
            PhoneNumber number = new PhoneNumber(str);
            if(number.NumberTest()){
                System.out.println("Корректный номер: " + number.toString());
            }
            else{
                System.out.println("Номер некорректен!");
            }
        }
    }
}
/*
+79670765736
89670765736
8967076573
896707657366
+18881112020

*/