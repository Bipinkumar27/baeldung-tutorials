package com.baeldung.creational.abstractfactory2;

public abstract class Animal {
    private String description;
    Animal(EnumAnimalType type, EnumEra era) {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
