package com.bumptech.glide.util.pool;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final class GlideTrace {
    private static final AtomicInteger COOKIE_CREATOR = null;
    private static final int MAX_LENGTH = 127;
    private static final boolean TRACING_ENABLED = false;

    private GlideTrace() {
    }

    public static int beginSectionAsync(String str) {
        return -1;
    }

    private static String truncateTag(String str) {
        return str.length() > 127 ? str.substring(0, 126) : str;
    }

    public static void beginSectionFormat(String str, Object obj, Object obj2) {
    }

    public static void beginSectionFormat(String str, Object obj, Object obj2, Object obj3) {
    }

    public static void endSection() {
    }

    public static void beginSection(String str) {
    }

    public static void beginSectionFormat(String str, Object obj) {
    }

    public static void endSectionAsync(String str, int i) {
    }
}
