package com.kodilla.patterns.strategy.social;

public class X implements SocialPublisher {

    @Override
    public String share() {
        return "Twitter is X now";
    }
}