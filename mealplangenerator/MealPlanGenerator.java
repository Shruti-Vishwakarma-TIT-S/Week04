package com.generics.mealplangenerator;

public class MealPlanGenerator {

    // Method to generate mealPlanName
    public static <T extends MealPlan> void generateMealPlan(Meal<T> meal, T mealType){
        boolean a = mealType instanceof VegetarianMeal;
        boolean b = mealType instanceof VeganMeal;
        boolean c = mealType instanceof KetoMeal;
        boolean d = mealType instanceof HighProteinMeal;

        // Selective statements to validate meals
        if (a || b || c || d){
            System.out.println("Meal Plan Generated: "+ mealType.getMealPlanName());
        }
        else
            System.out.println("Invalid meal plan Name ");
    }
}
