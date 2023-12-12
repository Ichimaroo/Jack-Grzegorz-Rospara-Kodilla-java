package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class SettingsTestSuite {

    @BeforeClass
    public static void openSettingsFile() {
        Settings.getInstance().open("myapp.settings");
    }

    @AfterClass
    public static void closeSettingsFile() {
        Settings.getInstance().close();
    }

    @Test
    public void testGetFileName() {
        //Given
        //When
        String fileName = Settings.getInstance().getFileName();
        System.out.println("Opened: " + fileName);
        //Then
        Assert.assertEquals("myapp.settings", fileName);
    }

    @Test
    public void testLoadSettings() {
        //Given
        //When
        boolean result = Settings.getInstance().loadSettings();
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testSaveSettings() {
        //Given
        //When
        boolean result = Settings.getInstance().saveSettings();
        //Then
        Assert.assertTrue(result);
    }
}