package com.amazon.alexa.app.notification.util;

import androidx.annotation.NonNull;
import java.security.SecureRandom;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class RandomString implements CharSequence {
    private static final char[] CHARSET = "0123456789abcdef".toCharArray();
    private static final SecureRandom SECURE_RANDOM = new SecureRandom();
    private final String string;

    public RandomString(int i) {
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < i; i2++) {
            char[] cArr2 = CHARSET;
            cArr[i2] = cArr2[SECURE_RANDOM.nextInt(cArr2.length)];
        }
        this.string = new String(cArr);
    }

    public static String string() {
        return new RandomString().toString();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.string.charAt(i);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.string.length();
    }

    @Override // java.lang.CharSequence
    @NonNull
    public CharSequence subSequence(int i, int i2) {
        return this.string.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.string;
    }

    public static String string(int i) {
        return new RandomString(i).toString();
    }

    public RandomString() {
        this(32);
    }
}
