package com.baeldung.creational.abstractfactory2;

import java.util.SplittableRandom;

public abstract class Animal {
    private String description;
    private String name;

    private EnumEra era;

    Animal(EnumEra era, String name, String description) {
        this.era = era;
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
