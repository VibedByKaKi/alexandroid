package org.apache.thrift.orig.transport;

import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class AutoExpandingBuffer {
    private byte[] array;

    public AutoExpandingBuffer(int i) {
        this.array = new byte[i];
    }

    public byte[] array() {
        return this.array;
    }

    public void resizeIfNecessary(int i) {
        int length = this.array.length;
        if (length < i) {
            this.array = Arrays.copyOf(this.array, Math.max(length + (length >> 1), i));
        }
    }
}
