package com.example.android.inclassassignment06_johnb;

import java.io.Serializable;

public class Dino implements Serializable {
    private int numberOfLegs;
    private String name;
    private boolean hasWings;
    private String diet;

    public Dino(String name) {
        this.name = name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasWings() {
        return hasWings;
    }

    public void setHasWings(boolean hasWings) {
        this.hasWings = hasWings;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    @Override
    public String toString(){
        return "Name: " + name + "\nDiet Type: " + diet + "\nDoes it have wings? " + hasWings + "\nNumber of legs: " + numberOfLegs;
    }
}
