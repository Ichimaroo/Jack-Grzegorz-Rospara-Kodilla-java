package com.kodilla.patterns.singleton;

public class Settings {
    private static Settings settingsInstance = null;
    private String fileName = "";

    private Settings() {
    }

    public static Settings getInstance() {
        if (settingsInstance == null) {
            settingsInstance = new Settings();
        }
        return settingsInstance;
    }

    public String getFileName() {
        return fileName;
    }

    public void open(final String fileName) {
        this.fileName = fileName;
        System.out.println("Opening settings");
    }

    public void close() {
        this.fileName = "";
        System.out.println("Closing settings");
    }

    public boolean loadSettings() {
        System.out.println("Loading settings");
        return true;
    }

    public boolean saveSettings() {
        System.out.println("Saving settings");
        return true;
    }
}