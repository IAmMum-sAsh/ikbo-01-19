//***************************************************************************//

package ru.mirea.ikbo_01_19.practice_lab16;

public class Dish extends MenuItem{
    public Dish(int cost, String name, String description) {
        super(cost, name, description);
    }

    public Dish(String name, String description) {
        super(0, name, description);
    }

    @Override
    public String getDescription() {
        return this.getDescription();
    }

    @Override
    public String getName() {
        return this.getName();
    }

    @Override
    public int getCost() {
        return this.getCost();
    }

    @Override
    public String toString() {
        return "<html>Наименование: " + this.getName() + "<br>Цена: " + this.getCost() + "<br>Описание: " + this.getDescription() + "</html>";
    }
}
