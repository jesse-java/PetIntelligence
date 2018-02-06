package com.naldojesse.web.models;

abstract public class Animal implements java.io.Serializable{
    protected String name;
    protected String breed;
    protected double weight;

    public Animal() {
        name = null;
        breed = null;
        weight = 0.0;
    }

    public Animal(String name, String breed, double weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
