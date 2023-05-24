package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] array = {130, 20, 30, 90, 10, 20, 30};
        //When
        double result = ArrayOperations.getAverage(array);
        //Then
        Assertions.assertEquals(47.142857142857146, result);
    }
}
