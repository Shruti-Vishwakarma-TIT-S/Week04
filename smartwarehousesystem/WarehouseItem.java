package com.generics.smartwarehousesystem;

public class WarehouseItem {

    // Create private instances
    private String name;
    private double price;

    // Parameterised constructor
    public WarehouseItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    // To string method to convert values to String
    public String toString(){
        return "Item: " + name + " , Price: " + price;
    }

}
