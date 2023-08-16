package com.baeldung.creational.abstractfactory2;

public class AbstractAnimalPatternDriver {
    public static void main(String[] args) {

        EraAnimalFactory cenozoicEraAnimalFactory = AbstractAnimalFactory.getAnimalFactory(EnumEra.CENOZOIC);
        Animal animal = cenozoicEraAnimalFactory.createAnimal(EnumAnimalType.LAND);
        animal = cenozoicEraAnimalFactory.createAnimal(EnumAnimalType.SKY);
        System.out.println(animal.getDescription());

        EraAnimalFactory mesozoicEraAnimalFactory = AbstractAnimalFactory.getAnimalFactory(EnumEra.MESOZOIC);
        Animal animal2 = mesozoicEraAnimalFactory.createAnimal(EnumAnimalType.LAND);
        animal2 = mesozoicEraAnimalFactory.createAnimal(EnumAnimalType.SKY);
        System.out.println(animal2.getDescription());
    }
}
