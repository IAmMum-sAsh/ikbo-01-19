package ru.mirea.ikbo_01_19.practice10.ex2;

public class MagicChair implements Chair {
    public void doMagic(){ System.out.println("This is a magic✨"); }

    @Override
    public String toString(){ return "Magic chair"; }
}
