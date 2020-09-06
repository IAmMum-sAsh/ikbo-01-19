package ru.mirea.ikbo_01_19.practice2_1;

public class Author {
    private String name;
    private String email;
    private boolean male;

    public Author(String n, String e, boolean m){
        name = n;
        email = e;
        male = m;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String e){
        email = e;
    }

    public char getGender(){
        if (male){ return 'M'; }
        else { return 'F'; }
    }

    public String toString(){
        if (male){ return (name + " (m) at " + email); }
        else { return (name + " (ms) at " + email); }
    }
}
