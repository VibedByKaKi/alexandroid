package com.dee.app.cachemanager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final class Utils {
    private Utils() {
    }

    public static int estimateSizeOfString(String str) {
        return (str.length() * 2) + 32;
    }
}
