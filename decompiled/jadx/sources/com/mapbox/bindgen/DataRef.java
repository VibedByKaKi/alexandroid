package com.mapbox.bindgen;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class DataRef {

    @NonNull
    private ByteBuffer buffer;

    @Nullable
    private DataRefPeerCleaner cleaner;
    private long peer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DataRefPeerCleaner implements Runnable {
        private long peer;

        public DataRefPeerCleaner(long j) {
            this.peer = j;
        }

        public synchronized void replace(long j) {
            try {
                long j2 = this.peer;
                if (j2 != 0) {
                    DataRef.cleanNativePeer(j2);
                }
                this.peer = j;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            long j = this.peer;
            if (j != 0) {
                DataRef.cleanNativePeer(j);
                this.peer = 0L;
            }
        }
    }

    public DataRef(@NonNull ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            this.buffer = byteBuffer;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Buffer must be an instance of class java.nio.DirectByteBuffer(created by ByteBuffer#allocateDirect() or JNI#NewDirectByteBuffer()).");
            throw null;
        }
    }

    public static DataRef allocateNative(int i) {
        if (i >= 0) {
            return allocateNativeMemory(i);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Buffer size must be a non-negative integer");
        return null;
    }

    public static native DataRef allocateNativeMemory(int i);

    public static native void cleanNativePeer(long j);

    private void setPeerWithLifetime(long j, Object obj) {
        this.peer = j;
        DataRefPeerCleaner dataRefPeerCleaner = this.cleaner;
        if (dataRefPeerCleaner != null) {
            dataRefPeerCleaner.replace(j);
            return;
        }
        DataRefPeerCleaner dataRefPeerCleaner2 = new DataRefPeerCleaner(j);
        this.cleaner = dataRefPeerCleaner2;
        CleanerService.register(obj, dataRefPeerCleaner2);
    }

    @NonNull
    public ByteBuffer getBuffer() {
        return this.buffer.duplicate();
    }

    private DataRef(long j, @NonNull ByteBuffer byteBuffer) {
        this.buffer = byteBuffer;
        setPeerWithLifetime(j, byteBuffer);
    }
}
