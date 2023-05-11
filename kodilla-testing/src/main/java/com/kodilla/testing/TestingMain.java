package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();

        int a = 2;
        int b = 5;

        int addResult = calculator.add(a, b);
        if (addResult == 7) {
            System.out.println("Test dodawania: OK");
        } else {
            System.out.println("Test dodawania: Error!");
        }
        Calculator calculator1 = new Calculator();

        int c = 10;
        int d = 20;

        int subResult = calculator1.substract(c, d);
        if (subResult == 10) {
            System.out.println("Test odejmowania: OK");
        } else {
            System.out.println("Test odejmowania: Error!");
        }
    }
}