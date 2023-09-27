package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.List;
import java.util.Objects;

public class Order {
    private static long previousOrderNumber = 0;
    private final Producent producent;

    private final List<OrderPart> orderParts;

    private final long orderNumber;


    public Order(Producent producent, List<OrderPart> orderParts) {
        this.producent = Objects.requireNonNull(producent);
        this.orderParts = Objects.requireNonNull(orderParts);
        if (orderParts.isEmpty()) {
            throw new IllegalArgumentException("Order part list can not be empty!");
        }
        orderNumber = previousOrderNumber + 1;
        previousOrderNumber = orderNumber;

    }

    public List<OrderPart> getOrderParts() {
        return orderParts;
    }

    public long getOrderNumber() {
        return orderNumber;
    }
}
