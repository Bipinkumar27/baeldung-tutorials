package com.baeldung.creational.abstractfactory2;

public class AnimalFactory {

    public static Animal getAnimal(AnimalAbstractFactory factory){
        return factory.createAnimal();
    }
}
