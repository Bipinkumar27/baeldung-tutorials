package com.baeldung.creational.abstractfactory2;

/**
 * The interface Era animal factory.
 */
public interface EraAnimalFactory {

    Animal createAnimal(EnumAnimalType type);
}
