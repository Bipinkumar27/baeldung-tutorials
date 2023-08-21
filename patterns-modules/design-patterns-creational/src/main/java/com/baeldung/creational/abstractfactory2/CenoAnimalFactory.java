package com.baeldung.creational.abstractfactory2;

import static com.baeldung.creational.abstractfactory2.Constants.CENOZOIC_ANIMAL_DESCRIPTION;
import static com.baeldung.creational.abstractfactory2.EnumAnimalType.LAND;
import static com.baeldung.creational.abstractfactory2.EnumAnimalType.SKY;

public class CenoAnimalFactory extends AnimalAbstractFactory{

    EnumAnimalType animalType;
    String animalName;
    CenoAnimalFactory(EnumAnimalType animalType, String animalName){
        this.animalType = animalType;
        this.animalName = animalName;
    }
    @Override
    public Animal createAnimal() {
        switch (animalType) {
        case LAND:
            return new LandAnimal(EnumEra.CENOZOIC,animalName, CENOZOIC_ANIMAL_DESCRIPTION);
        case SKY:
            return new SkyAnimal(EnumEra.CENOZOIC,animalName, CENOZOIC_ANIMAL_DESCRIPTION);
        }
        return null;
    }
}
