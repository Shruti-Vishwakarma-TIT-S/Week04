package com.generics.onlinemarketplace;

public class Main {

    // Main method
    public static void main(String[] args) {

        // Object of classes are create dto insert values
        Product<BookCategory> book = new Product<>("The story of my life", 566.3, new BookCategory());
        Product<ClothingCategory> cloth = new Product<>("Jeans" , 4112.56, new ClothingCategory());
        Product<FootwearCategory> footwear = new Product<>("High Heels", 5811.81, new FootwearCategory());

        // Before discount the prices are
        System.out.println("Before Discount ");
        System.out.println(book);
        System.out.println(cloth);
        System.out.println(footwear);

        // Discount the prices
        Discount.applyDiscount(book, 15);
        Discount.applyDiscount(cloth, 45);
        Discount.applyDiscount(footwear, 75);

        // Discount prices are
        System.out.println("\nAfter Discount ");
        System.out.println(book);
        System.out.println(cloth);
        System.out.println(footwear);
    }
}
