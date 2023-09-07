package com.baeldung.creational.abstractfactory2;

/**
 * The type Land animal.
 */
public class LandAnimal extends Animal{

    LandAnimal(AnimalEra era, String name) {
        super(AnimalType.LAND, era, name);
        create();
    }
    @Override
    void create() {
        System.out.println("Creating a " + type + " animal: " + name);
    }
}
