package com.baeldung.creational.abstractfactory2;

/**
 * The type Sky animal.
 */
public class SkyAnimal extends Animal {

    SkyAnimal(EnumEra era,String name,  String description) {
        super(era, name,description);
        System.out.println(" created a animal of type: " + this.getClass().getSimpleName()+ " of Era: " + era);
    }
}
