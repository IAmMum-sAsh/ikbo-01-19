package ru.mirea.ikbo_01_19.practice6;

import java.util.Comparator;

public class SortingStudentsByGPA {
    String surname;
    protected int gpa;

    SortingStudentsByGPA(){}

    SortingStudentsByGPA(String surname, int gpa){
        this.surname = surname;
        this.gpa = gpa;
    }

    void setGpa(int gpa){ this.gpa = gpa; }
    void setSurname(String surname){ this.surname = surname; }

    int getGpa(){ return this.gpa; }
    String getSurname(){ return this.surname; }

    public String toString() {
        return (this.surname + ": " + this.gpa);
    }
}
