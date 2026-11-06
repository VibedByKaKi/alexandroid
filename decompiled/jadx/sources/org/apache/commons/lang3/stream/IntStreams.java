package org.apache.commons.lang3.stream;

import java.util.stream.IntStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class IntStreams {
    @Deprecated
    public IntStreams() {
    }

    @SafeVarargs
    public static IntStream of(int... iArr) {
        return iArr == null ? IntStream.empty() : IntStream.of(iArr);
    }

    public static IntStream range(int i) {
        return IntStream.range(0, i);
    }

    public static IntStream rangeClosed(int i) {
        return IntStream.rangeClosed(0, i);
    }
}
