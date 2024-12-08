package com.baeldung.functional;

import java.security.SecureRandom;
import java.util.Random;

public class MyService {

    public int getRandomNumber() {
        return (new SecureRandom().nextInt(10));
    }

}
