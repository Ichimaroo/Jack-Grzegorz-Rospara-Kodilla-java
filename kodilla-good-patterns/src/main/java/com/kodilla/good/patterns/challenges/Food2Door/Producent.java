package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Producent {
    private final String name;
    private final LocalDate dateJoined = LocalDate.now();
    private String nip;

    private final Map<String, Integer> productMap = new HashMap<>();

    public void putProductInMap(String name, Integer quantity) {

        productMap.put(name, quantity);
    }

    public Producent(String name, String nip) {
        this.name = Objects.requireNonNull(name);
        this.nip = Objects.requireNonNull(nip);
    }
    public boolean process(Order order) {
        if (order == null) {
            return false;
        }
        for (OrderPart orderPart : order.getOrderParts()) {
            if (orderPart.getQuantity() > productMap.get(orderPart.getProduct().getName())) {
                return false;
            }
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public String getNip() {
        return nip;
    }

    public Map<String, Integer> getProductMap() {
        return productMap;
    }

}
