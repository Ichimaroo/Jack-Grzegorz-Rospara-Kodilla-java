package com.kodilla.good.patterns.Airports;

import java.util.*;
import java.util.stream.Collectors;

public class AirportsInfo {
    private final List<Flight> base = new ArrayList<>();

    public AirportsInfo() {
        addFlightToBase();
    }

    private void addFlightToBase() {
        base.add(new Flight("Boombay", "Tokyo"));
        base.add(new Flight("Miami", "New York"));
        base.add(new Flight("Kigali", "Berlin"));
        base.add(new Flight("Kiev", "Paris"));
        base.add(new Flight("Paris", "Berlin"));
        base.add(new Flight("London", "Kyoto"));
        base.add(new Flight("Miami", "San Francisco"));
        base.add(new Flight("Berlin", "New York"));
        base.add(new Flight("Kigali", "Kampala"));
        base.add(new Flight("Kraków", "London"));
        base.add(new Flight("A", "B"));
        base.add(new Flight("B", "C"));
        base.add(new Flight("A", "BB"));
        base.add(new Flight("BB", "C"));
    }

    public List<List<Flight>> findConnectingFlight(final String departureAirport, String arrivalAirport) {
        List<List<Flight>> results = new ArrayList<>();
        List<Flight> flightsWithAMatchingDepartureAirport = base.stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());

        List<Flight> flightsWithAMatchingArrivalAirport = base.stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());

        for (Flight flight1 : flightsWithAMatchingDepartureAirport) {
            for (Flight flight2 : flightsWithAMatchingArrivalAirport) {
                if (flight1.getArrivalAirport().equals(flight2.getDepartureAirport())) {
                    List<Flight> flightConnector = new ArrayList<>();
                    flightConnector.add(flight1);
                    flightConnector.add(flight2);
                    results.add(flightConnector);
                }
            }
        }
        return results;
    }
    public Set<Flight> findAllFlightsToThisCity(String city) {
        return base.stream()
                .filter(flight -> flight.getArrivalAirport().equals(city))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findAllFlightsFromThisCity(String city) {
        return base.stream()
                .filter(flight -> flight.getDepartureAirport().equals(city))
                .collect(Collectors.toSet());
    }

    @Override
    public String toString() {
        return "AirportsInfo{" +
                "base=" + base +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirportsInfo that = (AirportsInfo) o;
        return Objects.equals(base, that.base);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base);
    }
}
