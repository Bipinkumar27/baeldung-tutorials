package com.baeldung.creational.abstractfactory2;

import com.baeldung.creational.abstractfactory2.EnumAnimalType;
import com.baeldung.creational.abstractfactory2.EnumEra;

public abstract class Animal1 {
    private String description;
    Animal1(EnumAnimalType type, EnumEra era) {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
