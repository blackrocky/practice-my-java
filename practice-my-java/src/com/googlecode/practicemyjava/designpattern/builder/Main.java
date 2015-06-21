package com.googlecode.practicemyjava.designpattern.builder;

public class Main {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(100, 10).calories(200).sodium(50).build();
        System.out.println(nutritionFacts);
    }
}
