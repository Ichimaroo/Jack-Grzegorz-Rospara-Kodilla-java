package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User millenials = new Millenials("Jaroslaw");
        User yGeneration = new YGeneration("Donald");
        User zGeneration = new ZGeneration("Zbigniew");

        //When
        String mSocialPublisher = millenials.sharePost();
        System.out.println("Jaroslaw speak: " + mSocialPublisher);
        String ySocialPublisher = yGeneration.sharePost();
        System.out.println("Donald speak: " + ySocialPublisher);
        String zSocialPublisher = zGeneration.sharePost();
        System.out.println("Zbigniew speak: " + zSocialPublisher);

        //Then
        Assert.assertEquals("Twitter is X now", mSocialPublisher);
        Assert.assertEquals("Facebook is now Meta", ySocialPublisher);
        Assert.assertEquals("Snapchat - oh Snap!", zSocialPublisher);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User millenials = new Millenials("Jaroslaw");

        //When
        String mSocialPublisher = millenials.sharePost();
        System.out.println("Jaroslaw speak: " + mSocialPublisher);
        millenials.setSocialPublisher(new FacebookPublisher());
        mSocialPublisher = millenials.sharePost();
        System.out.println("Jaroslaw now speak: " + mSocialPublisher);

        //Then
        Assert.assertEquals("Facebook is now Meta", mSocialPublisher);
    }
}