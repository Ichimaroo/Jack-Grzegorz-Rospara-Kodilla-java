package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient(Ingredients.BEEF)
                .burgers(2)
                .sauce(Sauce.STANDARD)
                .ingredient(Ingredients.CHEDAR)
                .ingredient(Ingredients.CHILLI_PEPPER)
                .roll(Roll.WITH_SESAM)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredient().size();
        //Then
        Assertions.assertEquals(3,howManyIngredients);
    }
}
