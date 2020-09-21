package ru.mirea.ikbo_01_19.lab4;

public class Planets implements Nameable{
    protected String name;
    protected int numberFromSun;
    protected int diameter;
    protected int numberOfSatellites;

    public Planets(String name, int numberFromSun, int diameter, int numberOfSatellites) {
        this.name = name;
        this.numberFromSun = numberFromSun;
        this.diameter = diameter;
        this.numberOfSatellites = numberOfSatellites;
    }

    public String getName() {
        return name;
    }

    public int getNumberFromSun() {
        return numberFromSun;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getNumberOfSatellites() {
        return numberOfSatellites;
    }

    public String toString() {
        return "Planets{" +
                "name='" + name + '\'' +
                ", numberFromSun=" + numberFromSun +
                ", diameter=" + diameter +
                ", numberOfSatellites=" + numberOfSatellites +
                "}\n";
    }
}
