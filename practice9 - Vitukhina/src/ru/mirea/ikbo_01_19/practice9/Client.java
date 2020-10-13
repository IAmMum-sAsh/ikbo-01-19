package ru.mirea.ikbo_01_19.practice9;

public class Client {
    private String name;
    private String INN;

    public Client(String name, String INN) {
        this.name = name;
        this.INN = INN;
    }

    public String getName() {
        return this.name;
    }

    public String getINN() {
        return this.INN;
    }
}