package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void quantityLog() {
        Logger.getInstance().log("a1");
        Logger.getInstance().log("b2");
        Logger.getInstance().log("c3");
    }

    @Test
    public void getLastLog() {
        //Give

        //When
        String lastLog = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("c3",lastLog);
    }
}