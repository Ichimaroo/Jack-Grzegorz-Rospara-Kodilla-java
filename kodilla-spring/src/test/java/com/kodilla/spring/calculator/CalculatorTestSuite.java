package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //Then
        Assertions.assertEquals(4, calculator.add(2,2));
        Assertions.assertEquals(2 - 4.4, calculator.add(2,-4.4));
        Assertions.assertEquals(2, calculator.add(0,2));
        Assertions.assertEquals(0, calculator.add(0,0));
        Assertions.assertEquals(calculator.add(10,60), calculator.add(60,10));
        Assertions.assertEquals(0, calculator.sub(3,3));
        Assertions.assertEquals(-4.4 - (-2), calculator.sub(-4.4,-2));
        Assertions.assertEquals(3, calculator.sub(3,0));
        Assertions.assertNotEquals(calculator.sub(3,30), calculator.sub(30,3));
        Assertions.assertEquals(0, calculator.sub(0,0));
        Assertions.assertEquals(16, calculator.mul(4,4));
        Assertions.assertEquals(0, calculator.mul(0,4));
        Assertions.assertEquals(calculator.mul(4,3), calculator.mul(3,4));
        Assertions.assertEquals(-8.8, calculator.mul(-2.2,4));
        Assertions.assertEquals(4, calculator.mul(1,4));
        Assertions.assertEquals(5, calculator.div(10,2));
        Assertions.assertEquals(0, calculator.div(2,0));
        Assertions.assertEquals(0, calculator.div(0,2));
        Assertions.assertEquals( 0.0 / -5, calculator.div(0,-5));
        Assertions.assertEquals(2, calculator.div(2,1));
        Assertions.assertEquals(-2, calculator.div(-2,1));
        Assertions.assertEquals(2, calculator.div(-2,-1));
        Assertions.assertEquals(-3, calculator.div(9,-3));
        Assertions.assertEquals(2.5 / 4.3, calculator.div(2.5,4.3));

    }
}