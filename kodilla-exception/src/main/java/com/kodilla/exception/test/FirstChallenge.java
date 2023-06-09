package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            System.out.println(firstChallenge.divide(1,0));

        } catch (ArithmeticException e) {
            System.err.println("Dividing by 0!");
            e.printStackTrace();
        } finally {
            System.err.println("I'm gonna be here...always!");
        }
    }

}