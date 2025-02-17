package com.annotation.exercise;

// Create a class named Dog that extends Animal
class Dog extends Animal {

    // Use the @Override annotation to override the makeSound method in Animal
    @Override
    public void makeSound() {
        // Print a message when makeSound is called in Dog
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        // Create an instance of Dog
        Dog dog = new Dog();

        // Call the makeSound method
        dog.makeSound();
    }
}
