package com.amazon.ptz.util;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.Random;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class RandomAlphanumericString {
    private static final char[] CHARACTERS;
    private static final String DIGITS = "0123456789";
    private static final String LOWER;
    private static final Random RANDOM;
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    static {
        String lowerCase = UPPER.toLowerCase(Locale.ENGLISH);
        LOWER = lowerCase;
        CHARACTERS = (UPPER + lowerCase + DIGITS).toCharArray();
        RANDOM = new SecureRandom();
    }

    public static String getString(int i) {
        if (i < 1) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid attempt to generate a random alphanumeric string of length less than one");
            return null;
        }
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            char[] cArr2 = CHARACTERS;
            cArr[i2] = cArr2[RANDOM.nextInt(cArr2.length)];
        }
        return new String(cArr);
    }
}
