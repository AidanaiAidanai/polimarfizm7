package com.company;

import java.util.Calendar;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void met() {
        System.out.println(getName()+" tamat jeit");
    }



}
