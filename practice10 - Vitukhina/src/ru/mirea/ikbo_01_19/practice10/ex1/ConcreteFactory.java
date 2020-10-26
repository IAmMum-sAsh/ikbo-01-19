package ru.mirea.ikbo_01_19.practice10.ex1;

public class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new Complex();
    }

    @Override
    public Complex createComplex(Integer real, Integer image) {
        return new Complex(real, image);
    }
}
