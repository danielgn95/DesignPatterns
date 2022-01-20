package com.danieltesting.designpatterns.Decorator;

public class PlainPizza implements Pizza{


    @Override
    public String getDescription() {
        return "Thing Dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
