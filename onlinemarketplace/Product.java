package com.generics.onlinemarketplace;

// Class product for T datatype
public class Product <T>{

    // instance variables

    private String name;
    private double price;
    private T category;

    // Constructor
    public Product(String name, double price, T category){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // setter and getter for price
    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    // To string method
    @Override
    public String toString(){
        return "Name: "+ name + "   |   Price: " + price + "    |    Category: " + category.getClass().getSimpleName();

    }
}
