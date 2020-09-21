package ru.mirea.ikbo_01_19.lab4;

public class Animals implements Nameable{
    protected String name;
    protected int numberOfPaws;
    protected boolean extinct;
    protected boolean predators;

    public Animals(String name, int numberOfPaws, boolean extinct, boolean predators) {
        this.name = name;
        this.numberOfPaws = numberOfPaws;
        this.extinct = extinct;
        this.predators = predators;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public boolean isExtinct() {
        return extinct;
    }

    public boolean isPredators() {
        return predators;
    }

    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", numberOfPaws=" + numberOfPaws +
                ", extinct=" + extinct +
                ", predators=" + predators +
                "}\n";
    }
}
