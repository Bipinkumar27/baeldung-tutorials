package com.baeldung.creational.abstractfactory2;

/**
 * The type Land animal.
 */
public class LandAnimal extends Animal {
    LandAnimal(EnumEra era, String name, String description) {
        super(era, name, description);
        System.out.println(" created a animal of type: " + this.getClass().getSimpleName() + " of Era: " + era);
    }
}
