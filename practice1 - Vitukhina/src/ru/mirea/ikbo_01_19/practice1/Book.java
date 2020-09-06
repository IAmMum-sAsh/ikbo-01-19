package ru.mirea.ikbo_01_19.practice1;

public class Book {
    private String author;
    private String title;

    public Book(String a, String t){
        author = a;
        title = t;
    }

    public String toString(){
        return (author + ": " + title);
    }
}
