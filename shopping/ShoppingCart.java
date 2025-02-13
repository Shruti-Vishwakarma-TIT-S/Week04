package com.collections.shopping;

import java.util.*;

public class ShoppingCart {

    // Using HashMap to store product prices
    private Map<Product, Integer> productPrices = new HashMap<>();

    // Using LinkedHashMap to maintain the order of items added
    private Map<Product, Integer> orderedCart = new LinkedHashMap<>();

    // Method to add a product to the cart
    public void addProduct(Product product, int quantity) {
        // Add the product to HashMap
        productPrices.put(product, productPrices.getOrDefault(product, 0) + quantity);

        // Add the product to LinkedHashMap
        orderedCart.put(product, orderedCart.getOrDefault(product, 0) + quantity);
    }

    // Method to display cart items in the order they were added
    public void displayOrderedCart() {
        System.out.println("Shopping Cart (Order of Items Added):");
        for (Map.Entry<Product, Integer> entry : orderedCart.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " units");
        }
    }

    // Method to display items sorted by price using TreeMap
    public void displayItemsSortedByPrice() {
        // Create a TreeMap to store products sorted by price
        TreeMap<Product, Integer> sortedByPrice = new TreeMap<>(Comparator.comparing(Product::getPrice));
        sortedByPrice.putAll(productPrices);

        System.out.println("Shopping Cart (Sorted by Price):");
        for (Map.Entry<Product, Integer> entry : sortedByPrice.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " units");
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Create sample products
        Product product1 = new Product("Apple", 1.50);
        Product product2 = new Product("Banana", 0.75);
        Product product3 = new Product("Orange", 1.25);

        // Add products to the cart
        cart.addProduct(product1, 3);
        cart.addProduct(product2, 5);
        cart.addProduct(product3, 2);

        // Display cart items in the order they were added
        cart.displayOrderedCart();

        // Display items sorted by price
        cart.displayItemsSortedByPrice();
    }
}
