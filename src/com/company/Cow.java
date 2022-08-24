package com.company;

public class Cow extends Animal{
    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    public void met() {
        System.out.println("menin uilarum suluu");
    }

}
