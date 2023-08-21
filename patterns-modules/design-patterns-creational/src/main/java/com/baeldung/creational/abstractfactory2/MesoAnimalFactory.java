package com.baeldung.creational.abstractfactory2;

import static com.baeldung.creational.abstractfactory2.Constants.CENOZOIC_ANIMAL_DESCRIPTION;
import static com.baeldung.creational.abstractfactory2.Constants.MESOZOIC_ANIMAL_DESCRIPTION;
import static com.baeldung.creational.abstractfactory2.EnumAnimalType.LAND;
import static com.baeldung.creational.abstractfactory2.EnumAnimalType.SKY;

public class MesoAnimalFactory extends AnimalAbstractFactory {

    EnumAnimalType animalType;
    String animalName;

    MesoAnimalFactory(EnumAnimalType animalType, String animalName) {
        this.animalType = animalType;
        this.animalName = animalName;
    }

    @Override
    public Animal createAnimal() {
        switch (animalType) {
        case LAND:
            return new LandAnimal(EnumEra.MESOZOIC,animalName, MESOZOIC_ANIMAL_DESCRIPTION);
        case SKY:
            return new SkyAnimal(EnumEra.MESOZOIC,animalName, MESOZOIC_ANIMAL_DESCRIPTION);
        }
        return null;
    }
}
