package com.baeldung.creational.abstractfactory2;

public class LandAnimal extends Animal1 {

    LandAnimal(EnumAnimalType type, EnumEra era, String description) {
        super(type, era);
        super.setDescription(description);
        System.out.println(" created a land animal of type: " + type + " of Era: " + era);
    }
}
