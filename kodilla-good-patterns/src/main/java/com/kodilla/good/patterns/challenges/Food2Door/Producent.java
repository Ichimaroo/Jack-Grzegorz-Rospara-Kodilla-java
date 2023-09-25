package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDate;
import java.util.Objects;

public class Producent {
    private final String name;
    private final LocalDate dateJoined = LocalDate.now();
    private String nip;

    public Producent(String name, String nip) {
        this.name = Objects.requireNonNull(name);
        this.nip = Objects.requireNonNull(nip);
    }
}
