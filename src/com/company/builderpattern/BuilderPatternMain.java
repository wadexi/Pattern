package com.company.builderpattern;

public class BuilderPatternMain {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();


        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost： " + vegMeal.getCost());


        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\n Non-veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total cost:" + nonVegMeal.getCost());
    }
}
