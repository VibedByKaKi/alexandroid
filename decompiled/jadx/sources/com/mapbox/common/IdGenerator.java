package com.mapbox.common;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class IdGenerator {
    private static final AtomicLong counter = new AtomicLong();

    public static long getNewId() {
        return counter.incrementAndGet();
    }
}
