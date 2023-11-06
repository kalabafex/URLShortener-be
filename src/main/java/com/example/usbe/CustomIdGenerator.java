package com.example.usbe;

import java.security.SecureRandom;

public class CustomIdGenerator {

    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final SecureRandom random = new SecureRandom();

    public static String generateRandomId(int length) {
        StringBuilder id = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            id.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        return id.toString();
    }
}