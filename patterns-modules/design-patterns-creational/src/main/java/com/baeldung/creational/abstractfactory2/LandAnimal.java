package com.baeldung.creational.abstractfactory2;

/**
 * The type Land animal.
 */
public class LandAnimal extends Animal {

    LandAnimal(EnumAnimalType type, EnumEra era, String description) {
        super(type, era);
        super.setDescription(description);
        System.out.println(" created a land animal of type: " + type + " of Era: " + era);
    }
}
