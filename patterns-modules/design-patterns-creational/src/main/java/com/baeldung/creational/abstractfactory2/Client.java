package com.baeldung.creational.abstractfactory2;

public class Client {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal(new MesoAnimalFactory(EnumAnimalType.LAND,"ELEPHANT"));
        System.out.println(animal.getName());
        System.out.println(animal.getDescription());

        animal = AnimalFactory.getAnimal(new CenoAnimalFactory(EnumAnimalType.SKY,"Bulbasaur"));
        System.out.println(animal.getName());
        System.out.println(animal.getDescription());
    }
}
