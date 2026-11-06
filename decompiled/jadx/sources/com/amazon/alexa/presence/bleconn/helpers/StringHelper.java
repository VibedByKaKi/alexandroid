package com.amazon.alexa.presence.bleconn.helpers;

import java.util.Random;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class StringHelper {
    private static final Random RNG = new Random();
    private static final char[] ALPHA_DIGIT_CHARSET = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    private StringHelper() {
    }

    public static String randomString(int i, char[] cArr) {
        char[] cArr2 = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            cArr2[i2] = cArr[RNG.nextInt(cArr.length)];
        }
        return new String(cArr2);
    }

    public static String randomString(int i) {
        return randomString(i, ALPHA_DIGIT_CHARSET);
    }
}
