//***************************************************************************//

package ru.mirea.ikbo_01_19.practice_lab16;

public class Drink extends MenuItem implements Alcoholable{
    private double alcoholVol;
    private DrinkTypeEnum type;

    public Drink (int cost, String name, String description, DrinkTypeEnum type, double alcoholVol){
        super(cost, name, description);
        this.type = type;
        this.alcoholVol = alcoholVol;
    }

    public Drink (String name, String description, DrinkTypeEnum type, double alcoholVol){
        super(0, name, description);
        this.type = type;
        this.alcoholVol = alcoholVol;
    }

    @Override
    public String toString() {
        return "Наименование: " + this.getName() + "<br>Цена: " + this.getCost() + "<br>Описание: " + this.getDescription() + "<br>Содержание алкоголя: " + alcoholVol + "<hr>";
    }

    @Override
    public boolean isAlcoholicDrink() {
        if(alcoholVol < 4){return true;}
        else {return false;}
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }
}
