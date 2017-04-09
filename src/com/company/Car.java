package com.company;

/**
 * Created by flatironschool on 4/9/17.
 */

//you can update a model using a method
    // this is analogous to getter and setter methods in ruby.
    //declaring the attribute (field) as private means you cannot directly call the set model method
    //thus, create a public setter method.

    //EX: porsche.model = "Carrera";
    //error -> model has private access in com.company.Car

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //setter method
    public void setModel(String model){
        this.model = model;
    }

    //getter method
    public String getModel(){
        return this.model;
    }
}
