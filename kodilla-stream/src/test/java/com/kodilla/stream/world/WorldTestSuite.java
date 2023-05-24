package com.kodilla.stream.world;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World terra = new World();
        Continent continentNAmerica = new Continent("North America");
        Continent continentAsia = new Continent("Asia");
        Continent continentEurope = new Continent("Europe");
        Continent continentAfrica = new Continent("Africa");
        Continent continentAntarctica = new Continent("Antarctica");
        terra.addContinent(continentNAmerica);
        terra.addContinent(continentAsia);
        terra.addContinent(continentEurope);
        terra.addContinent(continentAfrica);
        terra.addContinent(continentAntarctica);

        continentNAmerica.addCountry(new Country("Canada", new BigDecimal("466666999111")));
        continentAsia.addCountry(new Country("China", new BigDecimal("999999999999999")));
        continentEurope.addCountry(new Country("Czech", new BigDecimal("333333100")));
        continentAfrica.addCountry(new Country("Kongo", new BigDecimal("10000000")));
        continentAntarctica.addCountry(new Country("New Swabia", new BigDecimal("1")));

        //When
        BigDecimal result = terra.getPeopleQuantity();

        //then
        Assertions.assertEquals(new BigDecimal("1000467010332211"), result);
    }
}