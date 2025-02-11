package com.generics.mealplangenerator;
import java.util.List;
import java.util.ArrayList;

// Meal class
public class Meal<T extends MealPlan>{
    private List<T> meals;

    // constructor
    public Meal(){
        meals = new ArrayList<>();
    }

    // Add meal
    public void addMeal(T meal){
        meals.add(meal);
    }

    // List method to getAllMeals
    public List<? extends MealPlan> getAllMeals(){
        return meals;
    }

    // to string Method
    public String toString(){
        StringBuilder s = new StringBuilder();
        for (MealPlan meal : meals){
            s.append(meal.getMealPlanName()).append("\n");
        }
        return s.toString();
    }
}
