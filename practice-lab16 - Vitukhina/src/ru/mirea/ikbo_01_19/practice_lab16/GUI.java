package ru.mirea.ikbo_01_19.practice_lab16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Double.parseDouble;
import static java.lang.Double.sum;
import static java.lang.Integer.parseInt;

public class GUI extends JFrame {
    private InternetOrdersManager manager;
    private InternetOrder newOrder;

    public void update(JLabel items, JLabel totalCost){
        String str = "<html>";
        items.setText("");
        MenuItem[] a = newOrder.getItems();
        for(int i=0; i<newOrder.itemsQuantity(); i++){
            str += a[i].toString();
        }
        str += "</html>";
        items.setText(str);

        int cost = newOrder.costTotal();
        totalCost.setText("Общая стоимость: " + cost + " р.");
    }

    public void clear(JTextField drinkName, JTextField drinkCost, JTextField drinkDescription, JTextField drinkAlcoholVol){
        drinkName.setText("");
        drinkCost.setText("");
        drinkDescription.setText("");
        drinkAlcoholVol.setText("");
    }

    public void clear(JTextField dishName, JTextField dishCost, JTextField dishDescription){
        dishName.setText("");
        dishCost.setText("");
        dishDescription.setText("");
    }

    public void update(JLabel queueItem1, JLabel queueItem2, JLabel queueItem3, JLabel queueItem4, JLabel queueItem5){
        queueItem1.setText("");
        queueItem2.setText("");
        queueItem3.setText("");
        queueItem4.setText("");
        queueItem5.setText("");
        Order[] arr = manager.getOrders();
        int count = 0;
        for(int i=0; i<manager.orderQuantity(); i++){
            count++;
            if(count == 1){ queueItem1.setText(arr[i].getSummary()); }
            else if(count == 2){ queueItem2.setText(arr[i].getSummary()); }
            else if(count == 3){ queueItem3.setText(arr[i].getSummary()); }
            else if(count == 4){ queueItem4.setText(arr[i].getSummary()); }
            else if(count == 5){ queueItem5.setText(arr[i].getSummary()); }
            else{  }
        }
    }

    public void rem(String summary){
        Order[] arr = manager.getOrders();
        for(int i=0; i<manager.orderQuantity(); i++){
            if(arr[i].getSummary().equals(summary)){
                manager.remove(arr[i]);
            }
        }
    }

    public GUI(){
        super( "Internet Coffee" );
        setSize( 1010,810);
        setLayout(null);
        setLocationRelativeTo(null);

        manager = new InternetOrdersManager();
        newOrder = new InternetOrder();

        JPanel input = new JPanel(null);
        input.setSize(500, 600);
        input.setLocation(0, 0);

            JPanel customer = new JPanel(null);
            customer.setSize(500, 200);
            customer.setLocation(0, 0);
            customer.setBackground(new Color(154,217,234));

                JLabel firstNameLabel = new JLabel("Имя: ");
                firstNameLabel.setSize(70, 30);
                firstNameLabel.setLocation(10, 30);
                firstNameLabel.setHorizontalAlignment(JLabel.RIGHT);
                //firstNameLabel.setBorder(BorderFactory.createLineBorder(Color.black));
                JTextField firstName = new JTextField();
                firstName.setSize(70,30);
                firstName.setLocation(80, 30);

                JLabel secondNameLabel = new JLabel("Фамилия: ");
                secondNameLabel.setSize(70, 30);
                secondNameLabel.setLocation(150, 30);
                secondNameLabel.setHorizontalAlignment(JLabel.RIGHT);
                //secondNameLabel.setBorder(BorderFactory.createLineBorder(Color.black));
                JTextField secondName = new JTextField();
                secondName.setSize(70,30);
                secondName.setLocation(220, 30);

                JLabel ageLabel = new JLabel("Возраст: ");
                ageLabel.setSize(70, 30);
                ageLabel.setLocation(290, 30);
                ageLabel.setHorizontalAlignment(JLabel.RIGHT);
                //ageLabel.setBorder(BorderFactory.createLineBorder(Color.black));
                JTextField age = new JTextField();
                age.setSize(70, 30);
                age.setLocation(360, 30);

                JLabel cityNameLabel = new JLabel("Город: ");
                cityNameLabel.setSize(70, 30);
                cityNameLabel.setLocation(10, 100);
                cityNameLabel.setHorizontalAlignment(JLabel.RIGHT);
                //cityNameLabel.setBorder(BorderFactory.createLineBorder(Color.black));
                JTextField cityName = new JTextField();
                cityName.setSize(70, 30);
                cityName.setLocation(80, 100);

                JLabel zipCodeLabel = new JLabel("Почтовый индекс: ");
                zipCodeLabel.setSize(120, 30);
                zipCodeLabel.setLocation(150, 100);
                zipCodeLabel.setHorizontalAlignment(JLabel.RIGHT);
                //zipCodeLabel.setBorder(BorderFactory.createLineBorder(Color.black));
                JTextField zipCode = new JTextField();
                zipCode.setSize(70, 30);
                zipCode.setLocation(270, 100);

                JLabel streetNameLabel = new JLabel("Улица: ");
                streetNameLabel.setSize(70, 30);
                streetNameLabel.setLocation(340, 100);
                streetNameLabel.setHorizontalAlignment(JLabel.RIGHT);
                //streetNameLabel.setBorder(BorderFactory.createLineBorder(Color.black));
                JTextField streetName = new JTextField();
                streetName.setSize(70, 30);
                streetName.setLocation(410, 100);

                JLabel buildingNumberLabel = new JLabel("Дом: ");
                buildingNumberLabel.setSize(70, 30);
                buildingNumberLabel.setLocation(10, 140);
                buildingNumberLabel.setHorizontalAlignment(JLabel.RIGHT);
                //buildingNumberLabel.setBorder(BorderFactory.createLineBorder(Color.black));
                JTextField buildingNumber = new JTextField();
                buildingNumber.setSize(70, 30);
                buildingNumber.setLocation(80, 140);

                JLabel buildingLetterLabel = new JLabel("Корпус: ");
                buildingLetterLabel.setSize(70, 30);
                buildingLetterLabel.setLocation(150, 140);
                buildingLetterLabel.setHorizontalAlignment(JLabel.RIGHT);
                //buildingLetterLabel.setBorder(BorderFactory.createLineBorder(Color.black));
                JTextField buildingLetter = new JTextField();
                buildingLetter.setSize(70, 30);
                buildingLetter.setLocation(220, 140);

                JLabel apartmentNumberLabel = new JLabel("Квартира: ");
                apartmentNumberLabel.setSize(70, 30);
                apartmentNumberLabel.setLocation(290, 140);
                apartmentNumberLabel.setHorizontalAlignment(JLabel.RIGHT);
                //apartmentNumberLabel.setBorder(BorderFactory.createLineBorder(Color.black));
                JTextField apartmentNumber = new JTextField();
                apartmentNumber.setSize(70, 30);
                apartmentNumber.setLocation(360, 140);


            customer.add(firstNameLabel);
            customer.add(firstName);
            customer.add(secondNameLabel);
            customer.add(secondName);
            customer.add(ageLabel);
            customer.add(age);
            customer.add(cityNameLabel);
            customer.add(cityName);
            customer.add(zipCodeLabel);
            customer.add(zipCode);
            customer.add(streetNameLabel);
            customer.add(streetName);
            customer.add(buildingNumberLabel);
            customer.add(buildingNumber);
            customer.add(buildingLetterLabel);
            customer.add(buildingLetter);
            customer.add(apartmentNumberLabel);
            customer.add(apartmentNumber);

        input.add(customer);

            JPanel dishItem = new JPanel(null);
            dishItem.setSize(500, 400);
            dishItem.setLocation(0, 200);
            dishItem.setBackground(new Color(253,174,201));

                JLabel dishNameLabel = new JLabel("Наименование: ");
                dishNameLabel.setSize(100, 30);
                dishNameLabel.setLocation(20, 30);
                dishNameLabel.setHorizontalAlignment(JLabel.RIGHT);
                //dishNameLabel.setBorder(BorderFactory.createLineBorder(Color.black));
                JTextField dishName = new JTextField();
                dishName.setSize(70, 30);
                dishName.setLocation(130, 30);

                JLabel dishCostLabel = new JLabel("Цена: ");
                dishCostLabel.setSize(70, 30);
                dishCostLabel.setLocation(50, 70);
                dishCostLabel.setHorizontalAlignment(JLabel.RIGHT);
                //dishCostLabel.setBorder(BorderFactory.createLineBorder(Color.black));
                JTextField dishCost = new JTextField();
                dishCost.setSize(70, 30);
                dishCost.setLocation(130, 70);

                JLabel dishDescriptionLabel = new JLabel("Описание: ");
                dishDescriptionLabel.setSize(70, 30);
                dishDescriptionLabel.setLocation(50, 110);
                dishDescriptionLabel.setHorizontalAlignment(JLabel.RIGHT);
                //dishDescriptionLabel.setBorder(BorderFactory.createLineBorder(Color.black));
                JTextField dishDescription = new JTextField();
                dishDescription.setSize(70, 30);
                dishDescription.setLocation(130, 110);

            dishItem.add(dishNameLabel);
            dishItem.add(dishName);
            dishItem.add(dishCostLabel);
            dishItem.add(dishCost);
            dishItem.add(dishDescriptionLabel);
            dishItem.add(dishDescription);

                JButton dishSet = new JButton("Добавить");
                dishSet.setSize(200, 70);
                dishSet.setLocation(250, 200);
                dishSet.setBackground(new Color(240,234,214));

                JButton dishDel = new JButton("Удалить");
                dishDel.setSize(200, 70);
                dishDel.setLocation(250, 290);
                dishDel.setBackground(new Color(240,234,214));

            dishItem.add(dishSet);
            dishItem.add(dishDel);

        input.add(dishItem);


            JPanel drinkItem = new JPanel(null);
            drinkItem.setSize(500, 400);
            drinkItem.setLocation(0, 200);
            drinkItem.setBackground(new Color(253,174,201));

                JLabel drinkNameLabel = new JLabel("Наименование: ");
                drinkNameLabel.setSize(100, 30);
                drinkNameLabel.setLocation(20, 30);
                drinkNameLabel.setHorizontalAlignment(JLabel.RIGHT);
                //drinkNameLabel.setBorder(BorderFactory.createLineBorder(Color.black));
                JTextField drinkName = new JTextField();
                drinkName.setSize(70, 30);
                drinkName.setLocation(130, 30);

                JLabel drinkCostLabel = new JLabel("Цена: ");
                drinkCostLabel.setSize(70, 30);
                drinkCostLabel.setLocation(50, 70);
                drinkCostLabel.setHorizontalAlignment(JLabel.RIGHT);
                //drinkCostLabel.setBorder(BorderFactory.createLineBorder(Color.black));
                JTextField drinkCost = new JTextField();
                drinkCost.setSize(70, 30);
                drinkCost.setLocation(130, 70);

                JLabel drinkDescriptionLabel = new JLabel("Описание: ");
                drinkDescriptionLabel.setSize(70, 30);
                drinkDescriptionLabel.setLocation(50, 110);
                drinkDescriptionLabel.setHorizontalAlignment(JLabel.RIGHT);
                //drinkDescriptionLabel.setBorder(BorderFactory.createLineBorder(Color.black));
                JTextField drinkDescription = new JTextField();
                drinkDescription.setSize(70, 30);
                drinkDescription.setLocation(130, 110);

                JLabel drinkAlcoholVolLabel = new JLabel("<html>Содержание<br>алкоголя (%):</html>");
                drinkAlcoholVolLabel.setSize(110, 30);
                drinkAlcoholVolLabel.setLocation(10, 149);
                drinkAlcoholVolLabel.setHorizontalAlignment(JLabel.RIGHT);
                //drinkAlcoholVolLabel.setBorder(BorderFactory.createLineBorder(Color.black));
                JTextField drinkAlcoholVol = new JTextField();
                drinkAlcoholVol.setSize(70, 30);
                drinkAlcoholVol.setLocation(130, 150);

            drinkItem.add(drinkNameLabel);
            drinkItem.add(drinkName);
            drinkItem.add(drinkCostLabel);
            drinkItem.add(drinkCost);
            drinkItem.add(drinkDescriptionLabel);
            drinkItem.add(drinkDescription);
            drinkItem.add(drinkAlcoholVolLabel);
            drinkItem.add(drinkAlcoholVol);

                JButton drinkSet = new JButton("Добавить");
                drinkSet.setSize(200, 70);
                drinkSet.setLocation(250, 200);
                drinkSet.setBackground(new Color(240,234,214));

                JButton drinkDel = new JButton("Удалить");
                drinkDel.setSize(200, 70);
                drinkDel.setLocation(250, 290);
                drinkDel.setBackground(new Color(240,234,214));

            drinkItem.add(drinkSet);
            drinkItem.add(drinkDel);

        input.add(drinkItem);
        drinkItem.setVisible(false);

        JMenuBar menu = new JMenuBar();
        JMenu section = new JMenu("Позиция");
        JMenuItem dish = new JMenuItem("Блюдо");
        section.add(dish);dish.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                drinkItem.setVisible(false);
                dishItem.setVisible(true);
            }
        });
        JMenuItem drink = new JMenuItem("Напиток");
        drink.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                dishItem.setVisible(false);
                drinkItem.setVisible(true);
            }
        });
        section.add(drink);
        menu.add(section);
        setJMenuBar(menu);




        JPanel order = new JPanel(null);
        order.setSize(500, 600);
        order.setLocation(500, 0);
        order.setBackground(new Color(199,191,230));

            JLabel items = new JLabel();
            items.setSize(200, 500);
            items.setLocation(150, 0);

            JLabel totalCost = new JLabel("Общая стоимость: 0 р.");
            totalCost.setSize(170, 35);
            totalCost.setLocation(40, 515);
            //totalCost.setBorder(BorderFactory.createLineBorder(Color.black));

        order.add(items);
        order.add(totalCost);

            JButton create = new JButton("Создать");
            create.setSize(200, 70);
            create.setLocation(250, 515);
            create.setBackground(new Color(240,234,214));

        order.add(create);





        JPanel queue = new JPanel(null);
        queue.setSize(1000, 150);
        queue.setLocation(0, 600);
        queue.setBackground(new Color(194,194,194));

            JLabel queueItem1 = new JLabel();
            queueItem1.setSize(200, 150);
            queueItem1.setLocation(0,0);
            queueItem1.setVerticalAlignment(JLabel.CENTER);
            queueItem1.setHorizontalAlignment(JLabel.CENTER);
            //queueItem1.setBorder(BorderFactory.createLineBorder(Color.black));

            JButton b1 = new JButton("Убрать");
            b1.setSize(100, 20);
            b1.setLocation(100, 0);
            b1.setBackground(new Color(240,234,214));

            JLabel queueItem2 = new JLabel();
            queueItem2.setSize(200, 150);
            queueItem2.setLocation(200,0);
            queueItem2.setVerticalAlignment(JLabel.CENTER);
            queueItem2.setHorizontalAlignment(JLabel.CENTER);
            //queueItem2.setBorder(BorderFactory.createLineBorder(Color.black));

            JButton b2 = new JButton("Убрать");
            b2.setSize(100, 20);
            b2.setLocation(300, 0);
            b2.setBackground(new Color(240,234,214));

            JLabel queueItem3 = new JLabel();
            queueItem3.setSize(200, 150);
            queueItem3.setLocation(400,0);
            queueItem3.setVerticalAlignment(JLabel.CENTER);
            queueItem3.setHorizontalAlignment(JLabel.CENTER);
            //queueItem3.setBorder(BorderFactory.createLineBorder(Color.black));

            JButton b3 = new JButton("Убрать");
            b3.setSize(100, 20);
            b3.setLocation(500, 0);
            b3.setBackground(new Color(240,234,214));

            JLabel queueItem4 = new JLabel();
            queueItem4.setSize(200, 150);
            queueItem4.setLocation(600,0);
            queueItem4.setVerticalAlignment(JLabel.CENTER);
            queueItem4.setHorizontalAlignment(JLabel.CENTER);
            //queueItem4.setBorder(BorderFactory.createLineBorder(Color.black));

            JButton b4 = new JButton("Убрать");
            b4.setSize(100, 20);
            b4.setLocation(700, 0);
            b4.setBackground(new Color(240,234,214));

            JLabel queueItem5 = new JLabel();
            queueItem5.setSize(200, 150);
            queueItem5.setLocation(800,0);
            queueItem5.setVerticalAlignment(JLabel.CENTER);
            queueItem5.setHorizontalAlignment(JLabel.CENTER);
            //queueItem5.setBorder(BorderFactory.createLineBorder(Color.black));

            JButton b5 = new JButton("Убрать");
            b5.setSize(100, 20);
            b5.setLocation(900, 0);
            b5.setBackground(new Color(240,234,214));

            queue.add(queueItem1);
            queue.add(b1);
            queue.add(queueItem2);
            queue.add(b2);
            queue.add(queueItem3);
            queue.add(b3);
            queue.add(queueItem4);
            queue.add(b4);
            queue.add(queueItem5);
            queue.add(b5);

        add(input);
        add(order);
        add(queue);

        dishSet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                Dish next = new Dish(parseInt(dishCost.getText()), dishName.getText(), dishDescription.getText());
                if(newOrder.add(next)) {
                    update(items, totalCost);
                }
                clear(dishName, dishCost, dishDescription);
            }
        });
        dishDel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if(newOrder.remove(dishName.getText())){
                    update(items, totalCost);
                }
                clear(dishName, dishCost, dishDescription);
            }
        });

        drinkSet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                Drink next = new Drink(parseInt(drinkCost.getText()), drinkName.getText(), drinkDescription.getText(), DrinkTypeEnum.DrinkType(drinkName.getText()), parseDouble(drinkAlcoholVol.getText()));
                if(newOrder.add(next)) {
                    update(items, totalCost);
                }
                clear(drinkName, drinkCost, drinkDescription, drinkAlcoholVol);
            }
        });
        drinkDel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if(newOrder.remove(drinkName.getText())){
                    update(items, totalCost);
                }
                clear(drinkName, drinkCost, drinkDescription, drinkAlcoholVol);
            }
        });

        create.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                char[] arr = buildingLetter.getText().toCharArray();
                Address adr = new Address(cityName.getText(), parseInt(zipCode.getText()), streetName.getText(), parseInt(buildingNumber.getText()), arr[0], parseInt(apartmentNumber.getText()));
                Customer cust = new Customer(firstName.getText(), secondName.getText(), parseInt(age.getText()), adr);
                newOrder.setCustomer(cust);

                String str = "<html>" + cust.toString() + "<br><br>" + newOrder.costTotal() + " р.</html>";
                newOrder.setSummary(str);

                manager.add(newOrder);

                items.setText("");
                firstName.setText("");
                secondName.setText("");
                age.setText("");
                cityName.setText("");
                zipCode.setText("");
                streetName.setText("");
                buildingNumber.setText("");
                buildingLetter.setText("");
                apartmentNumber.setText("");
                totalCost.setText("Общая стоимость: 0 р.");

                update(queueItem1, queueItem2, queueItem3, queueItem4, queueItem5);

                newOrder = new InternetOrder();
            }
        });

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                rem(queueItem1.getText());
                update(queueItem1, queueItem2, queueItem3, queueItem4, queueItem5);
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                rem(queueItem2.getText());
                update(queueItem1, queueItem2, queueItem3, queueItem4, queueItem5);
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                rem(queueItem3.getText());
                update(queueItem1, queueItem2, queueItem3, queueItem4, queueItem5);
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                rem(queueItem4.getText());
                update(queueItem1, queueItem2, queueItem3, queueItem4, queueItem5);
            }
        });

        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                rem(queueItem5.getText());
                update(queueItem1, queueItem2, queueItem3, queueItem4, queueItem5);
            }
        });

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
