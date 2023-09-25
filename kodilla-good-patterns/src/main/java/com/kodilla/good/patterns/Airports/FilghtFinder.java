package com.kodilla.good.patterns.Airports;

public class FilghtFinder {
    public static void main(String[] args) {

        AirportsInfo flightBase = new AirportsInfo();
        Flight flight = new Flight("Boombay", "Kyoto");

        System.out.println(flightBase.findConnectingFlight("Miami", "Kigali"));
        System.out.println(flightBase.findConnectingFlight("A", "C"));
        System.out.println(flightBase.findAllFlightsToThisCity("Berlin"));
        System.out.println(flightBase.findAllFlightsFromThisCity("Miami"));
    }
}
