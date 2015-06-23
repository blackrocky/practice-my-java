package com.googlecode.practicemyjava.designpattern.builder;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class NutritionFactsTest {

    @Test
    public void should_initiate_mandatory_fields() {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(100, 10).build();
        assertThat(nutritionFacts.getServingSize(), is(100));
        assertThat(nutritionFacts.getServings(), is(10));
    }

    @Test
    public void should_initiate_mandatory_and_optional_fields() {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(100, 10).calories(200).sodium(50).build();
        assertThat(nutritionFacts.getServingSize(), is(100));
        assertThat(nutritionFacts.getServings(), is(10));
        assertThat(nutritionFacts.getCalories(), is(200));
        assertThat(nutritionFacts.getSodium(), is(50));
        assertThat(nutritionFacts.getFat(), is(0));
        assertThat(nutritionFacts.getCarbohydrate(), is(0));
    }
}