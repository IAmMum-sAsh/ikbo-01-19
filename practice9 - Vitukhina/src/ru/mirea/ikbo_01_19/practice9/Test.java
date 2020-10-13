package ru.mirea.ikbo_01_19.practice9;

public class Test {

    public static String checkClient(String name, String INN){
        try {
            Database.getClient(name, INN);
            return ("<html>Клиент <br>" + name + "<br> с ИНН " + INN + " найден.<br>Заказ успешно оформлен.<html>");
        }
        catch (NotEqualINNException | NoClientException e) {
            return (e.getMessage());
        }
    }

    public static void main(String[] args){
        new ClientUI();
    }
}
