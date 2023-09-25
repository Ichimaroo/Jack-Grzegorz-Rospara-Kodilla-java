package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Objects;

public class OrderPart {

    private Product product;
    private int quantity;
    private long orderNumber; // ToDo delete if no reference to order is needed

    public OrderPart(Product product, int quantity, long orderNumber) {
        if (orderNumber <= 0 ) {
            String warning = "Order number: " + orderNumber + " can't be 0 or less." +
                    " Product type: " + product;
            System.err.println(warning);
            throw new IllegalArgumentException(warning);
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity cant be 0 or less: " + quantity + " In order number: "
                    + orderNumber + " Product type: " + product);
        }
        this.product = Objects.requireNonNull(product);
        this.quantity = quantity;
        this.orderNumber = orderNumber;
    }
    public Product getProduct() {
        return product;
    }
    public int getQuantity() {
        return quantity;
    }
    public long getOrderNumber() {
        return orderNumber;
    }
}
