//***************************************************************************//

package ru.mirea.ikbo_01_19.practice_lab16;

public class MenuItem {
    private int cost;
    private String name;
    private String description;

    public MenuItem(){}

    public MenuItem(int cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
