package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int uniqID;
    private final String name;
    private final int numberOfPosts;
    private final LocalDate birthDate;
    private final char gender;

    public ForumUser(int uniqID, String name, int numberOfPosts, LocalDate birthDate, char gender) {
        this.uniqID = uniqID;
        this.name = name;
        this.numberOfPosts = numberOfPosts;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public int getUniqID() {
        return uniqID;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqID=" + uniqID +
                ", name='" + name + '\'' +
                ", numberOfPosts=" + numberOfPosts +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                '}';
    }
}
