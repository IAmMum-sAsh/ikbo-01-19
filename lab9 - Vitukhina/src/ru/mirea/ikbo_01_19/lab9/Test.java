package ru.mirea.ikbo_01_19.lab9;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner myScanner = new Scanner( System.in );
        System.out.println(">> Основы Try-Catch-Finally");
        int i = 1;

        while(i != 1227){
            System.out.print( "Введите целое число или \"1227\" для выхода из цикла ");
            String intString = myScanner.next();
            try{
                i = Integer.parseInt(intString);
                System.out.println( 2 / i );
            } /*catch (Exception e){
                System.out.println(" Ошибка! "); // перекрывает другие исключения
            }*/ catch ( NumberFormatException e ) {
                System.out.println(" Неверный формат. Не целое ");
            } catch ( ArithmeticException e ) {
                System.out.println(" Попытка деления на 0 ");
            } finally {
                System.out.print("");
            }
        }

        System.out.println(">> Генерация собственных исключений");
        ThrowsDemo t = new ThrowsDemo();
        t.getKey();
    }
}
