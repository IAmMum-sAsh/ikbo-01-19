//***************************************************************************//

package ru.mirea.ikbo_01_19.practice_lab16;

public enum DrinkTypeEnum {
    BEER,
    WINE,
    VODKA,
    WHISKEY,
    RUM,
    JUICE,
    COFEE,
    GREEN_TEA,
    BLACK_TEA,
    MILK,
    WATER,
    SODA,
    ELSE;

    public DrinkTypeEnum DrinkType (String type){
        switch(type){
            case "Пиво":
                return BEER;
            case "Вино":
                return WINE;
            case "Водка":
                return VODKA;
            case "Виски":
                return WHISKEY;
            case "Ром":
                return RUM;
            case "Сок":
                return JUICE;
            case "Кофе":
                return COFEE;
            case "Зеленый чай":
                return GREEN_TEA;
            case "Черный чай":
                return BLACK_TEA;
            case "Молоко":
                return MILK;
            case "Вода":
                return WATER;
            case "Сода":
                return SODA;
            default:
                return ELSE;
        }
    }
}
