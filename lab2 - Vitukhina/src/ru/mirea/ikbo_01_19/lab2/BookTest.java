package ru.mirea.ikbo_01_19.lab2;

public class BookTest {
    public static void main(String[] args) {
        Book n1 = new Book("Маргарет Митчелл", "Унесённые ветром. Т. 1", "Издательство АСТ", 2020, 704);
        System.out.println(n1);
        Book n2 = new Book();
        n2.setAuthor("Натаниель Готорн");
        n2.setTitle("Алая буква");
        n2.setPublishingHouse("Эксмо");
        n2.setNumberOfPages(384);
        n2.setYearOfPublication(2019);
        System.out.println(n2);
    }
}
