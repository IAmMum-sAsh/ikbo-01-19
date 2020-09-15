package ru.mirea.ikbo_01_19.lab2;

public class Book {
    protected String author;
    protected String title;
    protected int yearOfPublication;
    protected String publishingHouse;
    protected int numberOfPages;

    public Book(){

    }

    public Book(String author, String title, String publishingHouse, int yearOfPublication, int numberOfPages){
        this.author = author;
        this.title = title;
        this.publishingHouse = publishingHouse;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String toString(){
        return (title + " / " + author + " - " + publishingHouse + ", " + yearOfPublication + " - " + numberOfPages + " c.");
    }


}
