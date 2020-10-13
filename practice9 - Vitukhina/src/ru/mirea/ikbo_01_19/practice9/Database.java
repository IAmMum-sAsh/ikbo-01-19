package ru.mirea.ikbo_01_19.practice9;

import java.util.Vector;

public class Database {
    private static Vector<Client> clients = new Vector<Client>();

    public Database(){}

    public static void setClient(String name, String INN){
        Client client = new Client(name, INN);
        clients.add(client);
    }

    public static Client getClient(String name, String INN) throws NotEqualINNException, NoClientException {
        for (Client client : clients) {
            if (client.getName().equals(name)) {
                if (client.getINN().equals(INN)) {
                    return client;
                }
                throw new NotEqualINNException("<html>ИНН клиента <br>" + name + "<br> не соответствует " + INN + "</html>");
            }
        }
        throw new NoClientException("<html>Нет клиента с именем <br>" + name + "</html>");
    }
}
