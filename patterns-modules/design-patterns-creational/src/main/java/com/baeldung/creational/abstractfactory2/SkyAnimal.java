package com.baeldung.creational.abstractfactory2;

public class SkyAnimal extends Animal {
    SkyAnimal(EnumAnimalType type, EnumEra era, String description) {
        super(type, era);
        super.setDescription(description);
        System.out.println(" created a sky animal of type: " + type + " of Era: " + era);
    }
}
