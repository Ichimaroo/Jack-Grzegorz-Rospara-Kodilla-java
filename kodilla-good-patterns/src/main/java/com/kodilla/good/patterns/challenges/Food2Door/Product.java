package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Objects;

public class Product {
    private final String name;
    private final Producent producent;
    /**In Grosz*/
    private int price;

    public Product(String name, Producent producent, int price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price can't be 0 or less: " +
                    price + " For: " + name + " By: " + producent);
        }
        this.name = Objects.requireNonNull(name);
        this.producent = Objects.requireNonNull(producent);
        this.price = price;
    }

}
