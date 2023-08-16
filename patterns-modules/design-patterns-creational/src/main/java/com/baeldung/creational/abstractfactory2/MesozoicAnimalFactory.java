package com.baeldung.creational.abstractfactory2;

import static com.baeldung.creational.abstractfactory2.Constants.MESOZOIC_ANIMAL_DESCRIPTION;

public class MesozoicAnimalFactory implements EraAnimalFactory {
    @Override
    public Animal createAnimal(EnumAnimalType type) {
        switch (type) {
        case LAND:
            return new LandAnimal(EnumAnimalType.LAND, EnumEra.MESOZOIC, MESOZOIC_ANIMAL_DESCRIPTION);
        case SKY:
            return new SkyAnimal(EnumAnimalType.SKY, EnumEra.MESOZOIC, MESOZOIC_ANIMAL_DESCRIPTION);
        }
        return null;
    }
}
