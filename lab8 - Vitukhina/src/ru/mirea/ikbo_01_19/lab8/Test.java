package ru.mirea.ikbo_01_19.lab8;

import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean app = false;
        String s = "";
        while (!s.equals("1227")){
            System.out.print("Введите текст для записи в файл или \"1227\" для выхода: "); s = scan.nextLine();
            try (FileWriter writer = new FileWriter("C:\\Users\\Admin\\IdeaProjects\\lab8\\test.txt", app)) {
                writer.write(s + "\n");
                writer.flush();
            }
            catch(IOException ex){ System.out.println(ex.getMessage()); }
            app = true;
        }
    }
}
