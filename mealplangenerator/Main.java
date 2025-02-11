package com.generics.mealplangenerator;

public class Main {

    // Main method
    public static void main(String[] args) {

        // Instance of Meal class
        Meal<VegetarianMeal> vegetarianMeals = new Meal<>();
        Meal<VeganMeal> veganMeals = new Meal<>();
        Meal<KetoMeal> ketoMeals = new Meal<>();
        Meal<HighProteinMeal> highProteinMeals = new Meal<>();

        // Instance of all other classes
        VegetarianMeal vegetarianMeal = new VegetarianMeal();
        VeganMeal veganMeal = new VeganMeal();
        KetoMeal ketoMeal = new KetoMeal();
        HighProteinMeal highProteinMeal = new HighProteinMeal();

        // Methods to generate mealplan
        MealPlanGenerator.generateMealPlan(vegetarianMeals, vegetarianMeal);
        MealPlanGenerator.generateMealPlan(veganMeals, veganMeal);
        MealPlanGenerator.generateMealPlan(ketoMeals, ketoMeal);
        MealPlanGenerator.generateMealPlan(highProteinMeals, highProteinMeal);

        // Print meals
        System.out.println("\nAll Vegetarian Meals:\n" + vegetarianMeals);
        System.out.println("All Vegan Meals:\n" + veganMeals);
        System.out.println("All Keto Meals:\n" + ketoMeals);
        System.out.println("All High-Protein Meals:\n" + highProteinMeals);
    }
}
