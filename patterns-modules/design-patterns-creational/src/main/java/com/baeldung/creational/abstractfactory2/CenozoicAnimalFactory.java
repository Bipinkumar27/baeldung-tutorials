package com.baeldung.creational.abstractfactory2;

import static com.baeldung.creational.abstractfactory2.Constants.CENOZOIC_ANIMAL_DESCRIPTION;

/**
 * The type Cenozoic animal factory generate and returns the land/sky
 * animal of CENOZOIC era according to animal type provided
 */
public class CenozoicAnimalFactory implements EraAnimalFactory {
    @Override
    public Animal createAnimal(EnumAnimalType type) {
        switch (type) {
        case LAND:
            return new LandAnimal(EnumAnimalType.LAND, EnumEra.CENOZOIC, CENOZOIC_ANIMAL_DESCRIPTION);
        case SKY:
            return new SkyAnimal(EnumAnimalType.SKY, EnumEra.CENOZOIC, CENOZOIC_ANIMAL_DESCRIPTION);
        }
        return null;
    }
}
