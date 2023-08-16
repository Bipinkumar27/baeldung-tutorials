package com.baeldung.creational.abstractfactory2;

/**
 * The type Abstract animal factory act as factory of factory
 */
public class AbstractAnimalFactory {

    /**
     * Gets animal factory.
     *
     * @param era the era
     * @return the animal factory
     */
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
