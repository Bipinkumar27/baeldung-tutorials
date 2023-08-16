package com.baeldung.creational.abstractfactory2;

public class AbstractAnimalFactory {

    public static EraAnimalFactory getAnimalFactory(EnumEra era) {

        switch (era) {
        case CENOZOIC:
            return new CenozoicAnimalFactory();
        case MESOZOIC:
            return new MesozoicAnimalFactory();
        }
        return null;
    }
}
