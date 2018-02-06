package com.naldojesse.web.models;

public class Dog extends Animal implements Pet, java.io.Serializable{

    public Dog() {
        super();
    }

    public Dog(String name , String breed, double weight) {
        super(name, breed, weight);
    }

    public String showAffection() {
//        return "This dog is showing affection!";
        if (weight < 30) {
            return name + " hopped into your lap and cuddled with you.";
        } else {
            return name + " curled up next to you.";
        }
    }
}
