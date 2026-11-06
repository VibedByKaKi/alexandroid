package org.tensorflow.lite;

import java.io.Closeable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public interface Delegate extends Closeable {
    long getNativeHandle();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
    }
}
