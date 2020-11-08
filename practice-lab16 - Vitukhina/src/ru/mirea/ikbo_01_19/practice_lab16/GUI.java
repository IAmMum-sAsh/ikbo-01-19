package ru.mirea.ikbo_01_19.practice_lab16;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {

    public GUI(){
        super( "Internet Coffee" );
        setSize( 1000,800);
        setLayout(null);
        setLocationRelativeTo(null);

        JMenuBar menu = new JMenuBar();
        JMenu section = new JMenu("Позиция");
        JMenuItem dish = new JMenuItem("Блюдо");
        section.add(dish);
        JMenuItem drink = new JMenuItem("Напиток");
        section.add(drink);
        menu.add(section);
        setJMenuBar(menu);

        JPanel input = new JPanel(null);
        input.setSize(500, 600);
        input.setLocation(0, 0);

            JPanel customer = new JPanel(null);
            customer.setSize(500, 200);
            customer.setLocation(0, 0);
            customer.setBackground(new Color(76, 127, 180));

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
                streetNameLabel.setLocation(10, 140);
                streetNameLabel.setHorizontalAlignment(JLabel.RIGHT);
                //streetNameLabel.setBorder(BorderFactory.createLineBorder(Color.black));
                JTextField streetName = new JTextField();
                streetName.setSize(70, 30);
                streetName.setLocation(80, 140);

                JLabel buildingNumberLabel = new JLabel("Дом: ");
                buildingNumberLabel.setSize(70, 30);
                buildingNumberLabel.setLocation(150, 140);
                buildingNumberLabel.setHorizontalAlignment(JLabel.RIGHT);
                //buildingNumberLabel.setBorder(BorderFactory.createLineBorder(Color.black));
                JTextField buildingNumber = new JTextField();
                buildingNumber.setSize(70, 30);
                buildingNumber.setLocation(220, 140);

                JLabel buildingLetterLabel = new JLabel("Квартира: ");
                buildingLetterLabel.setSize(70, 30);
                buildingLetterLabel.setLocation(290, 140);
                buildingLetterLabel.setHorizontalAlignment(JLabel.RIGHT);
                //buildingLetterLabel.setBorder(BorderFactory.createLineBorder(Color.black));
                JTextField buildingLetter = new JTextField();
                buildingLetter.setSize(70, 30);
                buildingLetter.setLocation(360, 140);

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

        input.add(customer);

            JPanel dishItem = new JPanel(null);
            dishItem.setSize(500, 400);
            dishItem.setLocation(0, 200);
            dishItem.setBackground(new Color(89, 199, 199));

                JLabel nameLabel = new JLabel("Наименование: ");
                nameLabel.setSize(100, 30);
                nameLabel.setLocation(20, 30);
                nameLabel.setHorizontalAlignment(JLabel.RIGHT);
                //nameLabel.setBorder(BorderFactory.createLineBorder(Color.black));
                JTextField name = new JTextField();
                name.setSize(70, 30);
                name.setLocation(130, 30);

                JLabel costLabel = new JLabel("Цена: ");
                costLabel.setSize(70, 30);
                costLabel.setLocation(50, 70);
                costLabel.setHorizontalAlignment(JLabel.RIGHT);
                //costLabel.setBorder(BorderFactory.createLineBorder(Color.black));
                JTextField cost = new JTextField();
                cost.setSize(70, 30);
                cost.setLocation(130, 70);

                JLabel descriptionLabel = new JLabel("Описание: ");
                descriptionLabel.setSize(70, 30);
                descriptionLabel.setLocation(50, 110);
                descriptionLabel.setHorizontalAlignment(JLabel.RIGHT);
                //descriptionLabel.setBorder(BorderFactory.createLineBorder(Color.black));
                JTextField description = new JTextField();
                description.setSize(70, 30);
                description.setLocation(130, 110);

            dishItem.add(nameLabel);
            dishItem.add(name);
            dishItem.add(costLabel);
            dishItem.add(cost);
            dishItem.add(descriptionLabel);
            dishItem.add(description);

                JButton set = new JButton("Добавить");
                set.setSize(200, 70);
                set.setLocation(250, 200);
                set.setBackground(new Color(71, 217, 177));

                JButton del = new JButton("Удалить");
                del.setSize(200, 70);
                del.setLocation(250, 290);
                del.setBackground(new Color(71, 217, 177));

            dishItem.add(set);
            dishItem.add(del);

        input.add(dishItem);






        JPanel order = new JPanel(null);
        order.setSize(500, 600);
        order.setLocation(500, 0);
        order.setBackground(new Color(94, 219, 115));

            JLabel items = new JLabel();
            items.setSize(500, 500);

        order.add(items);

            JButton create = new JButton("Создать");
            create.setSize(200, 70);
            create.setLocation(250, 515);
            create.setBackground(new Color(71, 217, 177));

        order.add(create);





        JPanel queue = new JPanel(null);
        queue.setSize(1000, 200);
        queue.setLocation(0, 600);
        queue.setBackground(new Color(212, 121, 121));

            JScrollPane scrollQueue = new JScrollPane(queue);

        add(scrollQueue);

        add(input);
        add(order);
        add(queue);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
