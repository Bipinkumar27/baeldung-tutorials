package com.baeldung.creational.abstractfactory2;

public class AbstractAnimalPatternDriver {
    public static void main(String[] args) {

        EraAnimalFactory cenozoicEraAnimalFactory = AbstractAnimalFactory.getAnimalFactory(EnumEra.CENOZOIC);
        Animal1 animal1 = cenozoicEraAnimalFactory.createAnimal(EnumAnimalType.LAND);
        animal1 = cenozoicEraAnimalFactory.createAnimal(EnumAnimalType.SKY);
        System.out.println(animal1.getDescription());

        EraAnimalFactory mesozoicEraAnimalFactory = AbstractAnimalFactory.getAnimalFactory(EnumEra.MESOZOIC);
        Animal1 animal2 = mesozoicEraAnimalFactory.createAnimal(EnumAnimalType.LAND);
        animal2 = mesozoicEraAnimalFactory.createAnimal(EnumAnimalType.SKY);
        System.out.println(animal2.getDescription());
    }
}
