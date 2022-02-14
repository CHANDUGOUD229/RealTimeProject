package com.stepchange.atf.utilities;

import java.util.concurrent.ThreadLocalRandom;

public class RandomGenerators {

    private static String emailRandomText;


    private RandomGenerators() {


    }

    public static String getRandomString() {
        if (emailRandomText == null || emailRandomText.isEmpty()) {
            emailRandomText = "test" + "";
            int a = 10000000;
            int randomNum = 0;
            randomNum = ThreadLocalRandom.current().nextInt(20, a + 1);
            emailRandomText = String.valueOf(randomNum);
            System.out.println(emailRandomText);
        }return emailRandomText;
    }



}