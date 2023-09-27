package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Producent producent = new Producent("ExtraFoodShop", "A0001");
        producent.putProductInMap("Tomato", 200);
        List<OrderPart>orderParts = new ArrayList<>();
        orderParts.add(new OrderPart(new Product("Tomato", producent, 10), 10, 10));
        Order order1 = new Order(producent, orderParts);
        System.out.println("Your order: " + order1.getOrderNumber() + "status: " + producent.process(order1));
    }
}
