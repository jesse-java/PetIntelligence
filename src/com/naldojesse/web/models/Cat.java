package com.naldojesse.web.models;

public class Cat extends Animal implements Pet, java.io.Serializable {

    public Cat() {
        super();
    }

    public Cat(String name, String breed, double weight) {
        super(name, breed, weight);
    }

    public String showAffection() {
        return "Your " + breed + " looked at you with some affection. You think.";
    }
}
