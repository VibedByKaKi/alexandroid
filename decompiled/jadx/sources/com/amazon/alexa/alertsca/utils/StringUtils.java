package com.amazon.alexa.alertsca.utils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class StringUtils {
    public static final String EMPTY = "";

    private StringUtils() {
    }

    public static String getLastPart(String str, int i) {
        return str == null ? "" : str.substring(str.lastIndexOf(i) + 1);
    }
}
