package ru.mirea.ikbo_01_19.practice10.ex2;

public class Test {
    public static void main(String[] args){
        Client client = new Client();
        client.setChair(new ChairFactory().createVictorianChair(1898));
        client.sit();

        MagicChair magicChair = new ChairFactory().createMagicChair();
        client.setChair(magicChair);
        client.sit();
        magicChair.doMagic();

        FunctionalChair functionalChair = new ChairFactory().createFunctionalChair();
        client.setChair(functionalChair);
        client.sit();
        System.out.println("Sum = " + functionalChair.sum(5, 6));
    }
}
