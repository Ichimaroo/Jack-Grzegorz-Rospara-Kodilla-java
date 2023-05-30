package com.kodilla.exception.test;

import net.bytebuddy.NamingStrategy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SecondChallengeTest {
    SecondChallenge secondChallenge;
    @BeforeEach
    public void prepare() {
        secondChallenge = new SecondChallenge();
    }
    @Test
    public void allIsGoodTest() throws Exception {
        //When
        String result = secondChallenge.probablyIWillThrowException(1.5, 0);
        //Then
        assertEquals("Done!", result);
    }
    @Test
    public void givenX2Exception() {
        //When & Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0, 2.0));
    }
    @Test
    public void givenX1_99999999NoException() throws Exception {
        //When
        String result = secondChallenge.probablyIWillThrowException(1.99999999, 0);
        //then
        assertEquals("Done!", result);
    }
    @Test
    public void givenX1NoException() throws Exception{
        //When
        String result = secondChallenge.probablyIWillThrowException(1.0, 0);
        //then
        assertEquals("Done!", result);
    }
    @Test
    public void givenX0_99999999Exception(){
        //When & Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.99999999, 2.0));
    }

}
