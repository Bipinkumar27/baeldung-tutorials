package com.baeldung.creational.abstractfactory2;

/**
 * The type Sky animal.
 */
public class SkyAnimal extends Animal {

    SkyAnimal(AnimalEra era, String name) {
        super(AnimalType.SKY, era, name);
        create();
    }
    @Override
    void create() {
        System.out.println("Creating a " + type + " animal: " + name);
    }
}
